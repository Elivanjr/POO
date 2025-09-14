class Personagem{
    String nome;
    int vida;
    int ataque;

    public Personagem (String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

     public int Bater(Inimigo alvo){
        alvo.vida -= this.ataque;
        System.out.printf("A heroína %s deu %d de dano no monstro %n", this.nome, this.ataque);
        return alvo.vida;
    }
    
    public int Defender(Inimigo alvo){
		this.vida -= alvo.ataque;
        System.out.printf("A heroína %s se defendeu do ataque do %s, mas perdeu %d de vida e só tem %d sobrando.%n", this.nome, alvo.especie, alvo.ataque, this.vida);
        return this.vida;
    }
}
