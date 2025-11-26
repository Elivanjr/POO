public class Fornecedor extends Pessoa {
	//Atributos
	private Double credito;
	private Double divida;
	
	//Construtor
	public Fornecedor(String nome, String endereco, String telefone, Double credito, Double divida){
		super(nome, endereco, telefone); //chama o construtor da Super Classe Pessoa;
		this.credito = credito;
		this.divida = divida;
	}
	
	//Métodos
	public Double obterSaldo(){
		return this.credito - this.divida;
	}
	
	//Getters & Setters;
	public Double getCredito(){
		return credito;
	}
	
	public void setCredito(Double credito){
		this.credito = credito;
	}
	
	public Double getDivida(){
		return divida;
	}
	
	public void setDivida(Double divida){
		this.divida = divida;
	}
}
