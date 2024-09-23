package gabriel.estudosJava.exercicios.secaoTres;

import java.util.Locale;
import java.util.Scanner;

public class Bee1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // definindo o tamanho do array em 4, pois, caso eu não defina um tamanho para ele, o seu tamanho sempre vai ser como 0, e não irá fazer o que quero no loop - foi inicializado como um array vazio antes, logo nunca seria executado
        // e não poderia armazenar nenhum valor nele, pois não teria nenhum espaço alocado, agora possui 4 espaços do tipo inteiro
        int[] valores = new int[4];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        if (valores[1] > valores[2] && valores[3] > valores[0] && valores[2] + valores[3] > valores[0] + valores[1] && valores[2] > 0 && valores[3] > 0 && valores[0] % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }

        sc.close();
    }
}
