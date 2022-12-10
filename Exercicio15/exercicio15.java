import java.util.Scanner;

 public class exercicio15{
    public static void main(String[]args){
        System.out.println(">Cálculo de salário<");
        Double quantHora;
        Double valorHora;
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        Scanner sc = new Scanner(System.in);
        quantHora = sc.nextDouble();
        System.out.print("Informe o valor em R$ de cada hora: ");
        valorHora = sc.nextDouble();
        sc.close();
        var salarioBruto = quantHora*valorHora;
        var ir = salarioBruto*0.11;
        var inss = salarioBruto*0.08;
        var sindicato = salarioBruto*0.05;
        var salarioLiqui = salarioBruto-ir-inss-sindicato;
        System.out.printf("+ Salário Bruto: R$ %.2f %n",salarioBruto);
        System.out.printf("- IR: R$ %.2f %n",ir);
        System.out.printf("- INSS: R$ %.2f %n",inss);
        System.out.printf("- Sindicado: R$ %.2f %n",sindicato);
        System.out.printf("= Salário Líquido: R$ %.2f %n",salarioLiqui);

    }
}
