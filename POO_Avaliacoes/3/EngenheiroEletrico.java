public class EngenheiroEletrico extends ProfissionalEngenharia{
	private int circuitosProjetados;
	
	public EngenheiroEletrico(int circuitosProjetados, String nome, int anosExperiencia, double valorHora){
		super(nome, anosExperiencia, valorHora);
		this.circuitosProjetados = circuitosProjetados;
	}
	
	@Override
	public String exibirStatus(){
        return super.exibirStatus() + " / Circuitos Projetados: " + circuitosProjetados;
    }
    
    public double calcularCustoInstalacao(double horasPrevistas){        
        double custo = valorHora * horasPrevistas;
        if(circuitosProjetados > 50){
            custo *= 1.15;
        }
        return custo;
    }
    
    public int getCircuitosProjetados(){
		return circuitosProjetados;
	}
	
	public void setCircuitosProjetados(int circuitosProjetados){
		this.circuitosProjetados = circuitosProjetados;
	}
}
