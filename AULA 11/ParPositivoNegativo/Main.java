
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (30/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
 
        //variaveis
        int numero;
        String resposta;
        
        //valores
        System.out.println("Digite o número");
        numero= ler.nextInt();
        
        //calculo
        if(numero%2==0 && numero>0){
            resposta= "Par Positivo";
        }else if(numero%2==0 && numero<0){
            resposta= "Par Negativo";
        }else if(numero%2!=0 && numero>0){
            resposta= "Impar Positivo";
        }else if(numero%2!=0 && numero<0){
            resposta= "Impar Negativo";
        }else if(numero%2!=0 && numero==0){
            resposta= "Nulo";
        }else{
            resposta= "Inválido";
        }

        //saída
        System.out.println(numero+ " é "+resposta);
    }
}