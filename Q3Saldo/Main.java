//Informar um saldo e imprimir o saldo com reajuste de 1%.

package Q3Saldo;

public class Main {
    public static void main(String[] args) {
        reajuste saldo = new reajuste(1500);
        int sd = (int) (saldo.saldo * 1.01);
        System.out.println("O saldo com reajuste de 1% é R$"+sd);

    }
}
