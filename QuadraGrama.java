/*
DADO AS DIMENSOES DE UMA QUADRA RETANGULAR, LARGURA E ALTURA.
        // CALCULAR A AREA E O PERIMETRO DESTA QUADRA.

        // supondo que quero preencher toda a quadra com grama, e a grama é vendida em um tamanho quadrado NxN (é informado o lado para o usuario), com um valor por pedaco.
        // quantos pedaços de grama preciso comprar e qual o valor total?
*/
import java.util.Scanner; 

public class QuadraGrama {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
System.out.println("Digite a largura e altura do retangulo: ");
float largura = sc.nextFloat();
float altura = sc.nextFloat();

float areaRetangulo = largura * altura;
float perimetroRetangulo = 2 * (largura + altura);


System.out.println("Digite o tamanho do lado torrao: ");
float ladoTorrao = sc.nextFloat();
float tamanhoTorrao = ladoTorrao * ladoTorrao;

System.out.println("Valor do torrao: ");
float valorTorrao = sc.nextFloat();

float quantidaeTorao = tamanhoTorrao * perimetroRetangulo;
float valorTotal = perimetroRetangulo * valorTorrao;

System.out.println("Area da quadra: " + areaRetangulo);
System.out.println("Perimetro da quadra: " + perimetroRetangulo);
System.out.println("Tamanho da grama: " + tamanhoTorrao);
System.out.println("Quantidade de torrao: " + quantidaeTorao);
System.out.println("Valor total dos torroes: " + valorTotal);

sc.close();

}    
}
