import java.util.Scanner;

public class Triangulo{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho de cada lado de um triângulo: ");
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if((a + b) > c && (b + c) > a && (c + a) > b)
			System.out.println("TRIANGULO EXISTENTE");
		else
			System.out.println("CAIA FORA");
	}
}

