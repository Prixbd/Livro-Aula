package ATV2;

public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Gerente admitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Gerente demitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public double obterSalarioFinal() {
        return getSalarioBase() * bonificacao.getValor();
    }

    @Override
    public String toString() {
        return super.toString() + "Bonificação: " + bonificacao + "\n";
    }
}



