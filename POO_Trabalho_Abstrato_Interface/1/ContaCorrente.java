public class ContaCorrente extends ContaBancaria{
  private Double limite;

  public ContaCorrente(int numeroConta, String titular, Double saldo, Double limite){
    super(numeroConta, titular, saldo);
    this.limite = limite;
  }

  @Override
  public void sacar(Double valor){
    if(valor <= limite + saldo){
      this.saldo -= valor;
    }
  }

  public Double getLimite(){
    return this.limite;
  }
}
