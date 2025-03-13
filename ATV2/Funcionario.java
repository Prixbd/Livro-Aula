package ATV2;

public  class Funcionario implements SalarioFinal {

    protected String nome;
    protected String cpf;
    protected String dataDeNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataDeNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Data de Nascimento: " + dataDeNascimento + "\n" + "Salário Base: " + salarioBase + "\n";
    }

    @Override

    public double obterSalarioFinal() {
        return salarioBase;
    }

}
