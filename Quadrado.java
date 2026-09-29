import java.util.Scanner;

public class Quadrado {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float num = sc.nextFloat();

    float quadrado = num * num;
    float cubo = num * num * num;
    
    System.out.println("RESULTADO:");
    System.out.println("Quadrado: " + quadrado);
    System.out.println("Cubo: " + cubo);

    sc.close();
    
   } 
}
