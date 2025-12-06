public class SetorPessoal{
	private Funcionario funcionarios[];
	
	public SetorPessoal(int limite){
		funcionarios =  new Funcionario[limite];
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = funcionario;
				return true;
			}
		}
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == funcionario){
				funcionarios[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i].getMatricula() == matricula){
				return funcionarios[i];
			}
		}
		return null;
	}
	
	public Funcionario buscarFuncionario(String nome){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i].getNome().equalsIgnoreCase(nome)){
				return funcionarios[i];
			}
		}
		return null;
	}
	
	public Funcionario[] listarFuncionario(){
		return this.funcionarios;
	}

	public Funcionario[] listarFuncionario(int departamento){
		Funcionario[] aux = new Funcionario[this.funcionarios.length];
		int cont = 0;
		
		for(int i = 0; i < this.funcionarios.length; i++){
			if(this.funcionarios[i] != null && this.funcionarios[i].getDepartamento() == departamento){
				aux[cont++] = this.funcionarios[i];
			}
		}
		
		Funcionario[] funcionario = new Funcionario[cont];
		for(int i = 0; i < cont; i++){
			funcionario[i] = aux[i];
		}
		return funcionario;
	}
	
	public Funcionario[] listarFuncionario(String funcao){
		Funcionario[] aux = new Funcionario[this.funcionarios.length];
		int cont = 0;
		
		for(int i = 0; i < this.funcionarios.length; i++){
			if(this.funcionarios[i] != null && this.funcionarios[i].getFuncao().equalsIgnoreCase(funcao)){
				aux[cont++] = this.funcionarios[i];
			}
		}
		
		Funcionario[] funcionario = new Funcionario[cont];
		for(int i = 0; i < cont; i++){
			funcionario[i] = aux[i];
		}
		
		return funcionario;
	}

}
