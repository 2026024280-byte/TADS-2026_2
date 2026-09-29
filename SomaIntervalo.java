/*
// EX 5. CALCULE O SOMATORIO DO INTERVALO [X,Y] ONDE X E Y SAO INFORMADOS PELO USUARIO
*/

import java.util.Scanner;

public class SomaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int inicio = Math.min(x, y);
        int fim = Math.max(x, y);
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        
        System.out.println("O somatório do intervalo [" + inicio + ", " + fim + "] é: " + soma);

        scanner.close();
    }
}
