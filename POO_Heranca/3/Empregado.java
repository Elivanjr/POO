public class Empregado extends Pessoa{
  //Atributos;
  private Setor setor;
  private float salarioBase;
  private float imposto;

  //getters & setters
  public Setor getSetor() {
    return setor;
  }
  
  public void setSetor(Setor setor) {
    this.setor = setor;
  }

  public float getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(float salarioBase) {
    this.salarioBase = salarioBase;
  }

  public float getImposto() {
    return imposto;
  }

  public void setImposto(float imposto) {
    this.imposto = imposto;
  }
}


