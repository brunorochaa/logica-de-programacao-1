
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
        byte codigo;
        double quantidade;
        double valor;
        double calculo;
        String resposta;
        String produto;
        
        //valores
        System.out.println("Digite o código do combustível \n1.GNV \n2.Etanol \n3.Gasolina Comum \n4.Gasolina Aditivada");
        codigo= ler.nextByte();
        System.out.println("Digite a quantidade em litros");
        quantidade= ler.nextDouble();
        
        //calculo
        if(codigo==1){
            calculo= quantidade*2.10;
            resposta= "GNV";
        }else if(codigo==2){
            calculo= quantidade*2.98;
            resposta= "Etanol";
        }else if(codigo==3){
            calculo= quantidade*4.00;
            resposta= "Gasolina Comum";
        }else if(codigo==4){
            calculo= quantidade*4.40;
            resposta= "Gasolina Aditivada";
        }else{
            calculo= 0;
            resposta= "Inválido";
        }
        
        //saída
        System.out.println("Você comprou "+quantidade+ " litros de "+resposta);
        System.out.println("Valor a pagar R$ "+calculo);
        
    }
}
        
