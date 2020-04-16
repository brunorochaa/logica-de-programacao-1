
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
        double valorUnidade;
        int quantidadeProduto;
        double totalPagar;
        double totalJuros;
        double totalDesconto;
        
        //dados
        System.out.println("Digite o nome do produto");
        nomeProduto= ler.nextLine();
        System.out.println("Digite o valor de unidade do produto");
        valorUnidade= ler.nextDouble();
        System.out.println("Digite a quantidade do produto");
        quantidadeProduto= ler.nextInt();
        
        //calculo
        totalPagar= valorUnidade*quantidadeProduto;
        totalJuros= totalPagar*1.35;
        totalDesconto= totalPagar*0.78;
        
        //saída
        System.out.println("\fO produto "+nomeProduto+ " custa R$ "+valorUnidade);
        System.out.println("\fO produto "+nomeProduto+ " tem "+quantidadeProduto+ "em estoque");
        System.out.println("\fO estoque de "+nomeProduto+ " custa R$ "+totalPagar);
        System.out.println("O estoque de "+nomeProduto+ " com 35% de juros custa R$ "+totalJuros);
        System.out.println("O estoque de "+nomeProduto+ " com 22% de desconto custa R$ "+totalDesconto);
    }
}