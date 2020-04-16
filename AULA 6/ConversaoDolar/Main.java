
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (22/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        double dolar;
        double reais;
        
        //valores
        System.out.println("Cotação do dolár: R$4,04 = US$1,00");
        System.out.println("Digite o valor em dólar para a conversão");
        dolar= ler.nextDouble();
        
        //calculo
        reais= dolar*4.04;
        
        //saída
        System.out.println("US$"+dolar+ " é igual a R$"+reais);
        
    }
}
       
        
        
    
    
    