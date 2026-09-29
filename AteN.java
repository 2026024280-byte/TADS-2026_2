import java.util.Scanner;

public class AteN {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
     int n, contador;
        
    System.out.print("Digite um numero real para conta até ele: ");
     n = sc.nextInt();

 // do 0 até n
contador = 0;
while (contador <= n) {
    System.out.println(contador);
    contador++; // contador = contador+1
}

if (n <= 0) {
    System.out.println("Numero invalido.");
}else {

}

sc.close();


    }
}