
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (03/06/2019)
 */ 
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
 
        //variaveis
        String produto;
        double valorProduto;
        double totalProduto;
        String resposta;
        
        //valores
        System.out.println("Digite o nome do produto");
        produto= ler.nextLine();
        System.out.println("Digite o valor do produto");
        valorProduto= ler.nextDouble();
        
        //calculo
        if(valorProduto>=0.00 && valorProduto<=50.00){
            resposta= "Não tem desconto";
            totalProduto= valorProduto;
        }else if(valorProduto==50.00 && valorProduto<=100.00){
            resposta= "2% de Desconto";
            totalProduto= valorProduto*0.98;
        }else{
            resposta= "4% de Desconto";
            totalProduto= valorProduto*0.96;
        }
        
        //saída
        System.out.println("O produto "+produto+ " custa R$ "+valorProduto+ " "+resposta+ " o valor final fica R$ "+totalProduto);
    }
}
