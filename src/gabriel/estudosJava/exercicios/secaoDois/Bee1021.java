package gabriel.estudosJava.exercicios.secaoDois;

import java.util.Scanner;
import java.util.Locale;

public class Bee1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double valor = sc.nextDouble();

        System.out.println("NOTAS:");
        // utilizando cache, estou dizendo que quero que o retorno da divisão da váriavel valor (do tipo double) por 100 seja um número inteiro, já que não posso atribuir o resultado da operação de uma váriavel double para uma váriavel inteiro
        // dividindo por 100, consigo obter a quantidade de notas necessárias de 100 daquele valor em especifico
        // aqui eu obtenho quantas vezes eu posso dividir aquele valor por 100, ou seja, quantas notas de 100 eu vou ter
        int resultado = (int)valor/100;
        System.out.println(resultado + " nota(s) de R$ 100.00");
        // mudando o valor da váriavel valor para o resto da sua divisão por 100, que resulta em um número que já não é mais uma centena, ou seja, não vou mai utilizar a nota de 100
        valor = valor % 100;

        resultado = (int)valor / 50;
        System.out.println(resultado + " nota(s) de R$ 50.00");
        valor = valor % 50;

        resultado = (int)valor / 20;
        System.out.println(resultado + " nota(s) de R$ 20.00");
        valor = valor % 20;

        resultado = (int)valor / 10;
        System.out.println(resultado + " nota(s) de R$ 10.00");
        valor = valor % 10;

        resultado = (int)valor / 5;
        System.out.println(resultado + " nota(s) de R$ 5.00");
        valor = valor % 5;

        resultado = (int)valor / 2;
        System.out.println(resultado + " nota(s) de R$ 2.00");
        valor = valor % 2;

        /*
         * multiplicando por 100, por conta das moedas, e para evitar dar número negativo, como a plataforma diz
         * multiplicando por 100, e dpois dividindo, conseguimos o valor em moedas - resultado = (int)valor / 100; o resultado dessa divisão é o valor em moedas, já que estamos multiplicando o valor que está == ou menor que 1 real, multiplicando 1.50 por 100 (possivel resultado, pois caso o valor de resultado chegue mesmo a 1.50 era isso que iria acontecer por debaixo dos panos) == 150, dividio por 100 1,50, arredondando p inteiro (com o cache (int)) == 1 nota de real
         * valor = valor % 100, ou seja resto da divisão de 1,50 por 100 = 0,015, passa para o próximo multiplicando por 50 para calcular 50 cent e por ai vai...
         */
        valor = valor * 100;

        System.out.println("MOEDAS:");
        resultado = (int)valor / 100;
        System.out.println(resultado + " moeda(s) de R$ 1.00");
        valor = valor % 100;


        // (valor / 0.50) primeiro realiza a operação matemática dos valores, que retorna um double e somente DEPOIS converte para um valor inteiro, (int)valor, converte a váriavel valor para um inteiro, porém quero apenas o RESULTADO da divisão de valor por 0.50 como um inteiro, então primeiro realizo a divisão (valor / 0.50) e dpois a conversão (int)(valor / 0.50)
        resultado = (int)valor / 50;
        System.out.println(resultado + " moeda(s) de R$ 0.50");
        valor = valor % 50;

        resultado = (int)valor / 25;
        System.out.println(resultado + " moeda(s) de R$ 0.25");
        valor = valor % 25;

        resultado = (int)valor / 10;
        System.out.println(resultado + " moeda(s) de R$ 0.10");
        valor = valor % 10;

        resultado = (int)valor / 5;
        System.out.println(resultado + " moeda(s) de R$ 0.05");
        valor = valor % 5;

        resultado = (int) valor;
        System.out.println(resultado + " moeda(s) de R$ 0.01");

        sc.close();
    }
    }
