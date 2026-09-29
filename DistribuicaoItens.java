/*
Distribuição de itens
Solicite ao usuário:
    • a quantidade total de itens;
    • a quantidade de pessoas.
Calcule e mostre:
    • quantos itens cada pessoa receberá;
    • quantos itens restarão sem distribuição.
Considere que a quantidade de pessoas será maior que zero.
*/

import java.util.Scanner; 

public class DistribuicaoItens {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantidade total de itens: ");
    int totalItens = sc.nextInt();
    System.out.print("Quantidade de pessoas: ");
    int pessoas = sc.nextInt();

    int itensPorPessoa = totalItens / pessoas;
    int restoItens = totalItens % pessoas;

    System.out.println("Quantidade de itens por pessoa: " + itensPorPessoa);
    System.out.println("Itens que sobraram: " + restoItens);

    sc.close();
}
}
