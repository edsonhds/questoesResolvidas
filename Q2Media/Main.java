//Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
// A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

package Q2Media;
public class Main {
    public static void main(String[] args) {
        media md = new media(8,9,7,4,5,6);
        int A = (md.med1 + md.med2 + md.med3)/3;
        System.out.println("A média aritmética dos números 8,9 e 7 è: " + A);

        int B = (md.num1 + md.num2 + md.num3)/3;
        System.out.println("A média dos números 4, 5 e 6 è: " + B);

        int C = (A + B)/2;
        System.out.println("A média das médias é: " + C);

    }
}
