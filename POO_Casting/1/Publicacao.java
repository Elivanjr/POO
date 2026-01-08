public class Publicacao{
  private int isbn;
  private String nome;
  private int numeroDeCopias;
  private int copiasEmprestadas;

  public Publicacao(int isbn, String nome, int numeroDeCopias, int copiasEmprestadas){
    this.isbn = isbn;
    this.nome = nome;
    this.numeroDeCopias = numeroDeCopias;
    this.copiasEmprestadas = copiasEmprestadas;
  }

  public String emprestar(int dia, int mes){
    String aux;
    aux = "Dia: " + dia + "Mes: " + mes;
    return aux;
  }

  public int getIsbn(){
    return isbn;
  }

  public void setIsbn(int isbn){
    this.isbn = isbn;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getNumeroDeCopias(){
    return numeroDeCopias;
  }

  public void setNumeroDeCopias(int numeroDeCopias){
    this.numeroDeCopias = numeroDeCopias;
  }

  public int getCopiasEmprestadas(){
    return copiasEmprestadas;
  }

  public void setCopiasEmprestadas(int copiasEmprestadas){
    this.copiasEmprestadas = copiasEmprestadas;
  }
}
