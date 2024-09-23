package gabriel.estudosJava.exercicios.secaoTres;

import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args) {
        /*
         * funcionou utilizando float, pois, sua precisão de arredondamento é menor, o que faz com q certos números sejam representados de formas diferentes
         * no caso eu estava utilizando double, que tem uma maior precisão, o que arredeondava valores que eu não queria que arredondasse, fazendo com q não atinja o pedido pelo exercício
         */
        float[] notas = new float[4];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextFloat();
        }

        // multiplicando cada nota por seu respectivo peso e somando-as e dividindo pelo
        // resultado da soma de todos os pesos
        float media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 4) + (notas[3] * 1)) / 10;

        System.out.println("Media: " + String.format("%.1f", media));
        if (media >= 7.0 && media <= 10.0) {
            System.out.println("Aluno aprovado.");
        } else if (media <= 4.9) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");

            // System.out.println("digite a nota do exame: ");
            float notaExame = sc.nextFloat();

            System.out.println("Nota do exame: " + notaExame);

            float mediaFinal = (notaExame + media) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                /*
                 * por causa do java, está sendo arredondado para cima, quando queria que arredonsase para baixo, ex 4.85, será imprimido 4.9, 5 ou mais sobe e 5 ou menos desce, ent, 4,44, seria imprimido 4.4
                 * acontece pela forma de arredondamento que a linguagem faz através do string.format
                 */
                System.out.println("Media final: " + String.format("%.1f", mediaFinal));
            } else if (mediaFinal < 5.0) {
                System.out.println("Aluno reprovado.");
            }
        } else {
            System.out.println("foram passados notas inválidas para o cálculo da média");
        }
        sc.close();
    }
}
