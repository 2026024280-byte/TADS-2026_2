import java.util.Scanner; 

public class ConvensaoSegundos {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de segundos: ");

    int totalSegundos = sc.nextInt();

    // 2. Calcula as horas, minutos e segundos restantes
    // Como 1 hora tem 3600 segundos, a divisão inteira dá o total de horas
    int horas = totalSegundos / 3600; 
        
        // O resto da divisão por 3600 são os segundos que não completaram 1 hora
    int segundosRestantes = totalSegundos % 3600; 
        
        // Como 1 minuto tem 60 segundos, dividimos o resto por 60 para achar os minutos
    int minutos = segundosRestantes / 60; 
        
        // O resto da divisão por 60 são os segundos finais
    int segundos = segundosRestantes % 60;
    

    System.out.println("Resultado: " + horas + ":" + minutos + ":" + segundos);

    sc.close();
    
}    
}
