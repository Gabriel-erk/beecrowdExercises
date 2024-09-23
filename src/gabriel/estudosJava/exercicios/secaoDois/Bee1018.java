package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;
import java.util.Locale;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int valor = sc.nextInt();
        int guardaValor = valor;
        int notaDe100 = 0, notaDe50 = 0, notaDe20 = 0, notaDe10 = 0, notaDe5 = 0, notaDe2 = 0, notaDe1 = 0;

        while (valor > 0) {
            if (valor >= 100) {
                notaDe100++;
                valor -= 100;
            } else if (valor >= 50) {
                notaDe50++;
                valor -= 50;
            } else if (valor >= 20) {
                notaDe20++;
                valor -= 20;
            } else if (valor >= 10) {
                notaDe10++;
                valor -= 10;
            } else if (valor >= 5) {
                notaDe5++;
                valor -= 5;
            } else if (valor >= 2) {
                notaDe2++;
                valor -= 2;
            } else {
                notaDe1++;
                valor -= 1;
            }
        }
        System.out.println(guardaValor);
        System.out.println(notaDe100 + " nota (s) de R$ 100,00");
        System.out.println(notaDe50 + " nota (s) de R$ 50,00");
        System.out.println(notaDe20 + " nota (s) de R$ 20,00");
        System.out.println(notaDe10 + " nota (s) de R$ 10,00");
        System.out.println(notaDe5 + " nota (s) de R$ 5,00");
        System.out.println(notaDe2 + " nota (s) de R$ 2,00");
        System.out.println(notaDe1 + " nota (s) de R$ 1,00");

        sc.close();
    }
}
