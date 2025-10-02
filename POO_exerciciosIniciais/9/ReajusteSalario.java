import java.util.Scanner;

public class ReajusteSalario{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salario: ");
		
		double salario = sc.nextDouble();
		
		if(salario < 5000){
			salario = salario + (salario * 0.30);
			System.out.println("Seu novo salario é " + salario);
		}else{
			System.out.println("Seu salario continua sendo " + salario);
		}
		
		
		sc.close();
	}
}

