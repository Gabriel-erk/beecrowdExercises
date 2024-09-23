package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));

        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}
