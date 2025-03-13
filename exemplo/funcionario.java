package exemplo;

public abstract class funcionario {

    protected String nome;
    protected String dataDeNascimento;
    protected String sexo;
    protected String setor;
    protected double salario;

    public funcionario(String nome, String dataDeNascimento, String sexo, String setor, double salario) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    public abstract double getSalarioFinal();

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataDeNascimento + "\nSexo: " + sexo + "\nSetor: " + setor + "\nSalário: " + salario;
    }       






}
