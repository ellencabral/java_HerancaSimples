package br.edu.ifsul.model;

public class ContaCorrente extends Conta {
    private double limite = 2000;

    public ContaCorrente(){

    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        if ((valor + limite) <= saldo) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void atualiza(double taxa) {

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
