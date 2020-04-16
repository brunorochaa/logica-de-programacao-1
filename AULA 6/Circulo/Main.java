
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
        double raio;
        double area;
        double perimetro;
        
        //dados
        System.out.println("Digite o raio do círculo");
        raio= ler.nextDouble();
        
        //calculo
        area= Math.PI*Math.pow(raio,2);
        perimetro= (2*Math.PI*raio);
        
        //saída
        System.out.println("A área do círculo é " +area);
        System.out.println("O perímetro do círculo é " +perimetro);
    }
}
        
        
    