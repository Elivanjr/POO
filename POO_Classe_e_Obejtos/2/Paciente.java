
public class Paciente{
	String nome, sexo;
	double altura, peso;
	
	public double calcularIMC(){
		return (peso / (altura*altura));
	}
}
