//Faça um algoritmo que receba via constutor a idade de uma pessoa expressa em anos,
//meses e dias e mostre-a expressa em dias.
//Obs.: Leve em consideração o ano com 365 dias e o mês com 30
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

package Q1Idade;

public class Main {
    public static void main(String[] args) {//Instanciando a classe.
        idadeTexte dados = new idadeTexte(3, 2, 15);
        int m1 = dados.ano * 365;
        int m2 = dados.mes * 30;
        int m3 = m1 + m2 + dados.dia;
        System.out.println(m3);

    }
}
