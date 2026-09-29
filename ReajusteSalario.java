import java.util.Scanner;

public class ReajusteSalario {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Salario sem reajuste:");
    float valorSalario = sc.nextFloat();
    System.out.println("Percentual de reajuste:");
    float percentualReajuste = sc.nextFloat();

    float valorReajuste = valorSalario * percentualReajuste / 100;
    float valorFinal = valorReajuste + valorSalario;

    System.out.println("Valor do Reajuste: " + valorReajuste);
    System.out.println("Valor final do salario: " + valorFinal);

    sc.close();

    }    
}
