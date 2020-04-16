
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (27/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        String funcionario;
        double salario;
        double salarioGratificacao;
        double salarioImposto;
        double salarioLiquido;
        
        //dados
        System.out.println("Digite o salário do funcionário");
        salario= ler.nextDouble();
        
        //calculo
        salarioGratificacao= salario*0.05;
        salarioImposto= salario*0.07;
        salarioLiquido= salario+salarioGratificacao-salarioImposto;
        
        //saída
        System.out.println("Salário Base: "+salario);
        System.out.println("Gratificação: "+salarioGratificacao);
        System.out.println("Impostos: "+salarioImposto);
        System.out.println("Salário com Líquido: "+salarioLiquido);
    }
}
   
    
