package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        final int x = a + b;

        System.out.println("X = " + x);

        sc.close();
    }
}
