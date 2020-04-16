
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
        String nomeFuncionario;
        double salario;
        double vendas;
        double comissao;
        double salarioTotal;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nomeFuncionario= ler.nextLine();
        System.out.println("Digite o salário do funcionário "+nomeFuncionario);
        salario= ler.nextDouble();
        System.out.println("Digite o das vendas que "+nomeFuncionario+ " fez");
        vendas= ler.nextDouble();
        
        //calculo
        comissao= vendas*0.04;
        salarioTotal= salario+comissao;
        
        System.out.println("O funciońario "+nomeFuncionario+ "ganha por mês R$ "+salario);
        System.out.println("O funciońario "+nomeFuncionario+ "ganha com comissão R$ "+salarioTotal+ " por mês");
    }
}