package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do depósito inicial:");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    conta.consultarSaldo();
                    break;

                case 2:
                    conta.consultarChequeEspecial();
                    break;

                case 3:
                    System.out.println("Digite o valor do depósito:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 4:
                    System.out.println("Digite o valor do saque:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 5:
                    System.out.println("Digite o valor do boleto:");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;

                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}