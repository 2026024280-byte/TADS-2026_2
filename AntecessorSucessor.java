import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero com 2 algarismos:");

        int numero = sc.nextInt();
        
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        int soma = sucessor + antecessor;
        int subtracao = sucessor - antecessor;

        System.out.println("...RESULTADO..:");
        System.out.println("Numero : " + numero);
        System.out.println("Sucessor : " + sucessor);
        System.out.println("Antecessor : " + antecessor);
        System.out.println("Soma : " + soma);
        System.out.println("Subtracao : " + subtracao); 
        
        sc.close();
     }
}