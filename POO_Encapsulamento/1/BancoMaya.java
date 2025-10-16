import java.util.Scanner;

public class BancoMaya{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente(3313, "Maya");
	
		System.out.println("Digite a senha: ");
		boolean foi = conta.cadastrarSenha(sc.nextInt());
		System.out.println((!foi) ? "Erro: Senha existente" : "Senha Cadastrada");
		
		System.out.println("Digite a nova senha: ");
		conta.alterarSenha(conta.getSenha(), sc.nextInt());
	}
}

