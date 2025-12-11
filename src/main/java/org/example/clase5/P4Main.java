package org.example.clase5;

public class P4Main {
    public static void main(String[] args) {
        P4CuentaBancaria cuentabancaria = new P4CuentaBancaria(50);

        try {
            cuentabancaria.transferir(500);
        }catch(P4SaldoInsuficiente e){
            var saldo= cuentabancaria.getSaldo();
            cuentabancaria.transferir(saldo);
        }
    }
}
