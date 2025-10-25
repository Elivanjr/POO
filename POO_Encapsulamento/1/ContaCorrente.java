public class ContaCorrente{
	
	private String cliente;
	private int numero, senha = 0;
	private Double saldo = 0.0;
	
	public ContaCorrente(int numero, String cliente){
		this.numero = numero;
		this.cliente = cliente;
	}
		
	public boolean cadastrarSenha(int senha){
		if(this.senha == 0){
			this.senha = senha;
			System.out.println("Senha cadastrada com sucesso!");
			return true;
		}
		System.out.println("Erro: Senha já existente!");
		return false; 
	}
	
	public boolean alterarSenha(int senha, int novaSenha){
		if(senha != this.senha){
			System.out.println("Senha incorreta: impossivel prosseguir...");
			return false;
		}
		if(novaSenha == senha){
			System.out.println("A nova senha não pode ser a mesma...");
			return false;
		}
		this.senha = novaSenha;
		System.out.println("Senha alterada com sucesso...");
		return true;
	}
	
	public boolean debitar(int senha, Double valor){
		if(valor <= 0.0) return false;
		if(senha == this.senha && this.saldo >= valor){
			this.saldo -= valor;
			System.out.printf("Valor debitado: %.2f\n", valor);
			return true;
		}else{
			System.out.println("Senha incorreta...");
			return false;
		}
	}
	
	public boolean creditar(int senha, Double valor){
		if(valor <= 0.0) return false;
		if(senha == this.senha){
			this.saldo += valor;
			System.out.printf("Valor creditado: %.2f\n", valor);
			return true;
		}else{
			System.out.println("Senha incorreta...");
			return false;
		}
	}
	
	public String consultaSaldo(int senha){
		String resultado;
		if(senha == this.senha){
			resultado = "Cliente: " + this.cliente + "\nSaldo: R$" + String.format("%.2f", this.saldo);
			System.out.println(resultado);
			return resultado;
		}else{
			resultado = "SENHA INVÁLIDA!!!!";
			System.out.println(resultado);
			return resultado;
		}
	}
	
	public String getCliente(){
		return this.cliente;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public int getNumero(){
		return this.numero;
	}
}

