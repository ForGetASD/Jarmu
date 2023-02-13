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
        //tanarur tesztjei
        //haladAutoBeinditasNelkulTeszt();
        //haladAutoBeinditassalTeszt();
        //haladJarmuBeinditassalTeszt();
        
        /*sajat tesztjeim*/
        //1. teszteset: haladásnál a jármű megérkezik
        //haladJarmuBeinditassalMegerkezikTeszt();
        //2. teszteset: haladás úgy hogy a jármű már megérkezett.
        //haladasJarmuMikorMarMegerkezettTeszt();
        //3. teszteset: jármű tankolható.
        jarmuTankolasTeszt();
        //4. teszteset: jarmű tankolása beinditott állapotnál.
        
        //5. teszteset: jarmű tankolás után halad és meg is érkezik.
    }

    private void jarmuTankolasTeszt(){
        Jarmuteszteleshez auto = new Jarmuteszteleshez();
        auto.setUzemanyag(false);
        boolean kapott = auto.tankol();
        boolean vart = true;
        assert kapott == vart : "autot nem lehetett megtankolni annak ellenére sem hogy üres a tank";
    }
    
    private void haladasJarmuMikorMarMegerkezettTeszt(){
        Jarmuteszteleshez auto = new Jarmuteszteleshez();
        auto.beindit();
        auto.setMegerkezett(true);
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "jarmu halad, de hova azt nem tudom";
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

    private void haladJarmuBeinditassalMegerkezikTeszt() {
        Jarmuteszteleshez auto = new Jarmuteszteleshez();
        auto.beindit();
        auto.halad();
        boolean kapott = auto.isMegerkezett();
        boolean vart = true;
        assert kapott == vart : "haladásnál nem érkezett meg.";
    }
    
    private void mintaSablonTest() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyenlőek";
    }
}
