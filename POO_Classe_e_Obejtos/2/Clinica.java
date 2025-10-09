import java.util.Scanner;

public class Clinica{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		
		System.out.println("Digite o nome do primeiro(a) paciente: ");
		p1.nome = sc.nextLine();
		System.out.println("Digite o sexo do primeiro(a) paciente: ");
		p1.sexo = sc.nextLine();
		System.out.println("Digite o peso do primeiro(a) paciente: ");
		p1.peso = sc.nextDouble();
		System.out.println("Digite a altura do primeiro(a) paciente: ");
		p1.altura = sc.nextDouble();
		
		System.out.println("Digite o nome do segundo(a) paciente: ");
		p2.nome = sc.nextLine();
		p2.sexo = sc.nextLine();
		System.out.println("Digite o sexo do segundo(a) paciente: ");
		p2.sexo = sc.nextLine();
		System.out.println("Digite o peso do segundo(a) paciente: ");
		p2.peso = sc.nextDouble();
		System.out.println("Digite a altura do segundo(a) paciente: ");
		p2.altura = sc.nextDouble();
		
		System.out.printf("Primeiro(a) paciente -> Nome: %s - Sexo: %s - Peso: %.2f - altura: %.2f", p1.nome, p1.sexo, p1.peso, p1.altura);
		System.out.printf("O IMC da primera pessoa é: %.2f", p1.calcularIMC());
		System.out.printf("Segundo(a) paciente -> Nome: %s - Sexo: %s - Peso: %.2f - altura: %.2f", p2.nome, p2.sexo, p2.peso, p2.altura);
		System.out.printf("\nO IMC da segunda pessoa é: %.2f", p2.calcularIMC());
		
		sc.close();
	}
}

