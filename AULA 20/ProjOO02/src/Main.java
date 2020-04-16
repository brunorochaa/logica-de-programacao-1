
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Funcionario f= new Funcionario ();
        
        //valores
        System.out.println("Digite seu nome");
        f.nome= ler.nextLine();
        System.out.println("Digite seu cargo");
        f.cargo= ler.nextLine();
        
        do{
        System.out.println("Digite o salário de "+f.nome);
        f.salario= ler.nextDouble();
        if(f.salario<0){
                System.out.println("Erro!");
            }
        }while(f.salario<0);
        
        //argumento
        double salarioMinimo;
        
        do{
        System.out.println("Digite o salário minímo");
        salarioMinimo= ler.nextDouble();
        if(salarioMinimo<0){
                System.out.println("Erro!");
            }
        }while(salarioMinimo<0);
        
        //saída
        System.out.println("Dados: "+f.toString());
        System.out.println(f.nome+" você ganha "+f.calcularQuantos(salarioMinimo)+ 
                " salário mínimos");
    }
    
}
