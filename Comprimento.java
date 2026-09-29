import java.util.Scanner;

public class Comprimento {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio de um circulo:");

    Float raio = sc.nextFloat();

    double compCirculo = 2 * Math.PI * raio;

    System.out.println("Comprimento do circulo: " + compCirculo);

    sc.close();

}    
}
