import java.util.Scanner;

public class ComissaoVenda {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite total de vendas:");
    float totalVendas = sc.nextFloat();
    System.out.println("Digite percentual da comissão:");
    float percentualVendas = sc.nextFloat();

    float valorComissao = totalVendas * percentualVendas / 100;

    System.out.println("Valor da Comissão: " + valorComissao);

    sc.close();

    }    
}
