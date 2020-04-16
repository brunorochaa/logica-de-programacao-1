
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
      Scanner ler= new Scanner(System.in);
        
        //instancia
        Produto p= new Produto();
        
        //valores
        System.out.println("Digite o nome do produto: ");
        p.nome= ler.nextLine();
        System.out.println("Digite a quantidade: ");
        p.quantidade= ler.nextInt();
        System.out.println("Digite o valor do produto: ");
        p.valor= ler.nextDouble();
        
        //saída
        System.out.println("Dados: "+p.verDados());
        System.out.println("Valor Total: R$ "+p.calcularTotal());
        System.out.println("Valor Total com Desconto: R$"
                +p.calcularComDesconto());
        
    }
    
}
