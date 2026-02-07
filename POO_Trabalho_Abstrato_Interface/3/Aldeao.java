//Aldeao.java
//Classe que representa um Aldeao e implementa a interface Ataque
public class Aldeao implements Ataque{
  //Atributos da classe
  private String nome;
  private int nivel;

  //Construtor que inicializa o nome e o nível do aldeao
  public Aldeao(String nome, int nivel){
    this.nome = nome;
    this.nivel = nivel;
  }

  //Implementação do método ataqueFinal da interface Ataque
  @Override
  public void ataqueFinal(){
	//Exibe o ataque do aldeao
    System.out.printf("\nO Aldeao %s vai usar seu ataque mais forte...UNLIMITED FARM WORKS!!!\n", this.nome);
  }
}
