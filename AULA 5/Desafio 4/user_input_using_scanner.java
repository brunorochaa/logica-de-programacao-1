
/**
 * Write a description of class Scanner here.
 *
 * @author (Bruno Rocha)
 * @version (21/05/2019)
 */
import java.util.Scanner;

class user_input_using_scanner{
    public static void main() {
       //variaveis 
       int numero1;
       int numero2;
       int soma;
       
       //valores
       Scanner ip= new Scanner(System.in);
       System.out.println("\fInsira um número");
       numero1=ip.nextInt();
       System.out.println("Insira um número");
       numero2=ip.nextInt();
 
       
       //calculo
       soma= numero1+numero2;
       System.out.println(soma);
        
    
}
}