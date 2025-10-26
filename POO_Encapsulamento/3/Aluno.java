public class Aluno{
	private String nome;
	private int matricula;
	private Double media;
	private String situacao;
	
	public Aluno(String nome, int matricula, Double media){
	  this.nome = nome;
    this.matricula = matricula;
    this.media = media;
    verificaSituacao();
	}

  private void verificaSituacao(){
    if(this.media >= 6)
      this.situacao = "APROVADO";
    else
      this.situacao = "REPROVADO";
  }

  public String resultadoFinal(){
    String ficha;
    ficha = "\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nMedia: " + this.media + "\nSituacao: " + this.situacao;
    return ficha;
  }

  public String getNome(){ return this.nome; }
  
  public void setNome(String nome){ this.nome = nome; }
  
  public int getMatricula(){ return this.matricula; }
  
  public void setMatricula(int matricula){ this.matricula = matricula; }
  
  public Double getMedia(){ return this.media; }
 
  public void setMedia(Double media){ 
    this.media = media;
    verificaSituacao();
  }
}

