
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
    //instancia
    Calculo c= new Calculo();
    
    //repetir
    byte continua;
    do{
    
            //valores
            do{
                System.out.println("Digite valor de A: ");
                c.setA(ler.nextDouble());
                if(c.getA()<0){
                    System.out.println("Erro!");
                }
                }while(c.getA()<0);

            //saída
            System.out.println(""+c);
            System.out.println("\nDobro de A "+c.calcularDobro());
            System.out.println("\nTriplo do Dobro de A: "+c.calcularTriplo());
            System.out.println("\nMetade do Triplo do dobro de A: "+c.calcularMetade());
            System.out.println("\nQuadrado da Metdade do Triplo do Dobro de A: "+c.calcularQuadrado());
            System.out.println("\nQuinta Parte do Quadrado da Metdade do Triplo do Dobro de A: "+c.calcularQuadrado());

           //repete
           System.out.println("\nDeseja continuar?"
                    + "\n1. Sim "
                     + "\n0. Não");
            continua= ler.nextByte();
    }while(continua!=0);
    System.out.println("Tchau, volte sempre!");
    }
}