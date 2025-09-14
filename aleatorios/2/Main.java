
public class Main{
    public static void main(String args[]){

      Personagem player = new Personagem("Maya Amano", 100, 50);
      Inimigo monstro =  new Inimigo("Shapeshifter", 200, 25);

      System.out.printf("%s HP: %d\n", player.nome, player.vida);
      System.out.printf("%s HP: %d\n", monstro.especie, monstro.vida);
      
      System.out.println("--------------------");
      monstro.Bater(player);
      player.Defender(monstro);
                
      System.out.println("--------------------");
      player.Bater(monstro);
      monstro.Defender(player);
  }
}
