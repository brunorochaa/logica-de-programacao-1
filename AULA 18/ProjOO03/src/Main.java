
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Xerox x= new Xerox();
        
        //valores
        System.out.println("Digite o número de copias");
        x.quantidadeCopias= ler.nextInt();
        System.out.println("Você é "
                +   "\n1.Aluno \n" +
                    "2.Professor \n" +
                    "3.Diretor \n" +
                    "4.Não aluno");
        x.tipoCliente= ler.nextByte();
        //saída
        System.out.println("Dados: "+x.verDados());
        System.out.println("Valor Tota: R$ "+x.calcularTotal());
        
    }
    
}
