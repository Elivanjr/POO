public class Main{
  public static void main(String args[]){
    Estoque estoque = new Estoque(5);
    
    Produto p1 = new Produto(1, "Refrigerante", 10.2f, 10);
    Produto p2 = new Produto(2, "Batata Palha", 10.2f, 20);
    Produto p3 = new Produto(3, "Lasanha", 10.2f, 30);
    Produto p4 = new Produto(4, "Picanha", 10.2f, 40);
    
    System.out.println("Adicionando produtos...");
    estoque.adicionaProduto(p1);
    estoque.adicionaProduto(p2);
    estoque.adicionaProduto(p3);
    estoque.adicionaProduto(p4);
    estoque.listarProduto();
    
    Produto produtoAlvoCod = estoque.buscaProduto(3);
    if(produtoAlvoCod != null)
		System.out.println("Produto encontrado: " + produtoAlvoCod.getDescricao());
    else
		System.err.println("Produto não encontrado ou inexistente...");
		
	Produto produtoAlvoDes = estoque.buscaProduto("Refrigerante");
	if(produtoAlvoDes != null)
		System.out.println("Produto encontrado: " + produtoAlvoDes.getDescricao());
	else
		System.err.println("Produto não encontrado ou inexistente");
	
	
  }
}
