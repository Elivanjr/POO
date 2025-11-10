public class ContaBancaria {
	//Atributos
	private Pessoa cliente;
	private int numeroConta;
	private Double saldo;
	
	//Construtor
	public ContaBancaria(Pessoa cliente, int numeroConta){
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}
	
	//Métodos
	public boolean sacar(float saque){
		if(saque <= this.saldo && saque > 0){
			this.saldo -= saque;
			return true;
		}
		return false;
	}
	
	public boolean depositar(float deposito){
		if(deposito > 0){
			this.saldo += deposito;
			return true;
		}
		return false;
	}
	
	//Getters e Setters
	public Pessoa getCliente(){
		return cliente;
	}
	
	public void setCliente(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public int getNumeroConta(){
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta){
		this.numeroConta = numeroConta;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
}

