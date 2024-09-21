package gabriel.estudosJava.exercicios.secaoTres;

import java.util.Scanner;

public class Bee1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosDesordenados = new int[3];
        int[] numerosOrdenado = new int[3];

        for (int i = 0; i < numerosDesordenados.length; i++) {
            numerosDesordenados[i] = sc.nextInt();
            if (numerosDesordenados[i] > numerosDesordenados[1] && numerosDesordenados[i] > numerosDesordenados[2]) {
                numerosOrdenado[i] = numerosDesordenados[i];
            } else if (numerosDesordenados[i] > numerosDesordenados[1] && numerosDesordenados[i] < numerosDesordenados[2]) {
                numerosOrdenado[i] = numerosDesordenados[i];
            }
        }
        System.out.println(numerosOrdenado[0]);
        System.out.println(numerosOrdenado[1]);
    }
}
