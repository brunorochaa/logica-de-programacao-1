
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
        
        //instancia
        Vendedor v= new Vendedor();
        
        //valores
        System.out.println("Digite as vendas de Março: ");
        v.vendasMarco= ler.nextDouble();
        System.out.println("Digite as vendas de Abril: ");
        v.vendasAbril= ler.nextDouble();
        
        //saída
        System.out.println("Dados: "+v.verDados());
        System.out.println("Média: "+v.calcularMedia());
        System.out.println("Classificar: "+v.classificar());
    }
    
}
