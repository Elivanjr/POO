public class Operario extends Empregado{
	private float valorDeProducao;
	private float comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorDeProducao, float comissao){
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorDeProducao = valorDeProducao;
		this.comissao = comissao;
	}
	
	public float calculaSalario(){
		return ((salarioBase - imposto) + valorDeProducao * comissao);
	}
	
	public float getValorDeProducao(){
		return valorDeProducao;
	}
	
	public void setValorDeProducao(float valorDeProducao){
		this.valorDeProducao = valorDeProducao;
	}
	
	public float getComissao(){
		return comissao;
	}
	
	public void setComissao(float comissao){
		this.comissao = comissao;
	}
}
