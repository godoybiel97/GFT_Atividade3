package gft_exercicio3;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

public Guerreiro (String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    }

private List<String> habilidade;
    public List<String> getHabilidade() {
        return habilidade;
    }
    
public void setHabilidade(List<String> habilidade) {
    this.habilidade = habilidade;
    }

@Override
public void lvlUp() {
    this.getMana();
    this.getInteligencia();
    this.getLevel();
    System.out.println("|---E V O L U Ç Ã O DO G U E R R E I R O---|");
    System.out.println("Level: " + getLevel() + 1);
    System.out.println("Mana: " + getMana() + 1);
    System.out.println("Inteligencia: " + getInteligencia() + 1);
    }

@Override
public int attack() {
    Random random = new Random();
    int var = (this.getForca() * this.getLevel()) + random.nextInt(301);
    return var;
    }

public void aprenderHabilidade (String habilidade ) {
   	 
    }

}
