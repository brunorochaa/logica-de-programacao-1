
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rcoha)
 * @version (23/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        String nome;
        double nota1;
        double nota2;
        double nota;
        double media;
        double falta;
        double aulas;
        double frequencia;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nome= ler.nextLine();
        System.out.println("Digite a Nota 1");
        nota1= ler.nextDouble();
        System.out.println("Digite a Nota 2");
        nota2= ler.nextDouble();
        System.out.println("Digite o número de faltas do aluno");
        falta= ler.nextDouble();
        System.out.println("Digite o número de aulas");
        aulas= ler.nextDouble();
        
        //calculos
        nota= nota1+nota2;
        media= nota/2;
        frequencia= ((aulas-falta)*0.75);
        
        //saída
        System.out.println("Aluno: "+nome);
        System.out.println("Teve nota "+nota+ " e média : "+media);
        System.out.println("Teve frequência de: "+frequencia);
    }
}
        
        
      
        
    
