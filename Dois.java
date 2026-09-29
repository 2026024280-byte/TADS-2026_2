import java.util.Scanner;

public class Dois {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();

    float soma = num1 + num2;
    float subtracao = num1 - num2;
    float produto = num1 * num2;
    float divisao = num1 / num2;

    System.out.println("...RESULTADO...");
    System.out.println("Soma: " + soma);
    System.out.println("Subtracao: " + subtracao);
    System.out.println("Produto: " + produto);
    System.out.println("Divisao: " + divisao);

    sc.close();

   } 
}
