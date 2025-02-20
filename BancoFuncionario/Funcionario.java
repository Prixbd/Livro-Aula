package BancoFuncionario;

public class Funcionario {

    private int CodigoDOFuncionario;
    private String Nome;
    private String Endereco;
    private int Telefone;
    private String Email;
    private ContaBancaria ContaBancaria;



    
    public Funcionario() {
    }


    public Funcionario(int codigoDOFuncionario, String nome, String endereco, int telefone, String email,
            BancoFuncionario.ContaBancaria contaBancaria) {
        CodigoDOFuncionario = codigoDOFuncionario;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
        Email = email;
        ContaBancaria = contaBancaria;
    }




    public int getCodigoDOFuncionario() {
        return CodigoDOFuncionario;
    }




    public void setCodigoDOFuncionario(int codigoDOFuncionario) {
        CodigoDOFuncionario = codigoDOFuncionario;
    }




    public String getNome() {
        return Nome;
    }




    public void setNome(String nome) {
        Nome = nome;
    }




    public String getEndereco() {
        return Endereco;
    }




    public void setEndereco(String endereco) {
        Endereco = endereco;
    }




    public int getTelefone() {
        return Telefone;
    }




    public void setTelefone(int telefone) {
        Telefone = telefone;
    }




    public String getEmail() {
        return Email;
    }




    public void setEmail(String email) {
        Email = email;
    }




    public ContaBancaria getContaBancaria() {
        return ContaBancaria;
    }




    public void setContaBancaria(ContaBancaria contaBancaria) {
        ContaBancaria = contaBancaria;
    }


    @Override
    public String toString() {
        return "Funcionario [CodigoDOFuncionario=" + CodigoDOFuncionario + ", Nome=" + Nome + ", Endereco=" + Endereco
                + ", Telefone=" + Telefone + ", Email=" + Email + ", ContaBancaria=" + ContaBancaria + "]";
    }






    

}

