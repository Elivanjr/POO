import java.util.Scanner;
public class Financeira {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Emprestimo pessoa1 = new Emprestimo("Maya Amano", 100.0);
		int escolha;
		
		while(true){
			System.out.println("1 - Sem parametro, 2 - Inteiro, 3 - Float");
			escolha = sc.nextInt();
			switch(escolha){
				case 1: pessoa1.calculaEmprestimo();
						break;
				case 2: pessoa1.calculaEmprestimo(10);
						break;
				case 3: pessoa1.calculaEmprestimo(15.00);
						break;
				
				case 0: return;
			}
		}
	}
}

