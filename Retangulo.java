import java.util.Scanner;

public class Retangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite largura e altura do retangulo:");
    float largura = sc.nextFloat();
    float altura = sc.nextFloat();
 
    float area = largura * altura;
    float perimetro = 2 * (largura + altura);

    System.out.println("Area: " + area);
    System.out.println("Perimetro: " + perimetro);

    sc.close();

}    
}
