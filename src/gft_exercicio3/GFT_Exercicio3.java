package gft_exercicio3;
import java.util.Random;

public class GFT_Exercicio3 {

    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro ("GUERREIRO", 200, 200, 5, 20, 7, 4);
        g1.lvlUp();
        System.out.println("Atack do guerreiro: " + g1.attack() + "\n");
        
        Mago m1 = new Mago ("MAGO", 50, 200, 10, 10, 5, 0);
        m1.lvlUp();
        System.out.println("Atack do mago: " + m1.attack());
    }
    
}
