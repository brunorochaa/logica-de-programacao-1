
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (04/06/2019)
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
        double frequencia;
        String resposta;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nome= ler.nextLine();
        System.out.println("Digite a NOTA 1 de "+nome);
        nota1= ler.nextDouble();
        System.out.println("Digite a NOTA 2 de "+nome);
        nota2= ler.nextDouble();
        System.out.println("Digite a frequência de "+nome);
        frequencia= ler.nextDouble();
        
        //calculo
        media= (nota1+nota2)/2;
        if(media>=6 && frequencia>=75){
            resposta= "Aprovado";
        }else{
            resposta= "Reprovado";
        }
        
        //saída
        System.out.println(nome+ " teve NOTA 1= "+nota1+ " e, NOTA 2= "+nota2);
        System.out.println(nome+ " teve MÉDIA= " +media+ " e, Frequência = "+frequencia+ "%");
        System.out.println(nome+ " foi "+resposta);
    }
}
        
        
        
