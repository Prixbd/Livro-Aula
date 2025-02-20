package PetShop;

public class ClientePets {

    private String Nome;
    private int Idade;
    private Pets pet;


    public ClientePets() {
    }


    
    public ClientePets(String nome, int idade, Pets pet) {
        Nome = nome;
        Idade = idade;
        this.pet = pet;
    }



    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public Pets getPet() {
        return pet;
    }
    public void setPet(Pets pet) {
        this.pet = pet;
    }



    @Override
    public String toString() {
        return "ClientePets [Nome=" + Nome + ", Idade=" + Idade + ", pet=" + pet + "]";
    }




}
