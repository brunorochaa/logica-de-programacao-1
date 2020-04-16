
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
        double anoNascimento;
        double anoAtual;
        double idade;
        double ano2020;
        
        //valores
        System.out.println("Digite seu nome");
        nome= ler.nextLine();
        System.out.println("Digite a seu ano de nascimento");
        anoNascimento= ler.nextDouble();
        System.out.println("Digite o ano atual");
        anoAtual= ler.nextDouble();
        
        //calculo
        idade= anoAtual-anoNascimento;
        ano2020= 2020-anoNascimento;
        
        //saída
        if(idade<0){
            System.out.println("Valor Inválido!");
        }else{
        System.out.println(nome+ " nasceu em "+anoNascimento+ " e estamos em "+anoAtual);
        System.out.println(nome+ " tem "+idade+ " anos de idade, e em 2020 terá "+ano2020+ " anos de idade");
    }
}
}
        