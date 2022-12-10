import java.util.Scanner;

public class exercicio10 {
public static void main (String args []) {

    //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    double temperaturaC;
    double temperaturaF;

    System.out.println("Programa de Temperatura. Bem vindo");
    // passo 1- ação do usuário= temperatura em Celsius
    Scanner teclado = new Scanner(System.in);
    temperaturaC = teclado.nextDouble();
    teclado.close();
    // passo 2- tarefa do programa= transformar C em Fahrenheit
    temperaturaF = ( 9 * temperaturaC + 160 ) / 5;
    // passo 3- resposta do programa= mostrar temperatura em graus Fahrenheit
    System.out.print("A temperatura em graus Fahrenheit é");
    System.out.print(temperaturaF);
}
}
