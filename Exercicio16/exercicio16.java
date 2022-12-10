import java.util.Scanner;
import java.lang.Math;

public class exercicio16 {
    // Faça um programa para uma loja de tintas.
    // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    // Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
    // e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
    // Informe ao usuário a quantidades de latas de tinta a serem compradas e o
    // preço total.
    public static void main(String[] args) {
        double areaSerPintada;
        double numeroLatas;
        double precoTotal;
        // 1) Ação do usuário: area a ser pintada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Digite a area a ser pintada ");
        areaSerPintada = teclado.nextDouble();
        teclado.close();
        // 2) Tarefa do programa: calcular quantidade de latas
        numeroLatas = Math.ceil(areaSerPintada / 54);
        // calcular preço total da tinta:
        precoTotal = 80 * numeroLatas;
        // 3) Resposta do programa: quantidade de latas e valor
        System.out.println("O total de latas é " + numeroLatas);
        System.out.println("O valor total é " + precoTotal);
    }
}
