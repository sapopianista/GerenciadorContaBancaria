package model;

import exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <=0){
            throw new SaldoInsuficienteException("Valor insuficiente para saque!");
        }

        if (valor > saldo){
            throw new SaldoInsuficienteException("Valor insuficiente para saque!");
        }
    }
}
