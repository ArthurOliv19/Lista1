import java.util.Scanner;

public class exercicio9 {
public static void main (String args []) {

    //Faça um Programa que peça a temperatura em graus Fahrenheit, 
    //transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
    double temperaturaF;
    double temperaturaC;

    System.out.println("Programa de Temperatura. Bem vindo");
    // passo 1- ação do usuário= temperatura Fahrenheit
    Scanner teclado = new Scanner(System.in);
    temperaturaF = teclado.nextDouble();
    teclado.close();
    // passo 2- tarefa do programa= transformar F em Celsius
    temperaturaC = 5 * ((temperaturaF-32)/9);
    // passo 3- resposta do programa= mostrar temperatura em graus Celsius
    System.out.print("A temperatura em graus Celsius é");
    System.out.print(temperaturaC);

}
}


