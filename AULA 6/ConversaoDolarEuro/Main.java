
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
        double cotacaoDolar;
        double real;
        double euro;
        double cotacaoEuro;
        
        //valores
        System.out.println("Digite cotação do dolár");
        cotacaoDolar= ler.nextDouble();
        System.out.println("Digite Cotação do euro");
        cotacaoEuro= ler.nextDouble();
        System.out.println("Digite o valor em real para a conversão");
        real= ler.nextDouble();
        
        //calculo
        dolar= real*cotacaoDolar;
        euro= real*cotacaoEuro;
        
        //saída
        System.out.println("R$"+real+ " é igual a US$"+dolar);
        System.out.println("R$"+real+ " é igual a £"+euro);
        
      
    }
}
        
