package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca01 = sc.nextInt();
        int qntdDePeca01 = sc.nextInt();
        double valorUnitarioPeca01 = sc.nextDouble();

        double valorTotalPeca01 = qntdDePeca01 * valorUnitarioPeca01;

        int codigoPeca02 = sc.nextInt();
        int qntdDePeca02 = sc.nextInt();
        double valorUnitarioPeca02 = sc.nextDouble();

        double valorTotalPeca02 = qntdDePeca02 * valorUnitarioPeca02;

        double totalAPagar = valorTotalPeca01 + valorTotalPeca02;

        System.out.println("Códio peça 1: " + codigoPeca01);
        System.out.println("Códio peça 2: " + codigoPeca02);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalAPagar));

        sc.close();
    }
}
