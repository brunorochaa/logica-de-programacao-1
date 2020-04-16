
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
        System.out.println("\f");
        
        //variaveis
        String nomeFuncionario;
        double horaMes;
        double salarioHora;
        double salarioBruto;
        double descontos;
        double descontoINSS;
        double descontoTransporte;
        double salarioLiquido;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nomeFuncionario= ler.nextLine();
        System.out.println("Digite o salário por hora do funcionario");
        salarioHora= ler.nextDouble();
        System.out.println("Digite o número de horas que o funcionario trabalha por mês");
        horaMes= ler.nextDouble();
        
        //calculo
        salarioBruto= horaMes*salarioHora;
        descontoINSS= salarioBruto*0.92;
        descontoTransporte= salarioBruto*0.94;
        descontos= descontoINSS+salarioBruto;
        salarioLiquido= descontos-salarioBruto;
       
        //saída
        System.out.println("Nome Funcionário "+nomeFuncionario);
        System.out.println("Salário Liquido do Funcionário R$ "+salarioLiquido);
    }
}
        
        
    