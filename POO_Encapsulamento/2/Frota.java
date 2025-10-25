public class Frota{
	public static void main (String[] args) {
		Carro ae86 = new Carro(20.0);
		
		ae86.percorrerDistancia(241);
		ae86.abastecer(20.0);
		ae86.autonomia();
		ae86.percorrerDistancia(241);
	}
}

