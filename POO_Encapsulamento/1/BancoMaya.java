import java.util.Scanner;

public class BancoMaya{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente(3313, "Maya Amano");
	
		System.out.println("Digite a senha: ");
		conta.cadastrarSenha(sc.nextInt());
		
		System.out.println("Digite a antiga senha e depois a nova: ");
		conta.alterarSenha(sc.nextInt(), sc.nextInt());
		
		System.out.println("Digite a senha e quanto deseja creditar: ");
		conta.creditar(sc.nextInt(), sc.nextDouble());
		
		System.out.println("Digite a senha e quanto deseja debitar: ");
		conta.debitar(sc.nextInt(), sc.nextDouble());
		
		System.out.println("Digite a senha para checar o saldo: ");
		conta.consultaSaldo(sc.nextInt());
		
		sc.close();
	}
}

