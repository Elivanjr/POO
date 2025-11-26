public class Empregado extends Pessoa {
	//Atributos
	protected int codigoSetor;
	protected float salarioBase;
	protected float imposto;
	
	//Contrutor
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto){
		super(nome, endereco, telefone); //chama o construtor da Super Classe Pessoa;
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//Métodos
	public float calculaSalario(){
		return this.salarioBase - this.imposto;
	}
	
	//Getters & Setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
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
