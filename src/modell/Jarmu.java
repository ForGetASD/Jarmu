package modell;

public abstract class Jarmu {
    private boolean beinditva = false, megerkezett = false;
    private boolean uzemanyag = true;
    
    public void beindit(){
        this.beinditva = true;
    }
    public void leallit(){
        this.beinditva = false;
    }
    public boolean tankol(){
        if (uzemanyag == false && beinditva == false) {
            this.uzemanyag = true;
            return true;
        }
        return false;
    }
    
    public boolean halad(){
        if (beinditva == true && uzemanyag == true && megerkezett == false) {
            this.uzemanyag = false;
            this.beinditva = false;
            return true;
        }
        return false;
    }
}
