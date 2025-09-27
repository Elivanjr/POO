import java.util.Scanner;

public class Main{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		System.out.printf((num >= 1 && num <=9)? "O valor %d está na faixa permitida" : "O valor %d está fora da faixa permitida", num);
		
		sc.close();
	}
}

