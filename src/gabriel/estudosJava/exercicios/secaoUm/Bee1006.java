package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        double mediaFinal = ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.println("MEDIA = " + String.format("%.1f", mediaFinal));

        sc.close();
    }
}
