import java.util.Scanner;

public class InvertaDois {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Numero com dois algarismos:");

    int numero = sc.nextInt();    

    int unidade = numero % 10;
    int restoNumero = numero / 10;

    int dezena = restoNumero % 10;

    int inversao = unidade * 10 + dezena * 1;

    System.out.println("Inversão do numero: " + inversao);

    sc.close();

}    
}
