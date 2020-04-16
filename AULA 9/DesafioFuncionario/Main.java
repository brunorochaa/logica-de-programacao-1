
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (28/05/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        String nome;
        double cargaHoraria;
        double salarioHora;
        double salario;
        double salarioMinimo;
        String resposta;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nome= ler.nextLine();
        System.out.println("Digite a carga horária");
        cargaHoraria= ler.nextDouble();
        System.out.println("Digite o salario por hora do funcionário");
        salarioHora= ler.nextDouble();
        System.out.println("Digite o salario mínimo vigente do país");
        salarioMinimo= ler.nextDouble();
        
        //calculo
        salario= cargaHoraria*salarioHora;
        if(salario<salarioMinimo){
            resposta= "menos que um salário mínimo";
        }else if(salario==salarioMinimo){
            resposta= "um salário mínimo";
        }else{
            resposta= "mais que um salário mínimo";
        }
        
        //saída
        System.out.println("O funcionário: "+nome+ " trabalha "+cargaHoraria+ " horas por mês");
        System.out.println("O funcionário: "+nome+ " ganha R$ "+salarioHora+ " horas por hora");
        System.out.println("O funcionário: "+nome+ "ganha R$ "+salario+ " horas por mês");
        System.out.println("O funcionário: "+nome+ " ganha "+resposta);
    }
}
        
        
        
