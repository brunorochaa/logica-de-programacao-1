
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    
    //instancia
    Calculo c1= new Calculo();
    
    //valores
        System.out.println("Digite o primeiro número");
        c1.numero1= ler.nextDouble();
        System.out.println("Digite o segundo número");
        c1.numero2= ler.nextDouble();
        
    //saída
        System.out.println("Número 1: "+c1.numero1);
        System.out.println("Número 2: "+c1.numero2);
        System.out.println("Soma: "+c1.somar());
        System.out.println("Multiplicação: "+c1.multiplicar());
    }
    
}
