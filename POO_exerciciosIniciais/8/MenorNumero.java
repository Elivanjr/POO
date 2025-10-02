import java.util.Scanner;

public class MenorNumero{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números inteiros: ");
		
		int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
		
		System.out.println(
			(num1 < num2 && num1 < num3) ? "Menor número: " + num1 :
			(num2 < num1 && num2 < num3) ? "Menor número: " + num2 : "Menor número: " + num3
		);
		
		
		sc.close();
	}
}

