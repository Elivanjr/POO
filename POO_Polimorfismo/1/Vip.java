public class Vip extends Ingresso{
	protected Double adicional;
	
	public Vip(Double valor, Double adicional){
		super(valor);
		this.adicional = adicional;
	}
	
	@Override
	public String mostraValor(){
		return "O valor do ingresso é: " + String.format("%.2f", this.valor + this.adicional);
	}
	
	public Double getAdicional(){
		return adicional;
	}
	
	public void setAdicional(){
		this.adicional = adicional;
	}
}
