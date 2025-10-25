public class Emprestimo {
	private String nomeCliente;
	private Double renda;
	
	public Emprestimo(){
		
	}
	
	public Emprestimo(String nomeCliente, Double renda){
		this.renda = renda;
	}
	
	public Double calculaEmprestimo(){
		System.out.printf("Valor empresitmo 1: %.2f\n", this.renda * 4);
		return this.renda * 4;
	}

	public Double calculaEmprestimo(int valor){
		System.out.printf("Valor empresitmo 2: %.2f\n", this.renda * valor);
		return this.renda * valor;
	}
	
	public Double calculaEmprestimo(Double taxa){
		Double ren = this.renda * 5;
		System.out.printf("Valor empresitmo 3: %.2f\n", ren * (taxa/100));
		return ren - (ren * taxa/100.0);
		
	}
	
	public String getNome(){
		return nomeCliente;
	}
	
	public void setNome(String nome){
		this.nomeCliente = nome;
	}

	
}

