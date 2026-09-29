
public class Repeticao1 {
    public static void main(String[] args) {
        // enquanto
        /*
        enquanto (valor logico) {
            // bloco que sera repetido
        }
        */
        int contador = 0;
        // o valor logico comece inicialmente true, mas em algum momento se torne false para PARAR o meu laco de repeticao
        while (contador < 10) {
            System.out.println("JAVAAAAA " + contador);
            contador = contador + 1;     // contador recebe o valor que tem + 1
        }
        System.out.println("SEGUE EXECUTANDO AQUI");
        System.out.println("CONTADOR FORA DO LACO " + contador); 

     // EX 1. COMECE O CONTADOR COM 10 E FAÇA MOSTRAR OS VALORES EM ORDEM DECRESCENTE ATÉ 0
        int c = 10;
        while (c >= 0) {
            System.out.println(c);
            c--;    // c = c - 1;       i++;    i = i + 1;  
        }

         
        
    }
}