import java.util.Scanner;

public class ParedePorta {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 

    System.out.println("Digite larg e alt da parede:");
    
    float larg, alt;
    larg = sc.nextFloat();
    alt = sc.nextFloat();

    float areaParede = 2 * larg * alt;
            
    System.out.println("Digite larg e alt da porta:");
    
    larg = sc.nextFloat();
    alt = sc.nextFloat();

   float areaPorta = 2 * larg * alt;
    
   float areaTotalParede = areaParede - areaPorta;

   System.out.println("..RESULTADO..: ");
   System.out.println("Area da parede: " + areaParede);
   System.out.println("Area da porta: " + areaPorta);
   System.out.println("Area total da parede: " + areaTotalParede);


    sc.close();
}    
}
