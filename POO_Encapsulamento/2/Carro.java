public class Carro{
	//Atributos
	private Double combustivel;
	private Double quilometragem;
	
	//Construtor
	public Carro(Double combustivel){
		this.combustivel = combustivel;
		this.quilometragem = 0.0;
	}
	 
	//Métodos
	public void percorrerDistancia(int distancia){
		if (distancia <= 0){
			System.err.println("A distancia definida é menor ou igual a zero, coloque outro valor\n");
			return;
		}
		if(this.combustivel >= (distancia/12.0)){
			this.quilometragem += distancia;
			this.combustivel -= (distancia/12.0);
			System.out.println("\nÉ possivel realizar a viagem...\n");
		}else{
			if(this.combustivel <=(distancia/12.0)){
				System.err.println("Combustivel insuficiente para realizar a viagem, coloque mais combustivel\n");
			}
		}
	}
	
	public void abastecer(Double litros){
		if(litros > 0.0){
			this.combustivel += litros;
			System.out.printf("Você abasteceu %.2f litros de combustivel em seu carro\n", litros);
			System.out.printf("\nQuantidade de combustivel no Carro: %.2f litros\n", this.combustivel);
		}else{
			System.err.println("\nImpossivel, quantidade inferior a 0.01\n");
		}
	}
	
	public Double autonomia(){
		Double auto = this.combustivel * 12.0;
		System.out.printf("\nVocê pode andar %.2f km com %.2f litros de combustivel\n", auto, this.combustivel);
		return auto;
	}
	
	
	//Getters e Setters
	public Double getCombustivel(){ return this.combustivel; }
	
	public void setCombustivel(Double combustivel){ this.combustivel = combustivel; }
	
	public Double getQuilometragem(){ return this.quilometragem; }
	
	public void setQuilometragem(Double quilometragem){ this.quilometragem = quilometragem; }
}

