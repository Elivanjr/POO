public class ContaPoupanca extends ContaBancaria{
  private Double taxaRendimento;

  public ContaPoupanca(int numeroConta, String titular, Double saldo, Double taxaRendimento){
    super(numeroConta, titular, saldo);
    this.taxaRendimento = taxaRendimento;
  }

  @Override
  public void sacar(Double valor){
    if(valor <= saldo)
      saldo -= valor;
  }

  public Double getTaxaRendimento(){
    return this.taxaRendimento;
  }
}
