package br.com.tarefas;


import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo: ");

        double saldo = scanner.nextDouble();

        double saldoReajustado = (saldo * 0.01) + saldo;
        System.out.println(saldoReajustado);


    }
}
