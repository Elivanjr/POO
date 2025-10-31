public class Reserva{
	//Atributos
	private int codigo;
  	private int diarias;
	private String nomeHospede;
	private boolean incluiRefeicoes;
	
	//Construtores
	public Reserva(int codigo, String nomeHospede, int diarias){
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = false;
	}
	
	public Reserva(int codigo, String nomeHospede, int diarias, boolean incluiRefeicoes){
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = incluiRefeicoes;		
	}
	
	//Métodos
	public Double calcularDiaria(){
		Double hosp = 0.0;
		if(!this.incluiRefeicoes){
			hosp = this.diarias * 200.0;
		}else if(this.incluiRefeicoes){
			hosp = (this.diarias * 200.0) + (50.0 * this.diarias); // this.diarias * (200.0 + 50.0) == (this.diarias * 200.0) + (this.diarias * 50.0)
		}
		
		return hosp;
	}
	
	public Double calcularDiaria(Double taxaLimpeza){
		Double hosp = 0.0;
		if(!this.incluiRefeicoes){
			hosp = (this.diarias * 200.0) + taxaLimpeza;
		}else if(this.incluiRefeicoes){
			hosp = (this.diarias * 200.0) + (50.0 * this.diarias) + taxaLimpeza;
		}
		
		return hosp;
	}
	
	public Double adicionarPasseio(String tipo){
		if(tipo.equalsIgnoreCase("CAVALGADA")){
			 return 80.0;
		}else if(tipo.equalsIgnoreCase("TRILHA")){
			return 60.0;
		}else if(tipo.equalsIgnoreCase("PESCA")){
			return 70.0;
		}
		return 0.0;
	}
	
	public Double adicionarPasseio(String tipo, int quantidade){
		return adicionarPasseio(tipo) * quantidade;
	}
	
	public String exibirReserva(){
		return "\nReserva: [" + this.codigo + "] - Hospede: [" + this.nomeHospede + "] - Díarias: [" + this.diarias + "].\n";
	}

	public String exibirReserva(boolean comDetalhes){
    if(comDetalhes){
      if(this.incluiRefeicoes){
        return "\nReserva: [" + this.codigo + "] - Hospede: [" + this.nomeHospede + "] - Díarias: [" + this.diarias + "] - Refeições Inclusas: [Sim].\n";
      }else{
        return "\nReserva: [" + this.codigo + "] - Hospede: [" + this.nomeHospede + "] - Díarias: [" + this.diarias + "] - Refeições Inclusas: [Não].\n";
      }
    }
    return exibirReserva();
  }
	
	//Getters e Setters
	public boolean getincluiRefeicoes(){
		return incluiRefeicoes;
	}
	
	public void setRefeicoes(boolean incluiRefeicoes){
		this.incluiRefeicoes = incluiRefeicoes;
	}
	
	public int getDiarias(){
		return diarias;
	}
	
	public void setDiarias(int diarias){
		this.diarias = diarias;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getnomeHospede(){
		return nomeHospede;
	}
	
	public void setHospede(String nomeHospede){
		this.nomeHospede = nomeHospede;
	}
	
}

