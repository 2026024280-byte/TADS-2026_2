import java.util.Scanner;  

public class DividirConta {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Valor total da conta:");
    float valorConta = sc.nextFloat();
    System.out.println("Quantidade de pessoas que dividirão a conta:");
    int numPessoas = sc.nextInt();

    float valorPorPessoas = valorConta / numPessoas;

    System.out.println("Valor que cada pessoa pagara: " + valorPorPessoas);

    sc.close();
}    
}
