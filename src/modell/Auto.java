package modell;

import java.util.Random;

public class Auto extends Jarmu{
    private boolean defekt;
    
    public void kereketCserel(){
        if (defekt == true) {
            this.defekt = false;
        }
    }
    @Override
    public boolean halad(){
        Random rnd = new Random(4);
        int defektSzam = rnd.nextInt();
        if (defektSzam == 1) {
            this.defekt = true;
            return false;
        }
        return true;
    }
}
