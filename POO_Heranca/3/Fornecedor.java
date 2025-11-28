public class Fornecedor extends Pessoa{
  //Atributos
  private float credito;
  private float divida;

  public float obterSaldo(){
    return this.credito - this.divida;
  }

  public float getCredito(){
    return credito;
  }

  public void setCredito(float credito){
    this.credito = credito;
  }

  public float getDivida(){
    return divida;
  }

  public void setDivida(float divida){
    this.divida = divida;
  }
}
