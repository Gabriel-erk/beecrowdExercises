package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raioEsfera = sc.nextDouble();
        final double PI = 3.14159;
        double volume = (4 / 3.0) * PI * Math.pow(raioEsfera, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

        sc.close();
    }
}
