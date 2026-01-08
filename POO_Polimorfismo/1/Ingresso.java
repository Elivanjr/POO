public class Ingresso{
	protected Double valor;
	
	public Ingresso(Double valor){
		this.valor = valor;
	}
	
	public String mostraValor(){
		return "O valor do ingresso é: " + String.format("%.2f", this.valor);
	}
	
	public Double getValor(){
		return valor;
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
}
