import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo(sc.nextInt(), sc.nextInt());
		
		System.out.printf("O perimetro do retangulo é: %d", ret.perimetroRetangulo());
		System.out.printf("\n area do retangulo é: %d", ret.areaRetangulo());
		
		sc.close();
	}
}

