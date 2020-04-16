
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Salario s= new Salario();
        
        //valores
        System.out.println("Digite o nome do funcionário");
        s.nome= ler.nextLine();
        System.out.println("Digite o salario de "+s.nome);
        s.salario= ler.nextDouble();
        
        //saída
        System.out.println("Dados: "+s.verDados());          
    }
    
}
