
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (30/05/20)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
 
        //variaveis
        byte idade;
        String nome;
        String resposta;

        //valores
        System.out.println("Digite o nome do nadador");
        nome= ler.nextLine();
        System.out.println("Digite a idade do nadador");
        idade= ler.nextByte();

        //calculo
        if(idade<8 && idade>70){
            resposta= "Não pode ser nadador";
        }else if(idade>=8 && idade<=10){
            resposta= "Infantil";
        }else if(idade==11 && idade==11){
            resposta= "Pré-Adolescente";
        }else if(idade==13 && idade==17){
            resposta= "Adolescente";
        }else if(idade>=18 && idade<=60){
            resposta= "Adulto";
        }else if(idade>=61 && idade<=70){
            resposta= "Idoso";
        }else{
            resposta= "Não pode ser nadador";
        }
        
        //saída
        System.out.println("O nadador "+nome+" tem "+idade+ " anos");
        System.out.println("O nadador "+nome+ " compete na categoria "+resposta);
    }
}