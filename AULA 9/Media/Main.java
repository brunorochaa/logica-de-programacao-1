
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
        String nome;
        double nota1;
        double nota2;
        double media;
        String resposta;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nome= ler.nextLine();
        System.out.println("Digite a nota 1");
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2");
        nota2= ler.nextDouble();
        
        //calculo
        media= (nota1+nota2)/2;
        
        if(media>=6){
            resposta= "Aprovado";
        }else{
            resposta= "Reprovado";
        }
        
        //saída
        System.out.println("Sua nota foi: "+media);
        System.out.println("Você foi "+resposta);
    }
}
        