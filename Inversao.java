import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero com 2 algarismos:");

        int numero = sc.nextInt();

        int unid = numero % 10;
        int restoNumero = numero / 10;

        int dezena = restoNumero % 10;
        
        int numeroInvertido = unid * 10 + dezena * 1;
        
        System.out.println("Numero: " + numero);
        System.out.println("NumeroInvertido: " + numeroInvertido);

        sc.close();


    }    
}
