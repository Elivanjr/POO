public abstract class ContaBancaria{
  protected int numeroConta;
  protected String titular;
  protected Double saldo;

  public ContaBancaria(int numeroConta, String titular, Double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
  }

  public void depositar(Double valor){
    this.saldo += valor;
  }

  public abstract void sacar(Double valor);

  public int getNumeroConta(){
    return this.numeroConta;
  }

  public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
  }

  public String getTitular(){
    return this.titular;
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public Double getSaldo(){
    return this.saldo;
  }
}
