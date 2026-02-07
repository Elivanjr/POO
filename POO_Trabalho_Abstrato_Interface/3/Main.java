public class Main{
  public static void main(String args[]){
    Ataque[] personagens = new Ataque[3];

    personagens[0] = new Espadachim("James Sers", 50);
    personagens[1] = new Mago("Clara Woods", 50);
    personagens[2] = new Aldeao("Alex", 1);

    for(int i = 0; i < 3; i++){
      personagens[i].ataqueFinal();
    }
  }
}
