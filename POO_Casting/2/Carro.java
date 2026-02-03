public class Carro extends Veiculo{
  protected boolean cambioAutomatico;

  public Carro(int passageiros, int combustivel, float rendimento, int cilindrada){
    super(passageiros, combustivel, rendimento);
    this.cambioAutomatico = cambioAutomatico;
  }

  @Override
  public float autonomia(){
    if(!this.cambioAutomatico){
      return (this.combustivel * this.rendimento);
    }
    return (this.combustivel * this.rendimento * 0.75);
  }

  public boolean getCambioAutomatico(){
    return cambioAutomatico;
  }

  public void setCambioAutomatico(boolean cambioAutomatico){ 
    this.cambioAutomatico = cambioAutomatico;
  }
}
