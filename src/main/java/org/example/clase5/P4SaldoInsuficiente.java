package org.example.clase5;

public class P4SaldoInsuficiente extends RuntimeException{

    //No se pueden usar los dos constructores al mismo tiempo, es uno u otro
    public P4SaldoInsuficiente() {
        super("Error: saldo insuficiente");
    }

    public P4SaldoInsuficiente(String message) {
        super(message);
    }
}
