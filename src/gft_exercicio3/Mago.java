package gft_exercicio3;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
    
public Mago (String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    }

private List<String> magia;

public List<String> getMagia() {
    return magia;
    }

public void setMagia(List<String> magia) {
    this.magia = magia;
    }

@Override
public void lvlUp() {
    this.getVida();
    this.getForca();
    this.getLevel();
    System.out.println("|---E V O L U Ç Ã O DO M A G O---|");
    System.out.println("Level: " + getLevel() + 1);
    System.out.println("Vida: " + getVida() + 1);
    System.out.println("Forca: " + getForca() + 1);
    }

@Override
public int attack() {
    Random random = new Random();
    int var = (this.getInteligencia() * this.getLevel()) + random.nextInt(301);
        return var;
}

public void aprenderMagia (String magia ) {
    
}
}
