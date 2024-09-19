package gabriel.estudosJava.exercicios.secaoUm;
import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        /*
         * criando um novo objeto chamado sc que recebe uma nova instância da classe Scanner
         * o argumento System.in indica que o Scanner deve ler entradas de dados padrão, ou seja, do console (teclado)
         * System.in é um objeto de fluxo de entrada que recebe dados de entrada do usuário (dados digitados pelo usuário)
         */
        Scanner sc = new Scanner(System.in);

        /* vai colocar um número em '#' somente se o valor depois da vírgula for diferente de 0, então se houver 10.70, ficará: 10.7 */
        // DecimalFormat df = new DecimalFormat("#.####");

        double raio;
        double n = 3.14159;

        System.out.print("Digite o valor do raio: ");
        /*
         * aqui: 'nextDouble()' é utilizada para ler o próximo valor do tipo double que o usuário digitar no console
         * o Scanner espera o usuário digitar um valor e pressionar enter, e então converte essa entrada em um número do tipo 'double'
         * e então armazena na váriavel raio
         */
        raio = sc.nextDouble();

        // método math.pow para elevar raio a 2
        final double area = n * Math.pow(raio, 2);

        /*
         * concatenando a strin A= com o resultado da operação de string.format
         * string.format formate o valor para ter 4 casas decimais
         */
        System.out.println("A=" + String.format("%.4f", area));

        // não é estritamente necessário em programas pequenos, porém é utilizado como boas práticas, em sistemas grandes, este comando evita vazamento de dados
        sc.close();
    }
}
