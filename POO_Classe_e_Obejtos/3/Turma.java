import java.util.Scanner;

public class Turma{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		System.out.println("Digite o nome do primeiro(a) aluno(a): ");
		a1.nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro(a) aluno(a): ");
		a1.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do primeiro(a) aluno(a): ");
		a1.nota2 = sc.nextDouble();
		
		a2.nome = sc.nextLine();
		System.out.println("Digite o nome do segundo(a) aluno(a): ");
		a2.nome = sc.nextLine();
		System.out.println("Digite a nota do segundo(a) aluno(a): ");
		a2.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo(a) aluno(a): ");
		a2.nota2 = sc.nextDouble();
		
		System.out.printf("Nome do aluno(a): %s - Media: %.2f - Situacao final: %s", a1.nome, a1.media(), a1.resultado());
		System.out.printf("\nNome do aluno(a): %s - Media: %.2f - Situacao final: %s", a2.nome, a2.media(), a2.resultado());
	}
}
