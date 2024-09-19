package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        final int PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
