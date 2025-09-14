class Inimigo{
    String especie;
    int vida;
    int ataque;

    public Inimigo (String especie, int vida, int ataque){
        this.especie = especie;
        this.vida = vida;
        this.ataque = ataque;
    }

     public int Bater(Personagem alvo){
        alvo.vida -= this.ataque;
        System.out.printf("%s causou %d de dano na heroína %s %n", this.especie, this.ataque, alvo.nome);
        return alvo.vida;
    }
    
    public int Defender(Personagem alvo){
        this.vida -= alvo.ataque;
        System.out.printf("%s se defendeu do ataque da heroína %s, mas perdeu %d de vida e só tem %d sobrando.%n", this.especie, alvo.nome, alvo.ataque, this.vida);
        return this.vida;
    }
}
