import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero = sc.nextFloat();
                
        float dobro = numero * 2;
        float triplo = numero * 3;
        float metade = numero / 2;

        System.out.println("Numero: " + numero);
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
        System.out.println("Metade: " + metade);

        sc.close();

        
    }
}
