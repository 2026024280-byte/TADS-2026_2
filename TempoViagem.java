import java.util.Scanner;

public class TempoViagem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Distancia a percorrer:");
    float distPercorrer = sc.nextFloat();
    System.out.println("Velocidae media em km/h");
    float velocMedia = sc.nextFloat();

    float tempoEstimado = distPercorrer / velocMedia;

    System.out.println("Tempo estimado da viagem: " + tempoEstimado);

    sc.close();

}   

}
