import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite 3 notas:");
        
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        
               
        float mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        
        System.out.println("Media Ponderada: " + mediaPonderada);
        

        sc.close();

    }
}