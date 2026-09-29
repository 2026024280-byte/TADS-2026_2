/*
Compra de combustível
Solicite ao usuário:
    • o preço do litro do combustível;
    • o valor que será utilizado para abastecer.
Calcule e mostre quantos litros de combustível poderão ser comprados.
 */
import java.util.Scanner; 

public class PrecoCombustivel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Valor do combustivel por litro:");
    float valorLitroComb = sc.nextFloat();
    System.out.println("Valor para abastecer:");
    float valorAbastecer = sc.nextFloat();

    float combComprado = valorAbastecer / valorLitroComb;

    System.out.println("Quantidade de combustivel a ser comprado: " + combComprado);

    sc.close();
}    
}
