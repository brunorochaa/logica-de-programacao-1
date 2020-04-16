
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (22/05/2019)
 */
import java.util.Scanner;

public class Main
{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis 
        String nome;
        double nota1;
        double peso1;
        double nota2;
        double peso2;
        double nota3;
        double peso3;
        double nota;
        double media;
        
        //valores
        System.out.println("Digite o nome do Aluno");
        nome= ler.nextLine();
        System.out.println("Digite o Peso1");
        peso1= ler.nextDouble();
        System.out.println("Digite a Nota1 do Aluno");
        nota1= ler.nextDouble();
        System.out.println("Digite o Peso2");
        peso2= ler.nextDouble();
        System.out.println("Digite a Nota2 do Aluno");
        nota2= ler.nextDouble();
        System.out.println("Digite o Peso3");
        peso3= ler.nextDouble();
        System.out.println("Digite a Nota3 do Aluno");
        nota3= ler.nextDouble();
        
        //calculo
        nota= nota1*peso1+nota2*peso2+nota3*peso3;
        media= nota/(peso1+peso2+peso3);
        
        //saída
        System.out.println("Aluno: "+nome);
        System.out.println("Peso1: "+peso1);
        System.out.println("Nota1: "+nota1);
        System.out.println("Peso2: "+peso2);
        System.out.println("Nota2: "+nota2);
        System.out.println("Peso3: "+peso3);
        System.out.println("Nota3: "+nota3);
        System.out.println("Nota Total do Aluno: "+nota);
        System.out.println("Média Ponderada: "+media);
    }
}
        
        
        
        