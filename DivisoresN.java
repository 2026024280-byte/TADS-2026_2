/*
2. Faça um programa que mostre todos os divisores de um numero N.
ex: 24
    1 2 3 4 6 8 12 24
*/
import java.util.Scanner;

public class DivisoresN {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Mostre os Divisores do valor: ");
    int numero = sc.nextInt();

   
    for (int i = 0; numero / 2 == 0 || numero / 3 == 0; numero++)
        System.out.println(numero);

}    
}
