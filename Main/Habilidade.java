package Composite;

public class Habilidade extends Conteudo{
    private int dano;

    public Habilidade(String descricaoHabilidade, int dano){
        super(descricaoHabilidade);
        this.dano = dano;
    }

    public int getDano(){
        return dano;
    }

    public void setDano(int dano){
        this.dano = dano;
    }

    public String getConteudo(){
        return "Habilidade: " + this.getDescricaoHabilidade() + " - dano causado = " + this.dano + "\n";
    }
}
