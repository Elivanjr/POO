public class Main{
	
	public static void main (String[] args) {
		
		Fornecedor f1 = new Fornecedor("Maya Amano", "Rua Azul, 1, São José", "992500280", 120.0, 60.0);
		Empregado e1 = new Empregado("Tatsuya Suou", "Rua Verde, 999, São Lucas", "999888777", 38, 1518.0, 200.0);
		
		System.out.printf("O saldo da Fornecedora %s é de R$%.2f\n", f1.getNome(), f1.obterSaldo());
		System.out.printf("O salário do Empregado %s é de R$%.2f", e1.getNome(), e1.calculaSalario());
		
	}
}

