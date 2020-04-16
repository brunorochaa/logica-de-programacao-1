
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        double base;
        double altura;
        double area;
        
        //dados
        System.out.println("Digite a base de um retângulo");
        base= ler.nextDouble();
        System.out.println("Digite a altura de um retângulo");
        altura= ler.nextDouble();
        
        //calculo
        area= base*altura;
        
        //saída
        System.out.println("A área do retângulo é " +area+ " cm²");
    }
}
        