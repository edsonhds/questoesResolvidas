// Crie um algoritmo que receba via construtor:
// o valor do salário mínimo;
// O valor do salário de um usuário;
// Calcule a quantidade de salários mínimos esse usuário ganha;
// Imprima o resultado. //(1SM=R$1320,00)

package Q5SalarioMinimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double slMinimo, slUsuario;

        System.out.print("Digite o valor do alário mínimo R$ ");
        Scanner input = new Scanner(System.in);
        slMinimo = input.nextInt();

        System.out.print("Digite o valor do seu salário R$ ");
        input = new Scanner(System.in);
        slUsuario = input.nextInt();

        Minimo min = new Minimo(slMinimo,slUsuario);
        System.out.printf("O usuário reebe "+min.quantidade()+ " salários mínimos");
    }
}

