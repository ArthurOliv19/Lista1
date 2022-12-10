import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) throws Exception {
        // Requisito 1= pedir o lado do quadrado
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Entre com a medida do lado do quadrado ");
        int lado = teclado.nextInt();
        teclado.close();

        // Requisito 2= Calcular a área quadrado
        int area = lado * lado;

        // Requisito 3= Calcular e mostrar o dobro da área do quadrado
        int dobro = area * 2;

        System.out.println(" o dobro da área do quadrado de lado " + lado + " é igual a " + dobro);
    }
}
