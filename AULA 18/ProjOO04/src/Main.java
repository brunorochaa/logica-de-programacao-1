
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
        
        //instancia
        Hora h= new Hora();
        
        //valores
        System.out.println("Digite hora");
        h.hora= ler.nextInt();
        
        //saída
        System.out.println("Dados: "+h.verDados());
    }
    
}
