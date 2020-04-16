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
        
        //varivaveis
        String nome;
        int idade;
        int anoAtual;
        int anoNascimento;
        
        //dados
        System.out.println("Digite seu nome");
        nome=ler.nextLine();
        System.out.println("Digite sua idade");
        idade=ler.nextInt();
        System.out.println("Digite o ano atual");
        anoAtual=ler.nextInt();
        
        //calculos
        anoNascimento= anoAtual-idade;
        
        //saída
        System.out.println("\f"+nome+" você tem "+idade+" anos, porque nasceu em " +anoNascimento);
    }
}
        
        
    

