public class CamaroteInferior extends Vip{
	private String localizacao;
	
	public CamaroteInferior(Double valor, Double adicional, String localizacao){
		super(valor, adicional);
		this.localizacao = localizacao;
	}
	
	@Override
	public String mostraValor(){
		if(this.localizacao.equalsIgnoreCase("Lateral")){
			return "O valor do ingresso é: " + String.format("%.2f", this.valor + this.adicional + (this.valor * 0.20));
		}else if(this.localizacao.equalsIgnoreCase("Frontal")){
			return "O valor do ingresso é: " + String.format("%.2f", this.valor + this.adicional + (this.valor * 0.35));
		}
		return null;
	}
	
	public String getLocalizacao(){
		return localizacao;
	}
	
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}
}
