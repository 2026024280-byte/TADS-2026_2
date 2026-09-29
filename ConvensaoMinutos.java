/*
Conversão de minutos
Solicite ao usuário uma quantidade inteira de minutos. Calcule e mostre:
    • a quantidade de horas completas;
    • a quantidade de minutos restantes.
Exemplo:
Minutos informados: 135
Horas: 2
Minutos restantes: 15
*/
import java.util.Scanner; 

public class ConvensaoMinutos {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantidade de minutos inteiros: ");
    
    int minutos = sc.nextInt();

    int horas = minutos / 60;
    int restoMinutos = minutos % 60;

    System.out.println("Quantidade horas: " + horas);
    System.out.println("Minutos restantes: " + restoMinutos);

    sc.close();

   } 
}
