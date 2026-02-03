public class Hatch extends Carro{
  private int bagageiro;

  public Hatch(int passageiros, int combustivel, int rendimento, boolean cambioAutomatico, int bagageiro){
    super(passageiros, combustivel, rendimento, cambioAutomatico);
    this.bagageiro = bagageiro;
  }

  public float calculaVolume(int passageiros){
    if(passageiros < 3){

    }
  }
}
