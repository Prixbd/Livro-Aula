package InfFuncionario;

public enum SexoFun {

Masculino("Masculino"),
Feminino("Feminino");

private String texto;


private SexoFun(String texto) {
    this.texto = texto;
}


public String getTexto(){
    return texto;
}




}
