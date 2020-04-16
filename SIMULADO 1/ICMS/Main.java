
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (04/06/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
 
        //variaveis
        String produto;
        double valorCusto;
        double icms;
        double valorTotal;
        
        //valores
        System.out.println("Digite o nome do produto");
        produto= ler.nextLine();
        System.out.println("Digite o valor de custo do produto");
        valorCusto= ler.nextDouble();
        
        //calculo
        valorTotal= valorCusto*1.38;
        
        //saída
        System.out.println("O valor final do produto "+produto+ " fica "+valorTotal);
    }
}
    