import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite 3 notas:");
        
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        
               
        int media = (nota1 + nota2 + nota3)  / 3;
        
        System.out.println("Media: " + media);
        

        sc.close();
    }    
}
