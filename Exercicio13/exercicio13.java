import java.util.Scanner;

public class exercicio13 {
    // Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
    // que calcule seu peso ideal,
    // utilizando as seguintes fórmulas:
    // Para homens: (72.7*h) - 58
    // Para mulheres: (62.1*h) - 44.7
    public static void main(String[] args) throws java.io.IOException {
        // 1) Ação do usuário: informar sexo e altura do indivíduo
        Scanner teclado = new Scanner(System.in);
        double sexo;
        double h, psIdeal;

        System.out.printf("Informe o sexo (M/F): ");
        sexo = (char) System.in.read();

        System.out.printf("Informe a altura (m): ");
        h = teclado.nextDouble();
        teclado.close();
        // 2) Ação do sistema: calcular peso ideal conforme fórmulas

        if ((sexo == 'M') || (sexo == 'm'))
            psIdeal = (72.7 * h) - 58;
        else
            psIdeal = (62.1 * h) - 44.7;
        // 3) Resposta do programa: informar peso ideal de um homem ou uma mulher

        System.out.printf("\nO Peso Ideal eh: %6.2f kgs.\n", psIdeal);
    }

}
