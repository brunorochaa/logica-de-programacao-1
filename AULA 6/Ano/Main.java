
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (22/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis
        int numeroAno;
        int numeroMeses;
        int numeroSemana;
        int numeroDia;
        
        //dados
        System.out.println("Converta o Ano");
        numeroAno = ler.nextInt();
        
        //calculo
        numeroMeses= numeroAno*12;
        numeroSemana= numeroAno*52;
        numeroDia= numeroAno*365;
        
        //saída
        System.out.println("Ano: "+numeroAno);
        System.out.println("Meses: "+numeroMeses);
        System.out.println("Semana: "+numeroSemana);
        System.out.println("Dia: "+numeroDia);
    }
}
        