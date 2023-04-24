package Composite;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArvoreTest {
    @Test
    void deveRetornarSkillsArvoreHabilidade(){
        Categoria categoria1 = new Categoria("Habilidade de alvo unico");

        Categoria categoria2 = new Categoria("Habilidade de multiplos alvos");
        Habilidade habilidade21 = new Habilidade("Meteoro divino", 40);
        categoria2.addConteudo(habilidade21);

        Categoria categoria3 = new Categoria("Habilidade passiva");
        Habilidade habilidade31 = new Habilidade("Benção dos reis", 10);
        Habilidade habilidade32 = new Habilidade("Solo consagrado", 5);
        categoria3.addConteudo(habilidade31);
        categoria3.addConteudo(habilidade32);

        Categoria skill = new Categoria("Habilidades de poder sagrado");
        skill.addConteudo(categoria1);
        skill.addConteudo(categoria2);
        skill.addConteudo(categoria3);

        ArvoreHabilidades arvoreHabilidades = new ArvoreHabilidades();
        arvoreHabilidades.setSkill(skill);

        assertEquals("Categoria: Habilidades de poder sagrado\n" +
                "Categoria: Habilidade de alvo unico\n" +
                "Categoria: Habilidade de multiplos alvos\n" +
                "Habilidade: Meteoro divino - dano causado = 40\n" +
                "Categoria: Habilidade passiva\n" +
                "Habilidade: Benção dos reis - dano causado = 10\n" +
                "Habilidade: Solo consagrado - dano causado = 5\n", arvoreHabilidades.getSkill());
    }

    @Test
    void deveRetornarExecaoArvoreHabilidadeSemSkill(){
        try{
            ArvoreHabilidades arvoreHabilidades = new ArvoreHabilidades();
            arvoreHabilidades.getSkill();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Arvore de habilidades sem skills selecionadas", e.getMessage());
        }
    }
}
