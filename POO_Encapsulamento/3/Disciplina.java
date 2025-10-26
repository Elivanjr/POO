public class Disciplina {
  public static void main(String[] args) {
    
    Aluno student1 = new Aluno("Maya Amano", 102, 5.5);

    System.out.printf("\n%s\n", student1.resultadoFinal());
    
    student1.setNome("Alice Sers");
    student1.setMedia(9.0);
    student1.setMatricula(204);

    System.out.printf("\n%s\n", student1.resultadoFinal());

  }
}
