package Composite;

public abstract class Conteudo {
    String descricaoHabilidade;
    public Conteudo(String descricaoHabilidade){
        this.descricaoHabilidade = descricaoHabilidade;
    }

    public String getDescricaoHabilidade(){
        return descricaoHabilidade;
    }

    public void setDescricaoHabilidade(String descricaoHabilidade){
        this.descricaoHabilidade = descricaoHabilidade;
    }

    public abstract String getConteudo();
}
