package gabriel.estudosJava.exercicios.secaoUm;

import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine para ler a linha inteira, incluindo espaços
        String nomeVendedor = sc.nextLine();
        double salarioVendedor = sc.nextDouble();
        double vendasEfetuadasMes = sc.nextDouble();

        double lucroFinalMes = vendasEfetuadasMes * 0.15;

        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL = R$ " +  String.format("%.2f", (salarioVendedor + lucroFinalMes)));

        sc.close();
    }
}
