package br.edu.ifsul.model;

public abstract class Conta {
    protected double saldo;

    public Conta(){
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void deposita(double valor);

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void saca(double valor);

    public abstract void atualiza(double taxa);

}
