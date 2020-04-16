
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
    //instancia
    Media m= new Media();
    
    //repetir
    byte continua;
    do{
    
        //valores
        System.out.println("Calculando Média...");
        do{
            System.out.println("Digite o número 1: ");
            m.setNumero1(ler.nextDouble());
            if(m.getNumero1()<0){
                System.out.println("Erro!");
                }
            }while(m.getNumero1()<0);

        do{
            System.out.println("Digite o número 2: ");
            m.setNumero2(ler.nextDouble());
            if(m.getNumero2()<0){
                System.out.println("Erro!");
                }
            }while(m.getNumero2()<0);

        //saída
        System.out.println("\nDados: "+m);
        System.out.println("Soma: "+m.calcularSoma());
        System.out.println("Média: "+m.calcularMedia());
        
        //repete
               System.out.println("\nDeseja continuar?"
                        + "\n1. Sim "
                         + "\n0. Não");
                continua= ler.nextByte();
    }while(continua!=0);
    System.out.println("Tchau, volte sempre!");
    }
}