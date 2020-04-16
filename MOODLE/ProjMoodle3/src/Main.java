
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
    
    //instancia
    Soma s= new Soma();
    
    //repetir
    byte continua;
    do{
    
        //valores
        System.out.println("Somando...");
        do{
            System.out.println("Digite o número 1: ");
            s.setNumero1(ler.nextDouble());
            if(s.getNumero1()<0){
                System.out.println("Erro!");
                }
            }while(s.getNumero1()<0);

        do{
            System.out.println("Digite o número 2: ");
            s.setNumero2(ler.nextDouble());
            if(s.getNumero2()<0){
                System.out.println("Erro!");
                }
            }while(s.getNumero2()<0);

        //saída
        System.out.println("\nDados: "+s);
        System.out.println("Soma: "+s.calcularSoma());

        //repete
               System.out.println("\nDeseja continuar?"
                        + "\n1. Sim "
                         + "\n0. Não");
                continua= ler.nextByte();
    }while(continua!=0);
    System.out.println("Tchau, volte sempre!");
    }
}
