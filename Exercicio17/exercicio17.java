import java.util.Scanner;
import java.lang.Math;

public class exercicio17 {
    public static void main(String[] args) {
        int litrosLata = 18;
        int preçoLata = 80;
        double litrosGalão = 3.6;
        double preçoGalão = 25;
        double qtdLatas;
        double qtdGaloes;
        double custoLatas;
        double custoGaloes;
        double litrosNecessários;
        double areaMetros;
        System.out.print(" Informe a área em metros quadrados: ");
        Scanner sc = new Scanner(System.in);
        areaMetros = sc.nextDouble();
        sc.close();
        litrosNecessários = (areaMetros) / 6;
        // primeiro caso: caso cliente opte por apenas latas 18L
        qtdLatas = Math.ceil(litrosNecessários / litrosLata);
        custoLatas = qtdLatas * preçoLata;
        System.out.println(" Você precisará comprar " + qtdLatas + " latas, que irão custar R$:" + custoLatas);
        // segundo caso: caso cliente opte pelos galões
        qtdGaloes = Math.ceil(litrosNecessários / litrosGalão);
        custoGaloes = qtdGaloes * preçoGalão;
        System.out.println(" Você precisará comprar " + qtdGaloes + " galões, que irão custar R$:" + custoGaloes);
        // terceiro caso: caso opte por misturar latas e galões. Acrescente 10% de folga
        double litrosFolga = litrosNecessários * 1.1;
        double qtdLatasterceirocaso = Math.ceil(litrosFolga / litrosLata);
        double litros_faltando = litrosFolga - (qtdLatasterceirocaso * litrosLata);
        double qtdGaloesterceirocaso = Math.ceil(litros_faltando / litrosGalão);
        double custoMistura = Math.ceil(qtdLatasterceirocaso * preçoLata) + (qtdGaloesterceirocaso * preçoGalão);
        System.out.println(" Você precisará comprar " + qtdLatasterceirocaso + " latas e," + qtdGaloesterceirocaso
                + " galões, que juntos custarão R$ " + custoMistura);

    }

}

// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
// em metros quadrados da área
// a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6
// metros quadrados e que a tinta é vendida
// em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que
// custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
// preços em 3 situações:
// comprar apenas latas de 18 litros;
// comprar apenas galões de 3,6 litros;
// misturar latas e galões, de forma que o desperdício de tinta seja menor.
// Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
// considere latas cheias.
