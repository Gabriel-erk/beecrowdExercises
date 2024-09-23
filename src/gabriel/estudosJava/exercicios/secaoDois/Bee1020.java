package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;
import java.util.Locale;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int ano = 0;
        int qntdMes = 0;
        int dia = 0;
        int qntdDias = sc.nextInt();

        for (int i = 0; i < qntdDias; i++) {

            if (qntdDias >= 365) {
                ano++;
                qntdDias -= 365;
                // segundo if não pode ficar aqui, if que iria verificar a qntde de meses, pois,
                // caso fosse apenas 29 dias, a primeira condição seria falsa, e não entraria
                // aqui dentro para verificar a qntde de meses
            } else {
                if (qntdDias >= 30) {
                    // qntdMes = qntdDias % 365;
                    qntdMes++;
                    qntdDias -= 30;
                } else {
                    dia = qntdDias;
                }
            }
        }
        System.out.println(ano + " " + "ano(s)");
        System.out.println(qntdMes + " " + "mes(es)");
        System.out.println(dia + " " + "dia(s)");

        sc.close();
    }
}
