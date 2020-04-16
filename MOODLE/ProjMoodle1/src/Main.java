
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    
    //instancia
    Pessoa p= new Pessoa();
    
    //repetir
    byte continua;
    do{
    
        //valores
        System.out.println("Digite o seu nome: ");
        p.setNome(ler.nextLine());
        do{
            System.out.println(p.getNome()+" digite sua idade: ");
            p.setIdade(ler.nextInt());
            if(p.getIdade()<0){
            System.out.println("Erro!");
            }
        }while(p.getIdade()<0);

        //saída
        System.out.println(p);
        //repete
           System.out.println("\nDeseja continuar?"
                    + "\n1. Sim "
                     + "\n0. Não");
            continua= ler.nextByte();
    }while(continua!=0);
    System.out.println("Tchau, volte sempre!");
    }
}