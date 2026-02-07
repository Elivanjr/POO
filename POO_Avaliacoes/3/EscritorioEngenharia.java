public class EscritorioEngenharia{
    private ProfissionalEngenharia[] profissionais;

    public EscritorioEngenharia(){
        profissionais = new ProfissionalEngenharia[10];
    }

    public boolean adicionarProfissional(EngenheiroCivil e){
        for(int i = 0; i < profissionais.length; i++){
            if(profissionais[i] == null){
                profissionais[i] = e;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarProfissional(EngenheiroEletrico e){
        for(int i = 0; i < profissionais.length; i++){
            if(profissionais[i] == null){
                profissionais[i] = e;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarProfissional(EngenheiroMecanico e){
        for(int i = 0; i < profissionais.length; i++){
            if(profissionais[i] == null){
                profissionais[i] = e;
                return true;
            }
        }
        return false;
    }

    public ProfissionalEngenharia buscarProfissional(String nome){
        for(int i = 0; i < profissionais.length; i++){
            if(profissionais[i] != null && profissionais[i].getNome().equalsIgnoreCase(nome)){
                return profissionais[i];
            }
        }
        return null;
    }

    public double calcularCustoProjeto(ProfissionalEngenharia p, double horas){
        if (p instanceof EngenheiroCivil){
            return ((EngenheiroCivil) p).calcularCustoConstrucao(horas);
        }else if(p instanceof EngenheiroEletrico){
            return ((EngenheiroEletrico) p).calcularCustoInstalacao(horas);
        }else if(p instanceof EngenheiroMecanico){
            return ((EngenheiroMecanico) p).calcularCustoProjetoMecanico(horas);
        }
        return 0;
    }
}
