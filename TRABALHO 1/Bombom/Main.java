
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Main{
    public static void main(String [] args){
        //variaveis
        String nome;
        int quantidade;
        double valorUnitario;
        double valorTotal;
        
        //valores
        nome= "Caixa de Bombom";
        quantidade= 2;
        valorUnitario= 8.50;
        
        //calculo
        valorTotal= quantidade*valorUnitario;
        
        //saída
        System.out.println("O valor total é R$ "+valorTotal);
    }
}
        