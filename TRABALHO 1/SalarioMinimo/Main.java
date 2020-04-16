
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (23/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f"); 
        
        //variaveis
        String nome;
        double salario;
        double salarioMin;
        double salarios;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nome= ler.nextLine();
        System.out.println("Digite o salário do funcionário");
        salario= ler.nextDouble();
        System.out.println("Digite o salário minímo");
        salarioMin= ler.nextDouble();
        
        //calculo
        salarios= salario/salarioMin;
        
        //saída
        System.out.println("O funcionário "+nome+ "ganha "+salarios+ " salários minímos");
    }
}
        
    