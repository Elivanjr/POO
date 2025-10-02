public class Retangulo {
	int comprimento = 1, largura = 1;
	
	public Retangulo(int comprimento, int largura){
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public int perimetroRetangulo(){
		return (comprimento * 2) + (largura * 2);
	}
	
	public int areaRetangulo(){
		return comprimento * largura;
	}
	
}

