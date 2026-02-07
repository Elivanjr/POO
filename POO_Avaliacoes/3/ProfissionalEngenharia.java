public class ProfissionalEngenharia{
	protected String nome;
	protected int anosExperiencia;
	protected double valorHora;
	
	public ProfissionalEngenharia(String nome, int anosExperiencia, double valorHora){
		this.nome = nome;
		this.anosExperiencia = anosExperiencia;
		this.valorHora = valorHora;	
	}
	
	public String exibirStatus(){
		return "Experiência: " + anosExperiencia + " anos / Valor/Hora: R$ " + valorHora;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getAnosExperiencia(){
		return anosExperiencia;
	}
	
	public void setAnosExperiencia(int anosExperiencia){
		this.anosExperiencia = anosExperiencia;
	}
	
	public double getValorHora(){
		return valorHora;
	}
	
	public void setValorHora(double valorHora){
		this.valorHora = valorHora;
	}
}
