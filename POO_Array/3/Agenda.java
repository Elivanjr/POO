public class Agenda{
  private String nomeDaAgenda;
  private Pessoa[] contatos;
  private int totalContatos;

  public Agenda(String nomeDaAgenda, int tamanho){
    this.nomeDaAgenda = nomeDaAgenda;
    contatos = new Pessoa[tamanho];
    this.totalContatos = 0;
  }

  public boolean adicionaPessoa(Pessoa alvo){
    for (int i = 0; i < this.contatos.length; i++) {
      if(this.contatos[i] == null){
        this.contatos[i] = alvo;
        this.totalContatos++;
        return true;
      }
    }
    return false;
  }

  public boolean removePessoa(Pessoa alvo){
    for(int i = 0; i < this.contatos.length; i++){
      if(this.contatos[i] == alvo){
        this.contatos[i] = null;
        this.totalContatos--;
        return true;
      }
    }
    return false;
  }

  public boolean alteraInformacoes(Pessoa alvo){
    for(int i = 0; i < this.contatos.length; i++){
      if(this.contatos[i] == alvo){
        System.out.println("Insira data de nascimento: ");
        this.contatos[i].setNome(alvo.getNome());
        return true;
      }
    }
    return false;
  }
}
