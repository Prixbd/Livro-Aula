package ATV3;

public class Cliente {

    private String Nome;
    private int Idade;
    private int CPF;
    private String Endereco;
    private int telefone;

    public Cliente(String nome, int idade, int cPF, String endereco, int telefone) {
        Nome = nome;
        Idade = idade;
        CPF = cPF;
        Endereco = endereco;
        this.telefone = telefone;
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
