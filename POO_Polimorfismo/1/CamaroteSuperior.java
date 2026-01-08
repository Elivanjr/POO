public class CamaroteSuperior extends Vip{
	private char classe;
	
	public CamaroteSuperior(Double valor, Double adicional, char classe){
		super(valor, adicional);
		this.classe = classe;
	}
	
	@Override
	public String mostraValor(){
		if(this.classe == 'A'){
			return "O valor do ingresso é: " + String.format("%.2f", this.valor + this.adicional + (this.valor * 0.75));
		}else if(this.classe == 'B'){
			return "O valor do ingresso é: " + String.format("%.2f", this.valor + this.adicional + (this.valor * 0.50));
		}
		return "Sem classe";
	}
	
	public char getClasse(){
		return classe;
	}
	
	public void setClasse(char classe){
		this.classe = classe;
	}
}
