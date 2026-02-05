public class CanalYoutube implements Monetizar{
  private String nome;
  private int numeroInscritos;
  private Double valorPorMilViews;

  public CanalYoutube(String nome, int numeroInscritos, Double valorPorMilViews){
    this.nome = nome;
    this.numeroInscritos = numeroInscritos;
    this.valorPorMilViews = valorPorMilViews;
  }
  
  @Override
  public Double calcularReceita(int views){
    return (views / 1000.0) * valorPorMilViews;
  }
}
