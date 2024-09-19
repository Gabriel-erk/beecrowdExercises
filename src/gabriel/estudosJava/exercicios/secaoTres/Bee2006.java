package gabriel.estudosJava.exercicios.secaoTres;
import java.util.Scanner;

public class Bee2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoCha = sc.nextInt();
        int qntdRespostasCorretas = 0;
        int[] escolhasUsuarios = new int[5];

        for (int i = 0; i < escolhasUsuarios.length; i++) {
            /* pegando cada escolha do usuário */
            escolhasUsuarios[i] = sc.nextInt();
            if (escolhasUsuarios[i] == tipoCha) {
                qntdRespostasCorretas++;
            }
        }
        System.out.println(qntdRespostasCorretas);
    }
}
