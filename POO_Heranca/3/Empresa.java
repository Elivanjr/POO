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
			if(this.empregados[i].getSetor() != null && this.empregados[i] != null){ //os pensamentos intrusivos venceram...
				System.out.println(
					"Nome do(a) Empregado(a): " + this.empregados[i].getNome() +
					"\nNome do Setor: " + this.empregados[i].getSetor().getNome() +
					"\nCódigo do Setor: " + this.empregados[i].getSetor().getCodigoDoSetor() + "\n"
					);
				}
			}
		}
	}

	public void listaFornecedores(){
		//coloque um bool (existeCadastro) que sempre seja false, e dentro do loop é true
		System.out.println("- - - - - Lista dos Fornecedores - - - - -");
		for(int i = 0; i < this.fornecedores.length; i++){
			if(this.fornecedores[i] != null){
				System.out.printf("\nNome do(a) Fornecedor(a): %s\nSaldo: %.2f\n", this.fornecedores[i].getNome(), this.fornecedores[i].obterSaldo());
			}
		}
	}
	
	public void folhaDePagamento(){
		System.out.printf("\n= = = = = Folha de Pagamento = = = = =\n");
		float somaFolha = 0, salario = 0;
		boolean existeCadastro = false; //dps implemento
		for(int i = 0; i < this.empregados.length; i++){
			if(this.empregados[i] != null){
				salario = this.empregados[i].calculaSalario();
				System.out.printf("\nEmpregado: %s\nSaldo: %.2f\n", this.empregados[i].getNome(), salario);	
				somaFolha += salario;
				existeCadastro = true;
			}
		}
		if(existeCadastro){
			System.out.printf("Valor total da folha de pagemento da empresa: %.2f\n", somaFolha);
		}else{
			System.err.println("CAIA FORA...");
		}
	}

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
