public class Pessoa {
	//Atributos
	private String nome;
	private String cpf;
	private String endereco;
	private Double renda;
	
	//Construtor
	public Pessoa(String nome, String cpf, String endereco, Double renda){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.renda = renda;
	}
	
	//Métodos
	public String informacoes(){
		String aux = "Nome: " + this.nome + "CPF: " + this.cpf + "Endereço: " + this.endereco + "Renda: " + this.renda;
		return aux;
	}
	
	//Getters e Setters
	public String getNome(){
		return nome;
	}
	
	public void setCliente(String nome){
		this.nome = nome;
	}
	
	public String getCPF(){
		return cpf;
	}
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public Double getRenda(){
		return renda;
	}
	
	public void setRenda(Double renda){
		this.renda = renda;
	}
}


