package Composite;

public class ArvoreHabilidades {
    private Conteudo skill;

    public void setSkill(Conteudo skill){
        this.skill = skill;
    }

    public String getSkill(){
        if (this.skill == null){
            throw new NullPointerException("Arvore de habilidades sem skills selecionadas");
        }
        return this.skill.getConteudo();
    }
}
