package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida = sc.nextInt();
        double combustivelGasto = sc.nextDouble();

        System.out.println(String.format("%.3f", (distanciaPercorrida / combustivelGasto)) + " " + "km/l");

        sc.close();
    }
}
