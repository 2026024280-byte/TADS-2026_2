import java.util.Scanner;

public class ContaGorjeta {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Valor da conta:");
    float valorConta = sc.nextFloat();
    System.out.println("Percentual da gorjeta:");
    float percentualGorjeta = sc.nextFloat();

    float valorGorjeta = valorConta * percentualGorjeta / 100;
    float valorTotalConta = valorGorjeta + valorConta;
    float valorPraCada = valorTotalConta / 4;
   
    System.out.println("Valor da gorjeta: " + valorGorjeta);
    System.out.println("Valor total da conta: " + valorTotalConta);
    System.out.println("Valor para cada um: " + valorPraCada);

    sc.close();
    
}    
}
