public class Livro extends Publicacao{
  private String autor;
  private String editora;

  public Livro(String autor, String editora){
    this.autor = autor;
    this.editora = editora;
  }

  public String getAutor(){
    return autor;
  }

  public void setAutor(String autor){
    this.autor = autor;
  }

  public String getEditora(){
    return editora;
  }

  public void setEditora(String editora){
    this.editora = editora;
  }

  @Override
  public String emprestar(int dia, int mes){
    
  }
}
