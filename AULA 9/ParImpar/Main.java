
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (28/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        int numero;
        String resposta;
        
        //valores
        System.out.println("Digite o número");
        numero= ler.nextInt();
        
        //calculo
        if(numero%2==0){
            resposta= "Par";
        }else{
            resposta= "Impar";
        }
        
        //saída
        System.out.println("O número "+numero+ " é "+resposta);
    }
}
