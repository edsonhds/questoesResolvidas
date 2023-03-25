//Escrever um algoritmo que receba via construtor:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package Q4IPI;

import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        double porcento, val1, val2;
        int cod1, cod2, quant1, quant2;

        System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
        porcento = input.nextDouble();

        System.out.print("Digite o codigo da peça 1: ");
        cod1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        val1 = input.nextDouble();

        System.out.print("Digite a quantidade de peças 1: ");
        quant1 = input.nextInt();

        System.out.print("Digite o codigo da peça 2: ");
        cod2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        val2 = input.nextDouble();

        System.out.print("Digite a quantidade de peças 2: ");
        quant2 = input.nextInt();

        IPI ipi = new IPI(porcento, cod1,val1,quant1,cod2,val2,quant2);
        System.out.println("Valor final das peças é de R$ "+ipi.valFinal());

    }
}
