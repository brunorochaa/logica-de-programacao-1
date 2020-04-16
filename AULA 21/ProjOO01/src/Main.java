
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Dolar d= new Dolar ();
        
        //repetir
        byte continua;
        do{
        
            //valores
            do{
                System.out.println("Digite o valor em reais: ");
                d.valorReal= ler.nextDouble();
                if(d.valorReal<=0){
                    System.out.println("Erro!");
                }
            }while(d.valorReal<=0);

            //argumento
            double cotacao;

            do{
                System.out.println("Digite a cotação do dolár");
                cotacao= ler.nextDouble();
                if(cotacao<=0){
                    System.out.println("Erro!");
                }
            }while(cotacao<=0);

            //saída
            System.out.println("\nDados: "+d);
            System.out.println("\nValor em Dolár : US$ "+d.converter(cotacao));
            
            //repete
            System.out.println("\nDeseja continuar?"
                             + "\n1. Sim "
                             + "\n0. Não");
            continua= ler.nextByte();
        }while(continua!=0);
        System.out.println("Obrigado, volte sempre!");
    }

}
