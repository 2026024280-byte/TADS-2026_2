import java.util.Scanner;

public class Estudo2 {

  public static void main ( String [] args ) {
    Scanner sc = new Scanner(System.in);

    int num1 = 10 , num2 = 20 , num3 = 30 , num4 = 40 , resultado;
    //usando o operador de pré-incremento
    resultado = ++num1;
    System.out.println ( "Valor do valor pré-incrementado de num1 : " + resultado ) ;
    //usando o operador de pós-incremento
    resultado = ++num2;
    System.out.println ( "Valor do valor pós-incrementado de num2 : " + resultado ) ;
    //usando o operador de pré-decremento
    resultado = --num3;
    System.out.println ( "Valor do valor pré-decrementado de num3 : " + resultado ) ;
    //usando o operador de pós-decremento
    resultado = --num4;
    System.out.println ( "Valor do valor pós-decrementado de num4 : " + resultado ) ;
    
    sc.close();

  }
}
