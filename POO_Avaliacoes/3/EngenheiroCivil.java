public class EngenheiroCivil extends ProfissionalEngenharia{
	private int projetosExecutados;

	public EngenheiroCivil(int projetosExecutados, String nome, int anosExperiencia, double valorHora){
		super(nome, anosExperiencia, valorHora);
		this.projetosExecutados = projetosExecutados;
    }
    
    @Override
    public String exibirStatus(){
        return super.exibirStatus() + " / Projetos Executados: " + projetosExecutados;
    }

    public double calcularCustoConstrucao(double horasPrevistas){
        double custo = valorHora * horasPrevistas;
        return (projetosExecutados > 30) ? custo * 1.20 : custo;
    }
    
    public int getProjetosExecutados(){
		return projetosExecutados;
	}
	
	public void setProjetosExecutados(int projetosExecutados){
		this.projetosExecutados = projetosExecutados;
	}
}
