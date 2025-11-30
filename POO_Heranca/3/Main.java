public class Main{
	public static void main(String args[]){
		Empresa empresa = new Empresa(2, 5, 3);
		Setor setorNovo = new Setor();
		
		empresa.getSetores()[0] = setorNovo;
		empresa.getSetores()[0].setCodigoDoSetor(10);
		empresa.getSetores()[0].setNome("DistopiaPDC");
		
		empresa.getEmpregados()[0] = new Empregado();
		empresa.getEmpregados()[0].setNome("Overkilled Red");
		empresa.getEmpregados()[0].setSetor(setorNovo);
		empresa.getEmpregados()[0].setSalarioBase(20.0f);
		empresa.getEmpregados()[0].setImposto(20.0f);
		
		empresa.listaEmpregados();
		empresa.listaSetores();
		
		
		
	}
}
