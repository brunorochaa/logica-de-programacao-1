
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Produto p1= new Produto();
        
        //valores
        System.out.println("Digite o nome do produto");
        p1.nome= ler.nextLine();
        System.out.println("Digite a quantidade do produto");
        p1.quantidade= ler.nextInt();
        System.out.println("Digite o valor de um produto");
        p1.valor= ler.nextDouble();
        
        //calculo
        System.out.println("Produto: "+p1.nome);
        System.out.println("Custa: R$ "+p1.valor);
        System.out.println("Tem estoque de "+p1.quantidade);
        System.out.println("Em estoque vale: R$ "+p1.calcularDesconto());
        System.out.println("Com 5% de desconto custa : R$ "
                +p1.calcularDesconto());
    }
    
}
