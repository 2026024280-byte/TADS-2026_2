/*
comparação de valores.
Valores menores ou igual a 7.
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor, qtd = 0;

        int cont = 0;
        while (cont < 10) {
            System.out.print("informe um valor: ");
            valor = sc.nextInt();
            if (valor >= 7) {
                qtd++;
            }
            cont++;
        }

        // cont = 10 , condicao false, encerra o laco
        System.out.println("QUANTIDADE >=7 : " + qtd);

        sc.close();
    }
}