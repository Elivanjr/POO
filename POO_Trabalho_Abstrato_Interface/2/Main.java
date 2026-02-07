public class Main{
  public static void main(String args[]){
    Monetizar c = new CanalYoutube("Pearl", 100000, 50.0);

    Double receita = c.calcularReceita(500000);
    System.out.printf("Receita do mês: " + String.format("%.2f\n", receita));
  }
}
