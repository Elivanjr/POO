
public class Fatura{
	int numero, quantidade;
	String descricao;
	double preco;
	
	public Fatura(String descricao, int numero, int quantidade, double preco) {
		this.descricao = descricao;
		this.numero = numero;
		this.quantidade = quantidade > 0? quantidade : 0;
		this.preco = preco;
	}
	
	public double getValorDaFatura(){
		return (this.quantidade * this.preco);
	}
	
	
}

