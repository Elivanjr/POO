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
	
	public Funcionario[] listarFuncionario(int departamento){
		Q
	}
	
}
