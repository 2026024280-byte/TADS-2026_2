import java.util.Scanner;

public class ConvGraus {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temp em C°:");

    float celsiuselsius = sc.nextFloat();
    
    float tempFah = celsiuselsius * 9 / 5 + 32;
    
    System.out.println("Graus Fah: " + tempFah);
    
    System.out.println("Digite a temp em fahrenheit:");

    float fah = sc.nextFloat();
    
    float tempC =  (fah - 32) * 5 / 9;

    System.out.println("Graus C°: " + tempC);

    sc.close();

}    
}
