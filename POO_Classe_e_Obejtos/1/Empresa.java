public class Empresa{
  public static void main(String args[]){
    Funcionario fun1 = new Funcionario("Maya", 12, 4);
    Funcionario fun2 = new Funcionario("James", 20, 10);
    Funcionario fun3 = new Funcionario("Yuki", 28, 16);

      System.out.printf("\nO salario final de %s é: %.2f", fun1.nome, fun1.salarioFinal());
    System.out.printf("\nO salario final de %s é %.2f", fun2.nome, fun2.salarioFinal());
    System.out.printf("\nO salario final de %s é %.2f", fun3.nome, fun3.salarioFinal());

  }
}
