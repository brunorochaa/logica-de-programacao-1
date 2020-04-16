
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (30/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        double numero;
        String resposta;
        
        //valores
        System.out.println("Digite um número: ");
        numero= ler.nextDouble();
        
        //calculo
        if ( numero <100){
         resposta= "não é maior";
        }else{
         resposta= "é maior";
        }
        
        //saída
        System.out.println("Seu valor "+resposta+ " que cem");
    }
}
       