import java.util.Scanner;

public class ConsumoComb {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Distancia percorrida em km:");
    float distPerc = sc.nextFloat();
    System.out.println("Consumo em litros:");
    float consumoLt = sc.nextFloat();
    
    float consumoMedio = distPerc / consumoLt;

    System.out.println("Consumo medio em litros: " + consumoMedio);

    sc.close();

}    
}
