import java.util.Scanner;

public class ContadorValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inicializa as variáveis de controle
        int contadorVagas = 0;
        int maioresOuIguaisA7 = 0;
        
        // Loop executa enquanto não receber 10 valores
        while (contadorVagas < 10) {
            System.out.print("Digite o " + (contadorVagas + 1) + "º valor: ");
            double valor = sc.nextDouble();
            
            // Verifica se o valor atende à condição
            if (valor >= 7) {
                maioresOuIguaisA7++;
            }
            
            // Incrementa o contador do loop
            contadorVagas++;
        }
        
        // Exibe o resultado final
        System.out.println("\nQuantidade de valores maiores ou iguais a 7: " + maioresOuIguaisA7);
        
        sc.close();
    }
}