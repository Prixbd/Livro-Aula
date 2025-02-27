package atividade_1;

public class DispositivoArmazenamento extends Junto {

    private int capacidade;
    private String TipoConexao;

    
    public DispositivoArmazenamento(String marca, String modelo, int capacidade, String tipoConexao) {
        super(marca, modelo);
        this.capacidade = capacidade;
        TipoConexao = tipoConexao;
    }


    public int getCapacidade() {
        return capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public String getTipoConexao() {
        return TipoConexao;
    }


    public void setTipoConexao(String tipoConexao) {
        TipoConexao = tipoConexao;
    }


    @Override
    public String toString() {
        return "DispositivoArmazenamento [Marca=" + Marca + ", capacidade=" + capacidade + ", Modelo=" + Modelo
                + ", TipoConexao=" + TipoConexao + "]";
    }

    
}

