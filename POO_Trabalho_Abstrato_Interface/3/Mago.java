public class Mago implements Ataque{
  private String nome;
  private int nivel;

  public Mago(String nome, int nivel){
    this.nome = nome;
    this.nivel = nivel;
  }

  @Override
  public void ataqueFinal(){
    for(int i = 3; i > 0; i--){
        System.out.printf("Carregando magia: aguarde %d segundos\n", i);
        if(i == 1)
          System.out.printf("%s usou sua magia suprema, Black Hole\n", this.nome);
    }
  }
} 
