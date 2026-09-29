import java.util.Scanner;

public class Indeterminada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        int cont = 0;
        
        int senha = 1234;
        // REPETICAO INDETERMINADA = NAO SABEMOS QUANTAS VEZES VAI EXECUTAR
        cont = sc.nextInt();
        while (cont != senha) {
            System.out.println("VC ERROU ... tente novamente");
            if (cont < senha) {
                System.out.println("CHUTE MAIOR");
            } else {
                System.out.println("CHUTE MENOR");
            }
            
             cont = sc.nextInt();          
        }

        System.out.println("SENHA ACEITA");

        sc.close();
    }
}
