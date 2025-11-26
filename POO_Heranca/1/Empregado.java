public class Empregado extends Pessoa {
	//Atributos
	protected int codigoSetor;
	protected Double salarioBase;
	protected Double imposto;
	
	//Contrutor
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, Double salarioBase, Double imposto){
		super(nome, endereco, telefone); //chama o construtor da Super Classe Pessoa;
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	//Métodos
	public Double calculaSalario(){
		return this.salarioBase - this.imposto;
	}
	
	//Getters & Setters
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
 }
