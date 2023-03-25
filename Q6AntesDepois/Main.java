//Desenvolva um algoritmo em Java que receba via construtor um número inteiro
// e imprima o seu antecessor e seu sucessor.
package Q6AntesDepois;

import java.util.Scanner;

public class Main {
    private static Scanner input;

    public static void main(String[] args) {
        int numero;

        System.out.print("Digite um número inteiro: ");
        input = new Scanner(System.in);
        numero = input.nextInt();

        antesDepois form = new antesDepois(numero);

        System.out.print("O antecessor de "+numero + " é ");
        System.out.println(form.antecessor());

        System.out.print("O suecessor de "+numero + " é ");
        System.out.println(form.sucessor());

    }
}
