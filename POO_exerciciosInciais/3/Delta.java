import java.util.Scanner;

public class Delta{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de ax² + bx + c: ");
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		int delta = ((b*b) - 4 * a * c);
		
		System.out.println((delta < 0) ? "Não existem raizes reais" : (delta == 0) ? "Existe uma raiz" : "Existem duas raizes");
		
		sc.close();
	}
}

