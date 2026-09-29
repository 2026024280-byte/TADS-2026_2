import java.util.Scanner;

public class Acrescimo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da compra:");
    float valorCompra = sc.nextFloat();
    System.out.println("Digite o percentual");
    float percentual = sc.nextFloat();

    float valorAcrescimo = valorCompra * (percentual / 100);
    float valorFinal = valorCompra + valorAcrescimo;
    
    System.out.println("Valor acrescimo: " + valorAcrescimo);
    System.out.println("Valor final: " + valorFinal);

    sc.close();

    }    
}
