import java.util.Scanner; 

public class DecomposicaoNotas {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um valor inteiro: ");
    
    int valor = sc.nextInt();

    int ced100 = valor / 100;
    int resto100 = valor % 100;

    int ced50 = resto100 / 50;
    int resto50 = resto100 % 50;

    int ced20 = resto50 / 20;
    int resto20 = resto50 % 20;

    int ced10 = resto20 / 10;
    int resto10 = resto20 % 10;

    int ced5 = resto10 / 5;
    int resto5 = resto10 % 5;

    int ced1 = resto5 / 1;

    System.out.println("Notas 100: " + ced100);
    System.out.println("Notas 50: " + ced50);
    System.out.println("Notas 20: " + ced20);
    System.out.println("Notas 10: " + ced10);
    System.out.println("Notas 5: " + ced5);
    System.out.println("Notas 1: " + ced1);

    sc.close();

}    
}
