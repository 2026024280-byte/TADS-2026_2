import java.util.Scanner; 

public class ConvensaoSegundos2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de segundos: ");
   
    int totalSegundos = sc.nextInt();

    int horas = totalSegundos / 3600;

    int restosegundos = totalSegundos % 3600;

    int minutos = restosegundos  / 60;

    int segundos = restosegundos % 60;

    System.out.println("RESULTADO: " + horas + " : " + minutos + " : " + segundos);

    sc.close();
}    
}
