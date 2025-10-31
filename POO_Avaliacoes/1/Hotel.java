import java.util.*;

public class Hotel{
	
	public static void menu(){
		System.out.println("- - - HOTEL DO BSI - - -");
		System.out.println("[1] - Calcular Diaria   ");
		System.out.println("[2] - Adicionar Passeio   ");
		System.out.println("[3] - Exibir Reserva   ");
		System.out.println("[0] - Sair do programa  ");
		System.out.println("- - - - - - - - - - - - ");
		System.out.println("Digite a opção desejada: ");
	}
	
	public static void menuReserva(){
		System.out.println("- - - ESCOLHA A RESERVA - - -");
		System.out.println("[1] - Reserva 1   ");
		System.out.println("[2] - Reserva 2   ");
		System.out.println("- - - - - - - - - - - - ");
		System.out.println("Digite a opção desejada: ");

	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Reserva re1 = new Reserva(10, "Pablo Rosa", 5);
		Reserva re2 = new Reserva(20, "Maya Amano", 5, true);
				
		boolean saiu = false;
		
		while(!saiu){
			menu();
			int opc = sc.nextInt();
			switch(opc){
				case 1: {
						menuReserva();
						int opReserva = sc.nextInt();
						int temTaxa;
						Double taxa;
						//boolean temRefeicao;
						
						if(opReserva == 1){
							System.out.println("Taxa de Limpeza? (1 - Sim // 2 - Não ");
							temTaxa = sc.nextInt();
							if(temTaxa == 1){
								System.out.println("Digite a taxa ");
								taxa = sc.nextDouble();
								System.out.println("Diaria: " + re1.calcularDiaria(taxa));
							}else if (temTaxa == 2){
								System.out.println("Diaria: " + re1.calcularDiaria());
							}
							
						}else if(opReserva == 2){
							System.out.println("Taxa de Limpeza? (1 - Sim // 2 - Não ");
							temTaxa = sc.nextInt();
							if(temTaxa == 1){
								System.out.println("Digite a taxa ");
								taxa = sc.nextDouble();
								System.out.println("Diaria: " + re2.calcularDiaria(taxa));
							}else if (temTaxa == 2){
								System.out.println("Diaria: " + re2.calcularDiaria());
							}
						}
					}
				break;
				
				case 2: {
					menuReserva();
					int opReserva = sc.nextInt();
					sc.nextLine();
					if(opReserva == 1){
						System.out.println("Qual passeio? Cavalgada, Trilha ou Pesca?");
						String mod = sc.nextLine();
						System.out.println("Quantas vezes? ");
						int vezes = sc.nextInt();
						if(vezes == 1){
							System.out.println("Valor do passeio: " + re1.adicionarPasseio(mod) + "\n");
						}else if(vezes >= 2){
							System.out.println("Valor do passeio: " + re1.adicionarPasseio(mod, vezes)  + "\n");
						}
						
					}else if(opReserva == 2){
						System.out.println("Qual passeio? Cavalgada, Trilha ou Pesca?");
						String mod = sc.nextLine();
						System.out.println("Quantas vezes? ");
						int vezes = sc.nextInt();
						if(vezes == 1){
							System.out.println("Valor do passeio: " + re2.adicionarPasseio(mod)  + "\n");
						}else if(vezes >= 2){
							System.out.println("Valor do passeio: " + re2.adicionarPasseio(mod, vezes)  + "\n");
						}
					}
				}
				break;
				
				case 3:{
					menuReserva();
					int opReserva = sc.nextInt();
					//int temRefeicao; //nao deu tempo de usar os gets e sets
					if(opReserva == 1){
						System.out.println(re1.exibirReserva());
					}else if(opReserva == 2){
						System.out.println(re2.exibirReserva(true));
					}
				}
				break;
					
				default: System.out.println("Opção Invalida...");
						break;
				
				case 0: {
					saiu = true;
					System.out.println("Obrigado pela estadia e até uma proxíma... Tchau!\n");
				}
			}
		}
		
		
	}
}
