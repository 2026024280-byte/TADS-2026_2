import java.util.Scanner;

public class SomaIntervalo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();

        // Se X for maior que Y, inverte os valores sem usar Math
        if (x > y) {
            int auxiliar = x;
            x = y;
            y = auxiliar;
        }

        int soma = 0;

        // O laço sempre executará do menor para o maior
        for (int i = x; i <= y; i++) {
            soma += i;
        }

        System.out.println("O somatório do intervalo [" + x + ", " + y + "] é: " + soma);

        sc.close();
    }
}
