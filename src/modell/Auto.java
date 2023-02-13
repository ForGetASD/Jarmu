package modell;

import java.util.Random;

public class Auto extends Jarmu{
    private boolean defekt;

    public Auto() {
        super();
        this.defekt = false;
    }
    
    public void kereketCserel(){
        if (defekt == true) {
            this.defekt = false;
        }
    }
    @Override
    public boolean halad(){
//        Random rnd = new Random();
//        int defektSzam = rnd.nextInt(4);
//        if (defektSzam == 1) {
//            this.defekt = true;
//            return false;
//        }
//        return true;
        if (isBeinditva() == true) {
            return true;
        }
        return false;
    }
}
