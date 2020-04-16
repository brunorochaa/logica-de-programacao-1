
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
        int quantidade;
        double calculo;
        String resposta;
        
        //valores
        System.out.println("Digite o seu código \n1.Aluno \n2.Professor \n3.Diretor \n4.Não aluno");
        codigo= ler.nextByte();
        System.out.println("Digite a quantidade de cópias");
        quantidade= ler.nextInt();
        
        //calculo
        if(codigo==1){
            calculo= quantidade*0.15;
            resposta= "Aluno";
        }else if(codigo==2){
            calculo= quantidade*0.07;
            resposta= "Professor";
        }else if(codigo==3){
            calculo= quantidade*0.00;
            resposta= "Diretor";
        }else if(codigo==4){
            calculo= quantidade*0.20;
            resposta= "Não aluno";
        }else{
            calculo= 0;
            resposta= "Inválido";
        }
        
        //saída
        System.out.println(resposta+ " você irá fazer "+quantidade+ " cópias");
        System.out.println("Você irá pagar R$ "+calculo);
    }
}
