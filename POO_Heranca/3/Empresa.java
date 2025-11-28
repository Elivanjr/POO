public class Empresa {
	private Setor setores[];
	private Empregado empregados[];
	private Fornecedor fornecedores[];
	
    public Empresa(int maxSetores, int maxEmpregados, int maxFornecedores) {
        this.setores = new Setor[maxSetores];
        this.empregados = new Empregado[maxEmpregados];
        this.fornecedores = new Fornecedor[maxFornecedores];
    }
}
