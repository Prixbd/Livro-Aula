package PetShop;

public class Pets {

    private String nome;
    private int Idade;
    private String Raca;
    
    
    
    public Pets() {
    }



    public Pets(String nome, int idade, String raca) {
        this.nome = nome;
        Idade = idade;
        Raca = raca;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return Idade;
    }



    public void setIdade(int idade) {
        Idade = idade;
    }



    public String getRaca() {
        return Raca;
    }



    public void setRaca(String raca) {
        Raca = raca;
    }



    @Override
    public String toString() {
        return "Pets [nome=" + nome + ", Idade=" + Idade + ", Raca=" + Raca + "]";
    }



    
}
