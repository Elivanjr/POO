public class Quadrado{
	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		return this.lado * this.lado;
	}
	
	public double calculaPerimetro(){
		return this.lado * 4;
	}
	
}

