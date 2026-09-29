import java.util.Scanner;

public class Raio {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio do circulo:");
    
    float num = sc.nextFloat();
    
    double areaCirculo =  2 * num * Math.PI;

    System.out.println("Area do circulo: " + areaCirculo);

    sc.close();
    
}    
}
