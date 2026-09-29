import java.util.Scanner;

public class ConverterMetros {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma medida em metros e km:");
    
    float metros = sc.nextFloat();

    double km = metros * 1000;
    float cm = metros * 100;
    float mm = metros * 1000;

    System.out.println("Quilometo para metros: " + km);
    System.out.println("Metros para centimetros: " + cm);
    System.out.println("Metros para milimetros: " + mm);

    sc.close();

}    
}
