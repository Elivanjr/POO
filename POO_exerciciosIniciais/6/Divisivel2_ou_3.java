import java.util.Scanner;

public class Divisivel2_ou_3{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quatro números inteiros: ");
		
		int[] vetor = new int[4];
		
		for(int i = 0; i < 4; i++)
			vetor[i] = sc.nextInt();
			
		for(int i = 0; i < 4; i++){
			if(vetor[i] % 2 == 0)
				System.out.printf("O número %d é divisivel por 2...\n", vetor[i]);
			if(vetor[i] % 3 == 0)
				System.out.printf("O número %d é divisivel por 3...\n", vetor[i]);
		}
	}
}
