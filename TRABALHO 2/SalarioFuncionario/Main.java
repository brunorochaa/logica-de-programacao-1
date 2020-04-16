
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
        double cargaHoraria;
        double salarioHora;
        double salario;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nomeFuncionario= ler.nextLine();
        System.out.println("Digite a carga horária de "+nomeFuncionario);
        cargaHoraria= ler.nextDouble();
        System.out.println("Digite o salário por hora de "+nomeFuncionario);
        salarioHora= ler.nextDouble();

        //calculo
        salario= salarioHora*cargaHoraria;
        
        //saída
        System.out.println("O funciońario "+nomeFuncionario+ " ganha por mês R$ "+salario);
    }
}