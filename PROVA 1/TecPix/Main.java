
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (05/06/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis 
        String nome;
        String rg;
        double salarioHora;
        double horasTrabalhadas;
        double salarioBruto;
        double salarioAumento;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nome= ler.nextLine();
        System.out.println("Digite o RG de "+nome);
        rg= ler.nextLine();
        System.out.println("Digite o salário por hora de "+nome);
        salarioHora= ler.nextDouble();
        System.out.println("Digite quantas horas "+nome+ " trabalha por mês");
        horasTrabalhadas= ler.nextDouble();
        
        //calculo
        salarioBruto= salarioHora*horasTrabalhadas;
        salarioAumento= salarioBruto*1.05;
        
        //saída
        if(salarioBruto<0 || horasTrabalhadas<0){
            System.out.println("Dados Inválidos");
        }else{
        System.out.println(nome+ " ganha R$ "+salarioBruto+ " pois trabalhou "+horasTrabalhadas+ " horas este mês");
        System.out.println("Seu salário aumentado 5% ficará R$ "+salarioAumento);
    }
}
}