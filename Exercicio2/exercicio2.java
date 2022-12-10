import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um número ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println("O número digitado foi:");
        System.out.println(numero);
    }
}
