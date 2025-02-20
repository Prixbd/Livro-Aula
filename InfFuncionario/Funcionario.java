package InfFuncionario;

public class Funcionario {

    private int id;
    private String Nome;
    private float Salario;
    private Setor Setor;
    private SexoFun sexo;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, float salario, InfFuncionario.Setor setor, SexoFun sexo, int idade) {
        this.id = id;
        Nome = nome;
        Salario = salario;
        Setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public Setor getSetor() {
        return Setor;
    }

    public void setSetor(Setor setor) {
        Setor = setor;
    }

    public SexoFun getSexo() {
        return sexo;
    }

    public void setSexo(SexoFun sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", Nome=" + Nome + ", Salario=" + Salario + ", Setor=" + Setor + ", sexo="
                + sexo + ", idade=" + idade + "]";
    }
    

    
}