//Espadachim.java
//Classe que representa um Espadachim e implementa a interface Ataque
public class Espadachim implements Ataque{
  //Atributos da classe
  private String nome;
  private int nivel;

  //Construtor que inicializa o nome e o nível do espadachim
  public Espadachim(String nome, int nivel){
    this.nome = nome;
    this.nivel = nivel;
  }

  //Implementação do método ataqueFinal da interface Ataque
  @Override
  public void ataqueFinal(){
	//Exibe o ataque do espadachim
    System.out.printf("\n%s usou a habilidade final de sua espada, o Vorpal Strike!!!\n\n", this.nome);
  }
}
