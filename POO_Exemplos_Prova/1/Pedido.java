public class Pedido{
	
	private int codigo;
	private String cliente;
	private Double valor;
	
	public Pedido(int codigo){
		this.codigo = codigo;
		this.cliente = "Nao informado";
		this.valor = 0.0;
	}
	
	public Pedido(int codigo, String cliente){
		this.codigo = codigo;
		this.cliente = cliente;
		this.valor = 0.0;
	}
	
	private void menuInterno(int item){
		switch(item){
			case 1: this.valor += 20.0;
              return;
			case 2: this.valor += 12.0;
              return;
			case 3: this.valor += 15.0;
              return;
	   }
	}
	
	public String adiciona(int produto){  
	   menuInterno(produto);
	   if(produto >= 1 && produto <= 3)
		  return "Pedido " + this.codigo + " - Cliente: " + this.cliente + " - Total: R$" + String.format("%.2f", this.valor);
	
		return "Inexistente";
	}
	
	public String adiciona(int produto, Double batata){
		menuInterno(produto);
		if(produto >= 1 && produto <= 3 && batata > 0.0){
			this.valor += (batata * 0.05);
      	return "Pedido " + this.codigo + " - Cliente: " + this.cliente + " - Total: R$" + String.format("%.2f", this.valor);
		}
		return "Inexistente";
	}

  public String adiciona(int produto, Double batata, Double refrigerante){
		menuInterno(produto);
		if(produto >= 1 && produto <= 3 && batata > 0.0 && refrigerante > 0.0){
			this.valor += (batata * 0.05) + (refrigerante * 0.02);
		}
		
		return "Pedido " + this.codigo + " - Cliente: " + this.cliente + " - Total: R$" + String.format("%.2f", this.valor);
	}

  public String adiciona(int produto, Double batata, int cookie){
		menuInterno(produto);
		if(produto >= 1 && produto <= 3 && batata > 0.0 && cookie > 0){
			this.valor += (batata * 0.05) + (cookie * 2.0);
		}
		
		return "Pedido " + this.codigo + " - Cliente: " + this.cliente + " - Total: R$" + String.format("%.2f", this.valor);
	}
	
	public String getCliente(){ return this.cliente; }
	
	public void setCliente(String cliente){ this.cliente = cliente; }
	
	public int getCodigo(){ return this.codigo; }
}
