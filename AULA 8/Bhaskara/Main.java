
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (27/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        
       //valores
        System.out.println("Digite o valor A");
        a= ler.nextDouble();
        System.out.println("Digite o valor B");
        b= ler.nextDouble();
        System.out.println("Digite o valor C");
        c= ler.nextDouble();
        
        //calculo
        delta= Math.pow(b,2)-4*a*c;
        x1= (-b+Math.sqrt(delta))/(2*a);
        x2= (-b-Math.sqrt(delta))/(2*a);
        
        //saída 
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
        
    }
}