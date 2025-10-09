public class Curso{
  public static void main(String args[]){
    Aluno p1 = new Aluno(
      07, 
      "James Sers",
      "123.456.789-09",
      "Avenida dos Finais Felizes, nº 7, Cidade dos Sonhos"
    );
    
    Aluno p2 = new Aluno(
      22,
      "Clara Miller",
      "241.146.130-56",
      "Rua dos Pensamentos Positivos, nº 108, Bairro da Serenidade"
      );

    System.out.println(p1.toString());
    System.out.println(p2.toString());
  }
}
