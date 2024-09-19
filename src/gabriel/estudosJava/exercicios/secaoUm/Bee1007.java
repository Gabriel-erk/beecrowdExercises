package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        final int DIFERENCA = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}
