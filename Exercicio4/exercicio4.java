import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
  
    // Passo 1= ação do usuário- digitar notas
    Scanner teclado = new Scanner(System.in);
    nota1 = teclado.nextDouble();
    nota2 = teclado.nextDouble();
    nota3 = teclado.nextDouble();
    nota4 = teclado.nextDouble();
    teclado.close();
    // Passo 2= tarefa do programa- calcular as notas e mostrar a média
    media = ((nota1 + nota2 + nota3 + nota4)) / 4;

    // Passo 3= resposta do programa- mostrar a meédia das 4 notas bimestrais
    System.out.print("a media das notas bimestrais é ");
    System.out.print(media);


        
    }
}
