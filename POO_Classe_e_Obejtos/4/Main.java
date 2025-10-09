import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quadrado q1 = new Quadrado(10.5);
		Quadrado q2 = new Quadrado(105);
		
		System.out.printf("area q1: %.2f - perimetro q1: %.2f", q1.calculaArea(), q1.calculaPerimetro());
		System.out.printf("\narea q2: %.2f - perimetro q2: %.2f", q2.calculaArea(), q2.calculaPerimetro());
		
		sc.close();
	}
}

