package model;

import exception.SaldoInsuficienteException;

public abstract class Conta {
    protected int numero;
    protected String nome;
    protected double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public void depositar(double valor){
        this.saldo += valor;
    }
}
