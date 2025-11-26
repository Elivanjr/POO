public class Fornecedor extends Pessoa {
	//Atributos
	private float credito;
	private float divida;
	
	//Construtor
	public Fornecedor(String nome, String endereco, String telefone, float credito, float divida){
		super(nome, endereco, telefone); //chama o construtor da Super Classe Pessoa;
		this.credito = credito;
		this.divida = divida;
	}
	
	//Métodos
	public float obterSaldo(){
		return this.credito - this.divida;
	}
	
	//Getters & Setters;
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
