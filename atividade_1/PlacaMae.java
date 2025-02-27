package atividade_1;

public class PlacaMae  extends Junto{

    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae [Marca=" + Marca + ", soquete=" + soquete + ", Modelo=" + Modelo + "]";
    }



    
}
