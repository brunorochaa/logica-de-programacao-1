
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (27/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        int valorSaque;
        int nota100;
        int nota50;
        int nota20;
        int nota10;
        int nota5;
        
        //valores
        System.out.println("Digite o valor a ser sacado");
        valorSaque= ler.nextInt();
        
        //calculo
        nota100= valorSaque/100;
        nota50= valorSaque%100/50;
        nota20= valorSaque%100%50/20;
        nota10= valorSaque%100%50%20/10;
        nota5= valorSaque%100%50%20%10/5;
        
        //saída
        System.out.println("Você recebeu "+nota100+ " Notas de R$ 100,00");
        System.out.println("Você recebeu "+nota50+ " Notas de R$ 50,00");
        System.out.println("Você recebeu "+nota20+ " Notas de R$ 20,00");
        System.out.println("Você recebeu "+nota10+ " Notas de R$ 10,00");
        System.out.println("Você recebeu "+nota5+ " Notas de R$ 5,00");
    }
}
        
    