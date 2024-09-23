package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;
import java.util.Locale;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int tempoEmSegundosEventoFabrica = sc.nextInt();
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (tempoEmSegundosEventoFabrica > 0) {
            if (tempoEmSegundosEventoFabrica >= 3600) {
                horas++;
                tempoEmSegundosEventoFabrica -= 3600;
            } else {
                if (tempoEmSegundosEventoFabrica >= 60) {
                    minutos++;
                    tempoEmSegundosEventoFabrica -= 60;
                } else {
                    segundos = tempoEmSegundosEventoFabrica;
                    tempoEmSegundosEventoFabrica -= tempoEmSegundosEventoFabrica;
                }
            }
        }

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
