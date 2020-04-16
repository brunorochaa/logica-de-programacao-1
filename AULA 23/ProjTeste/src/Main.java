
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        
        //variaveis  
        System.out.println("Contagem Regressiva - 10 a 1");
        int cont= 10;
        //valores
        while(cont>=1){
            System.out.println(cont);
            cont--;
        }
        
        System.out.println("Contagem Regressiva - 20 a 30");
        for(cont=20;cont<=30;cont++){
            System.out.println(cont);
        }
    }
}
    
