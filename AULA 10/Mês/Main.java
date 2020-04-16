  
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
        byte mes;
        String resposta;
        
        //valores
        System.out.println("Digite o número do mês");
        mes= ler.nextByte();
        
        //calculo
        if(mes==1){
            resposta= "Janeiro";
        }else if(mes==2){
            resposta= "Fevereiro";
        }else if(mes==3){
            resposta= "Março";
        }else if(mes==4){
            resposta= "Abril";
        }else if(mes==5){
            resposta= "Maio";
        }else if(mes==6){
            resposta= "Junho";
        }else if(mes==7){
            resposta= "Julho";
        }else if(mes==8){
            resposta= "Agosto";
        }else if(mes==9){
            resposta= "Setembro";
        }else if(mes==10){
            resposta= "Outubro";
        }else if(mes==11){
            resposta= "Novembro";
        }else if(mes==12){
            resposta= "Dezembro";
        }else{
            resposta= "Inválido";
        }
        //saída
        System.out.println("Mês: "+resposta);
    }
}