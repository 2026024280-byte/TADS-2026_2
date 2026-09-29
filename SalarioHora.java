/*
Salário por horas trabalhadas
Solicite ao usuário:
    • a quantidade de horas trabalhadas no mês;
    • o valor recebido por hora.
Calcule e mostre o salário bruto do funcionário.
*/

import java.util.Scanner; 

public class SalarioHora {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Horas trabalhadas:");
    float hotrasTrabalho = sc.nextFloat();
    System.out.println("Valor por hora:");
    float valorHora = sc.nextFloat();
    
    float salarioBruto = hotrasTrabalho * valorHora;

    System.out.println("Salario bruto mensal: " + salarioBruto);

    sc.close();

}   

}
