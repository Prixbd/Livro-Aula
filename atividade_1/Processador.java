package atividade_1;

public class Processador extends Junto {

    private int capacidadeArmazenamento;

    public Processador(String marca, String modelo, int capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Processador [Marca=" + Marca + ", capacidadeArmazenamento=" + capacidadeArmazenamento + ", Modelo="
                + Modelo + "]";
    }

    
}
