import java.util.Scanner; 

public class CustoViagem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Distancia a percorrer: ");
    float distKm = sc.nextFloat();
    System.out.println("Consumo medio do veiculo km/l: ");
    float consumoMedio = sc.nextFloat();
    System.out.println("Preco do litro do combustive: ");
    float precoLitro = sc.nextFloat();

    float quantCombustivel = distKm / consumoMedio;
    float custoEstimado = quantCombustivel * precoLitro;

    System.out.println("Quantidade de combustivel necessário: " + quantCombustivel);
    System.out.println("Custo estimado da viagem: " + custoEstimado);

    sc.close();

}    
}
