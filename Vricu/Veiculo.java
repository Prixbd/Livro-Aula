package Vricu;

public class Veiculo {
    private String Placa;
    private String Cor;
    private int NumerosdePassageiros;
    private int Capacidadedetanque;
    private int VelocidadeMaxima;
    private int ConsumoMedio;

    
    public Veiculo(String placa, String cor, int numerosdePassageiros, int capacidadedetanque, int velocidadeMaxima,
            int consumoMedio) {
        Placa = placa;
        Cor = cor;
        NumerosdePassageiros = numerosdePassageiros;
        Capacidadedetanque = capacidadedetanque;
        VelocidadeMaxima = velocidadeMaxima;
        ConsumoMedio = consumoMedio;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public int getNumerosdePassageiros() {
        return NumerosdePassageiros;
    }
    public void setNumerosdePassageiros(int numerosdePassageiros) {
        NumerosdePassageiros = numerosdePassageiros;
    }
    public int getCapacidadedetanque() {
        return Capacidadedetanque;
    }
    public void setCapacidadedetanque(int capacidadedetanque) {
        Capacidadedetanque = capacidadedetanque;
    }
    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
    public int getConsumoMedio() {
        return ConsumoMedio;
    }
    public void setConsumoMedio(int consumoMedio) {
        ConsumoMedio = consumoMedio;
    }



    

}
