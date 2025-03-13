package ATV2;

public class Motoboy extends Funcionario{

    private String PlacaDaMoto;


    public Motoboy(String nome, String cpf, String dataDeNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataDeNascimento, salarioBase);
        PlacaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return PlacaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        PlacaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + "Placa da Moto: " + PlacaDaMoto + "\n";
    }

}
