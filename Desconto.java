import java.util.Scanner;

public class Desconto {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ddigite o valor da compra:");
    float valorProduto = sc.nextFloat();
    System.out.println("Digite percentulal de desconto:");
    float percentualDesconto = sc.nextFloat();
 
    float valorDesconto = valorProduto * percentualDesconto / 100;
    float valorFinal =  valorProduto - valorDesconto;

    System.out.println("Valor Desconto: " + valorDesconto);
    System.out.println("Valor Final: " + valorFinal);

    sc.close();

  }   
}
