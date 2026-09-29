import java.util.Scanner;

public class IdadeAproxima {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantidade de anos completos: ");
    int anos = sc.nextInt();
    System.out.print("Quantidade de meses completo: ");
    int meses = sc.nextInt();
    System.out.print("Quantidade de dias adicionais: ");
    int diasAdicionais = sc.nextInt();

    int idadeDias = anos * 365 + meses * 30 + diasAdicionais;

    System.out.println("Idade aproximada em dias: " + idadeDias);

    sc.close();
}    
}
