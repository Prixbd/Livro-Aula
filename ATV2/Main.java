package ATV2;

public class Main {

    public static void main(String[] args) {
    
        Gerente gerente = new Gerente("João", "123.456.789-00", "01/01/2000", 5000.00, Bonificacao.GERENTE);
        Funcionario funcionario = new Funcionario("Maria", "987.654.321-00", "01/01/2000", 2000.00);

        System.out.println(gerente);
        System.out.println("Salário final do gerente: " + gerente.obterSalarioFinal());
        System.out.println(funcionario);
        System.out.println("Salário final do funcionário: " + funcionario.obterSalarioFinal());

        gerente.admitir(funcionario);
        gerente.demitir(funcionario);
}
}
