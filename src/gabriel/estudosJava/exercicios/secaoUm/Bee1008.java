package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
        sc.close();
    }
}
