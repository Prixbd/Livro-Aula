package exemplo;


public class Diretor extends funcionario implements Contratacao {
    private final double PREMIO = 1.2;

    public Diretor(String nome, String dataDeNascimento, String sexo, String setor, double salario) {
        super(nome, dataDeNascimento, sexo, setor, salario);
    }

    @Override
    public void contratar(Funcionario funcionario) {
        System.out.println("Contratando funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.toString());
    }

    @Override

    public double getSalarioFinal() {
        return this.salario * PREMIO;
    }

}
