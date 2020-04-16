
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
        byte codigo;
        int quantidade;
        String resposta;
        double valor;
        double valorPagar;
        
        //valores
        System.out.println("Digite o código do produto \n1.Pastel de Vento \n2.Sanduíche de Bah \n3.Suco de Tamarindo \n4.Pão com ovo");
        codigo= ler.nextByte();
        System.out.println("Digite a quantidade de "+codigo+ " que deseja comprar");
        quantidade= ler.nextInt();
        
        //calculo
        if(codigo==1){
            valorPagar= quantidade*2.80;
            resposta= "Pastel de Vento";
        }else if(codigo==2){
            valorPagar= quantidade*3.90;
            resposta= "Sanduíche de Bah";
        }else if(codigo==3){
            valorPagar= quantidade*2.90;
            resposta= "Suco de Tamarindo";
        }else if(codigo==4){
            valorPagar= quantidade*1.60;
            resposta= "Pão com ovo";
        }else{
            valorPagar= 0;
            resposta= "Inválido";
        }
        
        //saída
        System.out.println("Você comprou "+quantidade+ " "+resposta);
        System.out.println("Valor a pagar R$ "+valorPagar);
        
    }
}
        
    