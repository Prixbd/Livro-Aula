package atividade_1;

public class Memoria extends Junto{

    private int Frequencia;
    private int Capacidadearmazenamento;

    
    public Memoria(String marca, String modelo, int frequencia, int capacidadearmazenamento) {
        super(marca, modelo);
        Frequencia = frequencia;
        Capacidadearmazenamento = capacidadearmazenamento;
    }


    public int getFrequencia() {
        return Frequencia;
    }


    public void setFrequencia(int frequencia) {
        Frequencia = frequencia;
    }


    public int getCapacidadearmazenamento() {
        return Capacidadearmazenamento;
    }


    public void setCapacidadearmazenamento(int capacidadearmazenamento) {
        Capacidadearmazenamento = capacidadearmazenamento;
    }


    @Override
    public String toString() {
        return "Memoria [Marca=" + Marca + ", Frequencia=" + Frequencia + ", Modelo=" + Modelo
                + ", Capacidadearmazenamento=" + Capacidadearmazenamento + "]";
    }

    

    

}
