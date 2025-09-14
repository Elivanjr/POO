class Humano{
    String nome;
    int idade;

    public Humano(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
  public void dormir(int years){
		System.out.printf("Chapisco dormiu por %d anos... \n", years);
	}
    
  public void end(){
		System.out.println("\n\nChapisco morgou...\n");
	}
}


