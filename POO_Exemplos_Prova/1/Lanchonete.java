public class Lanchonete{
	public static void main(String args[]){
		
		Pedido p1 = new Pedido(299, "Maya");
    Pedido p2 = new Pedido(300);
    System.out.println("- - - Tabela de preços - - -");
    System.out.println("Código - - - Produto  - - -  Preço");
    System.out.println("  1           BigMac         20,00");
    System.out.println("  2         Hamburger        12,00");
    System.out.println("  3        CheeseBurger      15,00\n");
    System.out.println(" - - - - Adicionais - - - - ");
    System.out.println(
      "Batata - R$0,05 por grama\n" +
      "Refrigerante - R$0,02 por mililítro\n" +
      "Cookie - R$2,00 por unidade\n"
    );
    System.out.println(p1.adiciona(1));
		System.out.println(p1.adiciona(2, 10.0));
    System.out.println(p2.adiciona(3, 100.0, 250.0));
    System.out.println(p2.adiciona(2, 10.0, 5));
	}
}
