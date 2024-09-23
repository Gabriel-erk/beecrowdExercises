package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        final double PI = 3.14159;

        double areaTrianguloRetangulo = (A * C) / 2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaTrianguloRetangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));

        sc.close();
    }
}
