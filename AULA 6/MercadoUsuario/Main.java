
/**
 * Write a description of class Class here.
 *
 * @author (Bruno Rocha)
 * @version (22/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        String nomeProduto;
        double valorCusto;
        double valorVenda;
        int quantidadeProduto;
        double lucroUnitario;
        double lucroTotal;
        
        //valores
        System.out.println("Digite o nome do produto");
        nomeProduto= ler.next();
        System.out.println("Digite o Valor de Custo");
        valorCusto= ler.nextDouble();
        System.out.println("Digite o Valor de Venda");
        valorVenda= ler.nextDouble();
        System.out.println("Digite a Quantidade do Produto");
        quantidadeProduto= ler.nextInt();
        
        //calculo
        lucroUnitario= valorVenda-valorCusto;
        lucroTotal= lucroUnitario*quantidadeProduto;
        
        //saída
        System.out.println("");
        System.out.println("Produto: "+nomeProduto);
        System.out.println("Valor Custo: "+valorCusto);
        System.out.println("Valor Venda: "+valorVenda);
        System.out.println("Quantidade de Produtos: "+quantidadeProduto);
        System.out.println("Lucro Unitário: "+lucroUnitario);
        System.out.println("Lucro Total: "+lucroTotal);
    }
        
}
    
