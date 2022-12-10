import java.util.Scanner;

public class exercicio12 {
    // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
    // calcule seu peso ideal,
    // usando a seguinte fórmula: (72.7*altura) - 58
    public static void main (String[] args) {
        double altura;
        double pesoideal;
        // 1) Ação do usuário: entrar com a altura da pessoa
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite a altura: ");
        altura = teclado.nextDouble();
        teclado.close();
        // 2) Ação do sistema: calcular peso ideal, conforme fórmula:
        pesoideal = (72.7 * altura) - 58;
        // 3) Resposta do programa: mostrar peso ideal da pessoa
        System.out.println(" o seu peso ideal é " + pesoideal);
    }
}
