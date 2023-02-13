package test;

import modell.Auto;
import modell.Jarmu;

class Jarmuteszteleshez extends Jarmu{}

public class JarmuTest {
    public static void main(String[] args) {
        new JarmuTest();
    }

    public JarmuTest() {
        //mintaSablonTest();
        haladAutoBeinditasNelkulTeszt();
        haladAutoBeinditassalTeszt();
        
        haladJarmuBeinditassalTeszt();
    }

    private void haladAutoBeinditasNelkulTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "beinditas nélkül is haladt!";
    }
    
    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem halad";
    }
    
    private void haladJarmuBeinditassalTeszt() {
        Jarmuteszteleshez auto = new Jarmuteszteleshez();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem halad";
    }
    
    private void mintaSablonTest() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyenlőek";
    }
}
