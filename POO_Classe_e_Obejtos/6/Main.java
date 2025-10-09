import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Fatura fat1 = new Fatura("Coca-Cola Zero", 100, 20, 12.5);
		Fatura fat2 = new Fatura("VivoBook_ASUSLaptop", 10, 3, 1800.9);
		
		System.out.printf("O preço da fatura da %s é %.2f", fat1.descricao, fat1.getValorDaFatura());
		System.out.printf("\nO preço da fatura do %s é %.2f", fat2.descricao, fat2.getValorDaFatura());
		
		sc.close();
	}
}
