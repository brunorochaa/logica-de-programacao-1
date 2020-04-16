
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main{
    public static void main(String [] args){
        //variaveis
        String nomeProduto;
        double valorCusto;
        double valorVenda;
        int quantidadeProduto;
        double lucroUnitario;
        double lucroTotal;
        
        //valores
        nomeProduto= "Bombom";
        valorCusto= 0.50;
        valorVenda= 1.50;
        quantidadeProduto= 10;
        
        //calculo
        lucroUnitario= valorVenda-valorCusto;
        lucroTotal= lucroUnitario*quantidadeProduto;
        
        //saída
        System.out.println("\fResultado");
        System.out.println("Produto: "+nomeProduto);
        System.out.println("Valor Custo: "+valorCusto);
        System.out.println("Valor Venda: "+valorVenda);
        System.out.println("Quantidade de Bombons: "+quantidadeProduto);
        System.out.println("Lucro Unitário: "+lucroUnitario);
        System.out.println("Lucro Total: "+lucroTotal);
        
    }
        
}
        
        
       
        
       
        
        
        
       

