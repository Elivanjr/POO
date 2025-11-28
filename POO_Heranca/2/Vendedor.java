public class Vendedor extends Empregado{
	private float totalDeVendas;
	private float comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float totalDeVendas, float comissao){
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
		
	public float calculaSalario(){
		return ((salarioBase - imposto) + totalDeVendas * comissao);
	}
	
	public float getTotalDeVendas(){
		return totalDeVendas;
	}
	
	public void setTotalDeVendas(float totalDeVendas){
		this.totalDeVendas = totalDeVendas;
	}
	
	public float getComissao(){
		return comissao;
	}
	
	public void setComissao(float comissao){
		this.comissao = comissao;
	}
}
