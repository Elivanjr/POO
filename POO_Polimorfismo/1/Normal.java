public class Normal extends Ingresso{
	private boolean pista;
	
	public Normal(Double valor, boolean pista){
		super(valor);
		this.pista = pista;
	}
	
	@Override
	public String mostraValor(){
		return (this.pista)
			? "O valor do ingresso é: "
				+ String.format("%.2f", this.valor + (this.valor * 0.1)) 
			: "O valor do ingresso é: " 
				+ String.format("%.2f", this.valor);
	}
	
	public boolean getPista(){
		return pista;
	}
	
	public void setPista(boolean pista){
		this.pista = pista;
	}
}
