public class Aluno{
  int matricula;
  String nome, cpf, endereco;

  public Aluno(int matricula, String nome, String cpf, String endereco){
    this.matricula = matricula;
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
  } 

  public String toString(){
    String texto;
    texto = "\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nCPF: " + this.cpf + "\nEndereco: " + this.endereco;
    return texto;
  }
}
