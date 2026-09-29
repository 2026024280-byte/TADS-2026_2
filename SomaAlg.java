import java.util.Scanner;

public class SomaAlg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um nuemero com 3 algarismos");
        int num = sc.nextInt();
        
        int unid = num % 10;
        int restoNum = num / 10;

        int dez = restoNum % 10;

        int cent = num / 100;

        int soma = cent + dez + unid;

       
        System.out.println("Soma: " + soma);

        sc.close();


        
    }
}
