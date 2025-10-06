public class Funcionario{
  
  String nome;
  double horasTrabalhadas, valorDaHora;

  public Funcionario(String nome, double horasTrabalhadas, double valorDaHora){
    this.nome = nome;
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorDaHora = valorDaHora;
  }

  public double salarioFinal(){
    return ((this.horasTrabalhadas * this.valorDaHora) * (1 - 0.11));
  }
}
