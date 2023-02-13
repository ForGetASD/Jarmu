package modell;

public abstract class Jarmu {

    private boolean beinditva;
    private boolean megerkezett, uzemanyag;

    public Jarmu() {
        this.beinditva = false;
        this.megerkezett = false;
        this.uzemanyag = true;
    }
    
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
            this.megerkezett = true;
            return true;
        }
        return false;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    
  
}
