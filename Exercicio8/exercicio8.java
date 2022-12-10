import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception {

        // Requisito 1= pergunte quanto você ganha por hora e o numero de horas
        // trabalhadas no mês
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Entre com o seu valor/hora ");
        double valor_hora = teclado.nextDouble();
        System.out.println("");
        System.out.print(" Entre com a quantidade de horas trabalhadas no mês ");
        double horas_mes = teclado.nextDouble();
        teclado.close();

        // Requisito 2= calcule e mostre o total do seu salário no referido mês
        double salario_mes = valor_hora * horas_mes;
        System.out.println(" O valor do seu salário esse mês é: " + salario_mes);

    }
}
