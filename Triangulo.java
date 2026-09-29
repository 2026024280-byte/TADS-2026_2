import java.util.Scanner;

public class Triangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a base e a altura do triangulo:");
    
    float base = sc.nextFloat();
    float altura = sc.nextFloat();

    float area = base * altura / 2;

    System.out.println("Area: " + area);

    sc.close();

    }    
}
