package org.example;

import java.util.Scanner;

class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {

        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            limiteChequeEspecial = 50;
        } else {
            limiteChequeEspecial = depositoInicial * 0.5;
        }

        chequeEspecialUsado = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite cheque especial: R$ " + limiteChequeEspecial);
        System.out.println("Cheque especial usado: R$ " + chequeEspecialUsado);
    }

    public void depositar(double valor) {

        saldo += valor;

        if (chequeEspecialUsado > 0) {

            double taxa = chequeEspecialUsado * 0.20;
            double totalDevido = chequeEspecialUsado + taxa;

            if (saldo >= totalDevido) {
                saldo -= totalDevido;
                chequeEspecialUsado = 0;
                System.out.println("Cheque especial quitado com taxa de R$ " + taxa);
            }
        }

        System.out.println("Depósito realizado.");
    }

    public void sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {

            double restante = valor - saldo;

            if (restante <= (limiteChequeEspecial - chequeEspecialUsado)) {

                saldo = 0;
                chequeEspecialUsado += restante;
                System.out.println("Saque realizado utilizando cheque especial.");

            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }

    public void verificarUsoChequeEspecial() {

        if (chequeEspecialUsado > 0) {
            System.out.println("Conta está usando cheque especial.");
        } else {
            System.out.println("Conta NÃO está usando cheque especial.");
        }
    }
}