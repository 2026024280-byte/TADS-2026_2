/*pacote com. TechVidvan . Operadores ;*/

import java.util.Scanner;

public class Estudo1 {

  public static void main ( String [] args ) { 
  Scanner sc = new Scanner(System.in);

    int operando1 = 100 , operando2 = 20;
    String stringName1 = "TechVidvan's" , stringName2 = " Tutorial de Java.";
   
    // O uso do operador + com strings concatenará as duas strings.
    System.out.println ("Bem - vindo ao " + stringName1 + stringName2);
    
    // usando o operador de adição +
    System.out.println ("Adicionando (+) dois operandos: " + ( operando1 + operando2 )) ;
    
    // usando o operador de subtração
    System.out.println ("Subtraindo (-) dois operandos: " + ( operando1 - operando2 )) ;
    
    // usando o operador de multiplicação *
    System.out.println ("Multiplicando (*) dois operandos: " + ( operando1 * operando2 )) ;
    
    // usando operador de divisão /
    System.out.println ("Dividindo (/) dois operandos: " + ( operando1 / operando2 )) ;
    
    // usando o operador módulo %
    System.out.println ("Módulo (%) de dois operandos: " + ( operando1 % operando2 )) ;

    sc.close();

  }
}

