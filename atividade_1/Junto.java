package atividade_1;

public abstract class Junto {

    protected String Marca;
    protected String Modelo;
    
    public Junto() {
    }

    public Junto(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override
    public String toString() {
        return "Junto [Marca=" + Marca + ", Modelo=" + Modelo + "]";
    }

    
}
