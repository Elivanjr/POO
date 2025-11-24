public class Estoque{
  private Produto[] produtos;

  public Estoque(int limite){
    produtos = new Produto[limite];
  }

  public void adicionaProduto(Produto produto){
    for(int i = 0; i < produtos.length; i++){
      if(produtos[i] == null){
        produtos[i] = produto;
        break;
      }
    }
  }

  public void excluiProduto(Produto alvo){
    for(int i = 0; i < produtos.length; i++){
      if(produtos[i] != null){
        if(produtos[i].getCodigo() == alvo.getCodigo()){
          produtos[i] = null;
          break;
        }
      }
    }
  }

  public Produto buscaProduto(int codigo){
    for(Produto alvo : produtos){
      if(alvo != null){
        if(alvo.getCodigo() == codigo)
          return alvo;
      }
    }
    return null;
  }

  public Produto buscaProduto(String descricao){
    for(Produto alvo : produtos){
      if(alvo != null){
        if(alvo.getDescricao().equalsIgnoreCase(descricao)){
          return alvo;
        }
      }
    }
    return null;
  }
  
  public void listarProduto(){
	System.out.println("- - - - - ESTOQUE - - - - -");
	for(Produto alvo : produtos){
		if(alvo != null){
			System.out.println(
				"Código: " + alvo.getCodigo() +
				" - Descrição: " + alvo.getDescricao() +
				" - Preço: R$" + alvo.getPreco() +
				" - Quantidade: " + alvo.getQuantidade()
			);
		}
	}
  }

}
