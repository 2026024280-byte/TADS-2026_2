import java.util.Scanner;

public class Veloc {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a veloc em km/h:");

    float kmH = sc.nextFloat();
    
    float velocM = kmH / 3.6f;

    System.out.println("Velocidade em m/s: " + velocM);

    sc.close();
}    
}
