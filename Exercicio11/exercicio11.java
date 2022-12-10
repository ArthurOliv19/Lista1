import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        // declarando as variaveis
        int inteiro1, inteiro2;
        double numReal;
        double calcProb1Result1, calcProb1Result2, resultadoFinalProb1, transformar, transformar2, resultadoFinalProb2,
                resultadoFinalProb3;
        // recebendo dados do teclado
        Scanner teclado = new Scanner(System.in);
        // atribuindo os valores do usuário nas variaveis
        inteiro1 = teclado.nextInt();
        inteiro2 = teclado.nextInt();
        numReal = teclado.nextDouble();
        teclado.close();
        // transformando a variavel int em variavel double
        transformar = inteiro1;
        transformar2 = inteiro2;
        // fazendo os calculos problema 1
        calcProb1Result1 = transformar * 2;
        calcProb1Result2 = transformar2 / 2;
        resultadoFinalProb1 = calcProb1Result1 * calcProb1Result2;
        // fazendo calculos problema 2
        resultadoFinalProb2 = transformar * 3 + numReal;
        // fazendo calculos problema 3
        resultadoFinalProb3 = Math.pow(numReal, 3);
        // exibindo resultado
        System.out.println("O resultado do problema 1 é: " + resultadoFinalProb1);
        System.out.println("O resultado do problema 2 é: " + resultadoFinalProb2);
        System.out.println("O resultado do problema 3 é: " + resultadoFinalProb3);
    }
}
