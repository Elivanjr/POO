public class ContaCorrente{
	
	private String cliente;
	private int numero, senha;
	private Double saldo;
	
	public ContaCorrente(int numero, String cliente){
		this.saldo = 0.0;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getSenha(){
		return senha;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public boolean cadastrarSenha(int senha){
		if(this.senha == 0){
			this.senha = senha;
			return true;
		}
		return false; 
	}
	
	public boolean alterarSenha(int senha, int novaSenha){
		if(senha == this.senha){
			this.senha = novaSenha;
			return true;
		}
		return false;
	}
	
	public boolean debitar(int senha, Double valor){
		if(senha == this.senha && this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String consultaSaldo(int senha){
		String resultado;
		if(senha == this.senha){
			resultado = "Cliente: " + this.cliente + " Saldo: " + this.saldo;
			System.out.println(resultado);
			return resultado;
		}else{
			resultado = "SENHA INVÁLIDA!!!!";
			System.out.println(resultado);
			return resultado;
		}
	}
	
}

