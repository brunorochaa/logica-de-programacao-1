 
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (23/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        double valorX;
        double valorY;
        double resultadoX;
        double resultadoY;
        
        //dados
        System.out.println("Digite o valor x");
        valorX= ler.nextDouble();
        System.out.println("Digite o valor y");
        valorY= ler.nextDouble();
        
        //calculo
        resultadoX= (2+valorY+Math.sqrt(valorX))/(2*valorX)+(Math.pow(valorX,2))/Math.sqrt(valorY);
        resultadoY= (Math.pow(valorY,valorX)+(Math.sqrt(valorX))/(2*valorX*valorY));
        
        //saída
        System.out.println("Valor X: "+valorX);
        System.out.println("Valor Y: "+valorY);
        System.out.println("Resultado X: "+resultadoX);
        System.out.println("Resultado Y: "+resultadoY);
        
    }
}
        
        
    