public class Empresa{
	public static void main(String args[]){
		SetorPessoal setor = new SetorPessoal(3);
		Funcionario f1 = new Funcionario(101, "Ana Ribeiro", 1, 4500.00, "Design");
		Funcionario f2 = new Funcionario(102, "Carlos Mendes", 2, 6200.00, "Design");
		Funcionario f3 = new Funcionario(103, "Luiza Martins", 3, 3800.00, "Música");
		
		setor.adicionarFuncionario(f1);
		setor.adicionarFuncionario(f2);
		setor.adicionarFuncionario(f3);
		
		Funcionario[] lista = setor.listarFuncionario();
		
		for(int i = 0; i < lista.length; i++){
			if(lista[i] != null){
				System.out.println(
					"Matricula: " + lista[i].getMatricula() +
					"\nNome: " + lista[i].getNome() + 
					"\nDepartamento: " + lista[i].getDepartamento() + 
					"\nSalario: " + lista[i].getSalario() + 
					"\nFunção: " + lista[i].getFuncao() + "\n"
				);	
			}
		}
		
		System.out.println("\n------------------------------------------\n");
		
		Funcionario[] funcioDepar = setor.listarFuncionario(3);
		for(int i = 0; i < funcioDepar.length; i++){
			if(funcioDepar[i] != null){
				System.out.println(
					"Matricula: " + funcioDepar[i].getMatricula() +
					"\nNome: " + funcioDepar[i].getNome() + 
					"\nDepartamento: " + funcioDepar[i].getDepartamento() + 
					"\nSalario: " + funcioDepar[i].getSalario() + 
					"\nFunção: " + funcioDepar[i].getFuncao() + "\n"
				);
			}
		}
		System.out.println("\n------------------------------------------\n");
		setor.removerFuncionario(f1);
		
		Funcionario[] funcoes = setor.listarFuncionario("Design");
		for(int i = 0; i < funcoes.length; i++){
			if(funcoes[i] != null){
				System.out.println(
					"Matricula: " + funcoes[i].getMatricula() +
					"\nNome: " + funcoes[i].getNome() + 
					"\nDepartamento: " + funcoes[i].getDepartamento() + 
					"\nSalario: " + funcoes[i].getSalario() + 
					"\nFunção: " + funcoes[i].getFuncao() + "\n"
				);	
			}
		}
	}
}
