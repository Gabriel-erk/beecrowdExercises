package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;
import java.util.Locale;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int tempoViagem = sc.nextInt();
        int velocidadeMediaViagemKmHora = sc.nextInt();

        // calculando distancia total
        double distanciaTotalViagem = tempoViagem * velocidadeMediaViagemKmHora;

        // dividindo distancia total por 12(que são os km por l que o carro faz), para descobrir quantos litros serão necessários para realizar a viagem inteira
        double qntdTotalLitros = distanciaTotalViagem / 12;

        System.out.printf("%.3f%n", qntdTotalLitros);
        sc.close();
    }
}
