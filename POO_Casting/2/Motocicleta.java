public class Motocicleta extends Veiculo{
  private int cilindrada;

  public Motocicleta(int passageiros, int combustivel, float rendimento, int cilindrada){
    super(passageiros, combustivel, rendimento);
    this.cilindrada = cilindrada;
  }

  @Override
  public float autonomia(){
    return (this.combustivel * this.rendimento)/this.passageiros;
  }

  public int getCilidrada(){
    return cilindrada;
  }

  public void setCilidrada(int cilindrada){
    this.cilindrada = cilindrada;
  }
}
