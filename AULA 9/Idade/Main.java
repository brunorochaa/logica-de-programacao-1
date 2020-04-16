
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (28/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        int idade;
        String resposta;
    
        //valores
        System.out.println("Digite a sua idade");
        idade= ler.nextInt();
        
        //calculo
        if(idade>=18){
            resposta="Maior de Idade";
        }else{
            resposta= "Menor de Idade";
        }
        //saída
        System.out.println("Você tem "+idade+ " anos, você é "+resposta);
    
}
}


        