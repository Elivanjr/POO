public class Veiculo {
  private String placa, modelo, tipo;
  private int quilometragem;

  public Veiculo(String placa, String modelo, String tipo){
    this.placa = placa;
    this.modelo = modelo;
    this.tipo = tipo;
    this.quilometragem = 0;
  }

  public Veiculo(String placa, String modelo, String tipo, int quilometragem){
    this.placa = placa;
    this.modelo = modelo;
    this.tipo = tipo;
    this.quilometragem = quilometragem;
  }

  public Double calcularLocacao(int dias){
	Double total = 0.0;
	if("economico".equalsIgnoreCase(this.tipo)){
		total = (100.0 * dias) + (0.10 * (dias * 100.0));
	} else if("suv".equalsIgnoreCase(this.tipo)){
		total = (150.0 * dias) + (0.10 * (dias * 100.0));
	} else if("luxo".equalsIgnoreCase(this.tipo)){
		total = (250 * dias) + (0.10 * (dias * 100.0));
	}
	
	this.quilometragem += (dias * 100);
    return total;
  }


  public Double calcularLocacao(int dias, int kmRodados){
	Double total = 0.0;
	
	if("economico".equalsIgnoreCase(this.tipo)){
		total = (100.0 * dias) + (0.10 * kmRodados);
	} else if("suv".equalsIgnoreCase(this.tipo)){
		total = (150.0 * dias) + (0.10 * kmRodados);
	} else if("luxo".equalsIgnoreCase(this.tipo)){
		total = (250 * dias) + (0.10 * kmRodados);
	}
	this.quilometragem += kmRodados;
    return total;
  }
  
  public Double calcularLocacao(int dias, int kmRodados, boolean seguro){
    Double total = 0.0;

	if("economico".equalsIgnoreCase(this.tipo)){
		total = (100.0 * dias) + (0.10 * kmRodados);
	} else if("suv".equalsIgnoreCase(this.tipo)){
		total = (150.0 * dias) + (0.10 * kmRodados);
	} else if("luxo".equalsIgnoreCase(this.tipo)){
		total = (250 * dias) + (0.10 * kmRodados);
	}

	this.quilometragem += kmRodados;
	
    if(seguro){
      total += (50 * dias);
    }

    return total;
  }

  public String exibirDetalhes(){
	String detalhes;
	detalhes = "Placa: " + this.placa + "Modelo: " + this.modelo + "Tipo: " + this.tipo + "Quilometragem: " + this.quilometragem;
	return detalhes;
  }
}

