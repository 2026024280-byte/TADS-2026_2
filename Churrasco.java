/*
Quantidade de carne para churrasco
Solicite ao usuário:
    • a quantidade de homens;
    • a quantidade de mulheres;
    • a quantidade de crianças.
Considere o seguinte consumo médio:
Homem: 400 gramas
Mulher: 320 gramas
Criança: 200 gramas
Calcule e mostre:
    • a quantidade total de carne em gramas;
    • a quantidade total de carne em quilogramas.
*/
import java.util.Scanner; 

public class Churrasco {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.print("Quantidade de homens: ");
int homens = sc.nextInt();
System.out.print("Quantidade de mulheres: ");
int mulheres = sc.nextInt();
System.out.print("Quantidade de crianças: ");
int crianças = sc.nextInt();

float carneH = homens * 400;
float carneM = mulheres * 320;
float carneC = crianças * 200;

float churrascoG = carneH + carneM + carneC;
float churrascoKg = (carneH + carneM + carneC) / 1000;

System.out.println("...RESULTADO...");
System.out.println("Quantidade de carne em gramas: " + churrascoG);
System.out.println("Quantidade de carne em Kg: " + churrascoKg);

sc.close();

}    
}
