package gabriel.estudosJava.exercicios.secaoTres;

import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int codigoProduto = sc.nextInt();
        int qntdProduto = sc.nextInt();

        switch (codigoProduto) {
            case 1:
                System.out.println("Total: R$ " + String.format("%.2f", (qntdProduto * 4.00)));
                break;
            case 2:
                System.out.println("Total: R$ " + String.format("%.2f", (qntdProduto * 4.50)));
                break;
            case 3:
                System.out.println("Total: R$ " + String.format("%.2f", (qntdProduto * 5.00)));
                break;
            case 4:
                System.out.println("Total: R$ " + String.format("%.2f", (qntdProduto * 2.00)));
                break;
            case 5:
                System.out.println("Total: R$ " + String.format("%.2f", (qntdProduto * 1.50)));
                break;
            default:
                break;
        }
        sc.close();
    }
}
