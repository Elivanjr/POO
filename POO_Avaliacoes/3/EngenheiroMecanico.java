public class EngenheiroMecanico extends ProfissionalEngenharia{
    private int maquinasDesenvolvidas;

    public EngenheiroMecanico(int maquinasDesenvolvidas, String nome, int anosExperiencia, double valorHora){
        super(nome, anosExperiencia, valorHora);
        this.maquinasDesenvolvidas = maquinasDesenvolvidas;
    }

    @Override
    public String exibirStatus(){
        return super.exibirStatus() + " / Máquinas Desenvolvidas: " + maquinasDesenvolvidas;
    }

    public double calcularCustoProjetoMecanico(double horasPrevistas){
        double custo = valorHora * horasPrevistas;
        if(maquinasDesenvolvidas > 20){
            custo *= 1.10;
        }
        return custo;
    }
    
    public int getMaquinasDesenvolvidas(){
		return maquinasDesenvolvidas;
	}
	
	public void setMaquinasDesenvolvidas(){
		this.maquinasDesenvolvidas = maquinasDesenvolvidas;
	}
}
