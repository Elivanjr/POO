public class Empresa {
	private Setor setores[];
	private Empregado empregados[];
	private Fornecedor fornecedores[];
	
    public Empresa(int maxSetores, int maxEmpregados, int maxFornecedores) {
        this.setores = new Setor[maxSetores];
        this.empregados = new Empregado[maxEmpregados];
        this.fornecedores = new Fornecedor[maxFornecedores];
    }
    
    public void listaSetores(){
		System.out.println("* * * * * Lista de Setores * * * * *");
		for(int i = 0; i < this.setores.length; i++){
			if(this.setores[i] != null){
				System.out.println(
					"Nome do Setor: " + this.setores[i].getNome() +
					"\nCódigo: " + this.setores[i].getCodigoDoSetor() + "\n"
				);
			}
		}
	}
	
	public void listaEmpregados(){
		System.out.println("+ + + + + Lista de Empregados + + + + +");
		for(int i = 0; i < this.empregados.length; i++){
			if(this.empregados[i] != null){
			//Setor aux = this.empregados[i].getSetor();
			//if(aux != null){
			if(this.empregados[i].getSetor() != null){ //os pensamentos intrusivos venceram...
				System.out.println(
					"Nome do Empregado: " + this.empregados[i].getNome() +
					"\nNome do Setor: " + this.empregados[i].getSetor().getNome() +
					"\nCódigo do Setor: " + this.empregados[i].getSetor().getCodigoDoSetor() + "\n"
					);
				}
			}
		}
	}

	public void listaFornecedores(){
		System.out.println();
	}
// listaFornecedores(): exibe a lista com o nome e o saldo dos fornecedores.
	public Setor[] getSetores() { 
		return setores; 
	}
    
    public Empregado[] getEmpregados() { 
		return empregados; 
	}
    
    public Fornecedor[] getFornecedores() { 
		return fornecedores; 
	}
}
