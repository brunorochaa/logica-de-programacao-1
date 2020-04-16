
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (23/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        String nomeProduto;
        double valorCusto;
        double valorJuros;
        double valorDesconto;
        
        //dados
        System.out.println("Digite o nome do produto");
        nomeProduto= ler.nextLine();
        System.out.println("Digite o valor de custo do produto");
        valorCusto= ler.nextDouble();
        
        //calculo
        valorJuros= valorCusto*1.10;
        valorDesconto= valorCusto*0.92;
        
        //saída
        System.out.println("\fO produto "+nomeProduto+ "custa R$ "+valorCusto);
        System.out.println("O produto "+nomeProduto+ " com 10% de juros custa R$ "+valorJuros);
        System.out.println("O produto "+nomeProduto+ " com 8% de desconto custa R$ "+valorDesconto);
    }
}
        
        
        
    