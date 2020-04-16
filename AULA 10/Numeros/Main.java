
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (29/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        byte numero1;
        byte numero2;
        int numero3;
        double calculo;
        String resposta;
        
        //valores
        System.out.println("Digite o número 1");
        numero1= ler.nextByte();
        System.out.println("Digite o número 2");
        numero2= ler.nextByte();
        System.out.println("Escolha / 1=+ / 2=* / 3=- / 4=x2");
        numero3= ler.nextInt();
        
        //calculo
        if(numero3==1){
            calculo= numero1+numero2;
            resposta= "Adição";
        }else if(numero3==2){
            calculo= numero1*numero2;
            resposta= "Multiplicação";
        }else if(numero3==3){
            calculo= numero1-numero2;
            resposta= "Subtração";
        }else if(numero3==4){
            calculo= numero1*2;
            resposta= "x2";
        }else{
            calculo= 0;
            resposta= "Inválido";
        }
        
        //saída
        System.out.println("Você escolheu: "+resposta);
        System.out.println("Resposta: "+calculo);
    }
}
        
            
