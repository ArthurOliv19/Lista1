import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {

        // Requisito 1: peça o raio de um círculo
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Entre com o raio do círculo ");
        double raio = teclado.nextDouble();
        teclado.close();

        // Requisito 2: Calcular a área do círculo
        double area = Math.PI * Math.pow(raio, 2);

        // Requisito 3: mostrar resultado
        System.out.println("A área do círculo de raio " + raio + "é igual a " + area);

    }
}
