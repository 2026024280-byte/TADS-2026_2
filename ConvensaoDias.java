/*
Solicite ao usuário uma quantidade inteira de dias. Calcule e mostre:
    • a quantidade de semanas completas;
    • a quantidade de dias restantes.
Considere que uma semana possui sete dias.
*/

import java.util.Scanner;

public class ConvensaoDias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de dias inteiros: ");

        int quantDias = sc.nextInt();

        int semanas = quantDias / 7;
        int restDias = quantDias % 7;

        System.out.println("Quantidade de semanas: " + semanas);
        System.out.println("Restante de dias: " + restDias);

        sc.close();
        
    }
}
