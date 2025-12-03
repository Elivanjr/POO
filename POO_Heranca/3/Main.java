public class Main{
	public static void main(String args[]){
		Empresa empresa = new Empresa(2, 5, 3);
		Setor setor = new Setor();
		
		empresa.getSetores()[0] = setor;
		empresa.getSetores()[0].setCodigoDoSetor(10);
		empresa.getSetores()[0].setNome("Game Design");
		
		empresa.getEmpregados()[0] = new Empregado();
		empresa.getEmpregados()[0].setNome("Maya Amano");
		empresa.getEmpregados()[0].setSetor(setor);
		empresa.getEmpregados()[0].setSalarioBase(2500.0f);
		empresa.getEmpregados()[0].setImposto(25.0f);
		
		empresa.getEmpregados()[1] = new Empregado();
		empresa.getEmpregados()[1].setNome("Lisa Silvermen");
		empresa.getEmpregados()[1].setSetor(setor);
		empresa.getEmpregados()[1].setSalarioBase(2000.0f);
		empresa.getEmpregados()[1].setImposto(300.0f);
		
		empresa.getFornecedores()[0] = new Fornecedor();
		empresa.getFornecedores()[0].setNome("Tatsuya Suou");
		empresa.getFornecedores()[0].setCredito(100f);
		empresa.getFornecedores()[0].setDivida(20f);
		
		empresa.listaEmpregados();
		empresa.listaSetores();
		empresa.listaFornecedores();
		empresa.folhaDePagamento();	
	}
}
