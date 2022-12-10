import java.util.Scanner;

public class exercicio5 {
 public static void main(String[] args) {
//Faça um Programa que converta metros para centímetros.
double valoremMetros;
double resultadoemCm;
// Passo 1= ação do usuário= digitar um valor em metros
Scanner teclado = new Scanner(System.in);
valoremMetros = teclado.nextDouble();
teclado.close();
// Passo 2= tarefa do programa= transformar metros em centímetros (1 metro=100cm, ou valor em metros *100)
resultadoemCm = (valoremMetros * 100);
// Passo 3= resposta do programa= mostrar o resultado convertido para cm
System.out.print("o valor em Cm é ");
System.out.print(resultadoemCm);
  
}
}
