
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
        String nomeFuncionario;
        double salario;
        double vendasMarco;
        double vendasAbril;
        double media;
        String conceito;
        
        //valores
        System.out.println("Digite o nome do funcionário");
        nomeFuncionario= ler.nextLine();
        System.out.println("Digite o valor de vendas que "+nomeFuncionario+" fez em Março");
        vendasMarco= ler.nextDouble();
        System.out.println("Digite o valor de vendas que "+nomeFuncionario+" fez em Abril");
        vendasAbril= ler.nextDouble();
        
        //calculo
        media= (vendasMarco+vendasAbril)/2;
        if(media>=5.000){
            conceito= "Conceito 10 - Excelente Vendedor";
        }else if(media>=3.500 && media<=5.000){
            conceito= "Conceito 9 - Muito Bom Vendedor";
        }else if(media>=2.000 && media<=3.500){
            conceito= "Conceito 8 - Bom Vendedor";
        }else if(media>=1.000 && media<=2.000){
            conceito= "Conceito 7 - Vendedor Esforçado";
        }else if(media<=1.000){
            conceito= "Conceito 6 - Vendedor Desmotivado";
        }else{
            conceito= "Conceito 6 - Vendedor Desmotivado";
        }
        
        //saída
        if(media<0){
            System.out.println("Valor Inválido!");
        }else{
        System.out.println("O funciońario "+nomeFuncionario+ " vendeu R$ "+vendasMarco+ " em Março");
        System.out.println("O funciońario "+nomeFuncionario+ " vendeu R$ "+vendasAbril+ " em Abril");
        System.out.println("O funciońario "+nomeFuncionario+ " tem média de vendas de R$ "+media);
        System.out.println("O funciońario "+nomeFuncionario+ " tem conceito "+conceito);
    }
    }
}