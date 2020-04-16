
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
        String nomeAluno;
        String nomeDisciplina;
        double nota1;
        double nota2;
        double nota3;
        double peso1;
        double peso2;
        double peso3;
        double nota;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nomeAluno= ler.nextLine();
        System.out.println("Digite o nome da disciplina");
        nomeDisciplina= ler.nextLine();
        System.out.println("Digite o PESO 1");
        peso1= ler.nextDouble();
        System.out.println("Digite a NOTA 1");
        nota1= ler.nextDouble();
        System.out.println("Digite o PESO 2");
        peso2= ler.nextDouble();
        System.out.println("Digite a NOTA 2");
        nota2= ler.nextDouble();
         System.out.println("Digite o PESO 3");
        peso3= ler.nextDouble();
        System.out.println("Digite a NOTA 3");
        nota3= ler.nextDouble();
        
        //calculo
        nota= (nota1*peso1+nota2*peso2*2+nota3*peso3)/(peso1+peso2+peso3);
        
        //saída
        System.out.println("O aluno "+nomeAluno+ " teve média igual á "+nota+ " na disciplina "+nomeDisciplina);
    }
}
        
        