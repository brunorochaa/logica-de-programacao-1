
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //valores
        System.out.println("Digite o nome do produto: ");
        String nome= ler.nextLine();
        
        int quantidade;
        do{
            System.out.println("Digite a quantidade de "+nome+"requerida: ");
            quantidade= ler.nextInt();
            if(quantidade<0){
                System.out.println("Erro!");
            }
        }while(quantidade<0);
        
        double valor;
        do{
            System.out.println("Digite o valor de "+nome+": ");
            valor= ler.nextDouble();
            if(valor<0){
                System.out.println("Erro!");
            }
        }while(valor<0);
        
        //instancia
        Produto p= new Produto(nome,quantidade,valor);
        
        //saída
        System.out.println("\nDados: "+p);
    }
    
}
