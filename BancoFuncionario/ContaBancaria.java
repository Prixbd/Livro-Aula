package BancoFuncionario;

public class ContaBancaria {

private String Banco;
private int Agencia;
private int NumeroDaConta;
private String TipoDeConta;
private float SaldoAtual;
private float LimiteDisponivel;



public ContaBancaria() {
}



public ContaBancaria(String banco, int agencia, int numeroDaConta, String tipoDeConta, float saldoAtual,
        float limiteDisponivel) {
    Banco = banco;
    Agencia = agencia;
    NumeroDaConta = numeroDaConta;
    TipoDeConta = tipoDeConta;
    SaldoAtual = saldoAtual;
    LimiteDisponivel = limiteDisponivel;
}



public String getBanco() {
    return Banco;
}
public void setBanco(String banco) {
    Banco = banco;
}
public int getAgencia() {
    return Agencia;
}
public void setAgencia(int agencia) {
    Agencia = agencia;
}
public int getNumeroDaConta() {
    return NumeroDaConta;
}
public void setNumeroDaConta(int numeroDaConta) {
    NumeroDaConta = numeroDaConta;
}
public String getTipoDeConta() {
    return TipoDeConta;
}
public void setTipoDeConta(String tipoDeConta) {
    TipoDeConta = tipoDeConta;
}
public float getSaldoAtual() {
    return SaldoAtual;
}
public void setSaldoAtual(float saldoAtual) {
    SaldoAtual = saldoAtual;
}
public float getLimiteDisponivel() {
    return LimiteDisponivel;
}
public void setLimiteDisponivel(float limiteDisponivel) {
    LimiteDisponivel = limiteDisponivel;
}



@Override
public String toString() {
    return "ContaBancaria [Banco=" + Banco + ", Agencia=" + Agencia + ", NumeroDaConta=" + NumeroDaConta
            + ", TipoDeConta=" + TipoDeConta + ", SaldoAtual=" + SaldoAtual + ", LimiteDisponivel=" + LimiteDisponivel
            + "]";
}





}
