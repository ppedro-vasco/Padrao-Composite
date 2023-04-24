package Composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Conteudo{
    private List<Conteudo> conteudos;

    public Categoria(String descricaoHabilidade) {
        super(descricaoHabilidade);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }
    public String getConteudo(){
        String saida = "";
        saida = "Categoria: " + this.getDescricaoHabilidade() + "\n";
        for (Conteudo conteudo : conteudos){
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}


