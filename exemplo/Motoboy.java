package exemplo;

public class Motoboy extends funcionario {

    private String carteiraDeHabilitacao;

    public Motoboy (String nome, String dataDeNascimento, String sexo, String setor, double salario, String carteiraDeHabilitacao) {
        super(nome, dataDeNascimento, sexo, setor, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
 
@Override
public double getSalarioFinal() {
    return super.getSalario();
}
    
}
