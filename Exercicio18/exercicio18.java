import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        double tamanhoArquivo;
        double velocidadeLink;
        double tempoEmSegundos;
        double tempoEmMinutos;

        // Faça um programa que peça o tamanho de um arquivo para download (em MB)
        // e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download 200
        // do arquivo usando este link (em minutos).

        // acão do usuário= informar tamanho do arquivo
        Scanner teclado = new Scanner(System.in);
        tamanhoArquivo = teclado.nextDouble();
        velocidadeLink = teclado.nextDouble();
        teclado.close();

        // tarefa do computador=
        // 2.1= converter MB para Mb
        tamanhoArquivo = tamanhoArquivo * 8;
        // 2.2= regra de 3 para descobrir tempo em segundos
        tempoEmSegundos = tamanhoArquivo / velocidadeLink;
        // 2.3= converter de segundos para minutos
        tempoEmMinutos = tempoEmSegundos / 60;

        // 3= resposta do programa= o tempo aproximado de download:
        System.out.format("o tempo em minutos é %.2f", + tempoEmMinutos);
    }
}
