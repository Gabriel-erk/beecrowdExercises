package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Locale;
import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        /*
         * uma hora = 30km de distancia do outro carro
         * 1km a cada 2 minutos (resultado obtido ao dividir os 60 minutos de uma hora
         * pelo total de km percorridos em uma hora)
         * pegar um valor em km e descobrir em quanto tempo (em minutos) o carro y
         * (carro com velocidade de 90km/h) leva para tomar essa distância do outro
         * carro
         * 1km = 2 minutos (em velocidade de 90km/h)
         * 1 hora = 30km
         * para descobrir quanto tempo leva em minutos para o carro y pegar a velocidade
         * desejada basta multiplicar a velocidade passada por 2 (já que em 2 minutos
         * percorre 1km)
         */
        int distanciaEmKm = sc.nextInt();
        int minutosParaUmKm = 2;
        System.out.println((distanciaEmKm * minutosParaUmKm) + " minutos");

        sc.close();
    }
}
