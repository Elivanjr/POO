
public class Aluno{
	String nome;
	double nota1, nota2;
	
	public double media(){
		return ((nota1 + nota2) / 2);
	}
	
	public String resultado(){
		if(media() >= 6) return "APROVADO";
		else return "REPROVADO";
	}
}
