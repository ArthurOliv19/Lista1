import java.util.Scanner;

public class exercicio3 {
    public static void main(String args[]) {
    
    //Faça um Programa que peça dois números e imprima a soma
    double numero1;
    double numero2;
    double resultado;
    //passo 1= ação do usuario: digitar dois números
    Scanner teclado = new Scanner(System.in);
    numero1 = teclado.nextDouble();
    numero2 = teclado.nextDouble();
    teclado.close();
    //passo 2= tarefa do programa: calcular soma
     resultado = numero1 + numero2;
    //passo 3= resposta do programa: mostrar resultado da soma
    System.out.print("o resultado é ");
    System.out.print(resultado);






    }





}

