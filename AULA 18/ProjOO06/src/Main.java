
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Triangulo t= new Triangulo ();
        
        //valores
        System.out.println("Insira valor de X");
        t.x= ler.nextInt();
        System.out.println("Insira valor de Y");
        t.y= ler.nextInt();
        System.out.println("Insira valor de Z");
        t.z= ler.nextInt();
        
        //saída
        System.out.println("Dados: "+t.verDados());
    }
    
}
