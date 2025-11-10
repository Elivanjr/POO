public class Contas {
	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa("Maya Amano", "12345678909", "Rua 128, 123, Centro", 1200.0);
		ContaBancaria c1 = new ContaBancaria(p1, 1234);
		
		System.out.printf("Conta: %d - Cliente: %s - Saldo: %.2f\n\n", c1.getNumeroConta(), c1.getCliente().getNome(), c1.getSaldo());
	}
}

