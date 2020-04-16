
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
    
    //instancia
    Funcionario f= new Funcionario();
    
    //repetir
        byte continua;
        do{
    
        //valores
        System.out.println("Digite o nome do funcionário: ");
        f.setNome(ler.nextLine());

        do{
            System.out.println("Digite o valor da hora: ");
            f.setValorHora(ler.nextDouble());
            if(f.getValorHora()<0){
                System.out.println("Erro!");
                }
            }while(f.getValorHora()<0);

        do{
            System.out.println("Digite a quantidade de horas: ");
            f.setQuantidadeHoras(ler.nextDouble());
            if(f.getQuantidadeHoras()<0){
                System.out.println("Erro!");
                }
            }while(f.getQuantidadeHoras()<0);

        do{
            System.out.println("Digite a quantidade de dependentes: ");
            f.setDependentes(ler.nextByte());
            if(f.getDependentes()<0){
                System.out.println("Erro!");
                }
            }while(f.getDependentes()<0);

        //saída
        System.out.println("\nDados: "+f);
        System.out.println("\nSalário Líquido: "+f.calcularSalarioLiquido());
        //repete
           System.out.println("\nDeseja continuar?"
                    + "\n1. Sim "
                     + "\n0. Não");
            continua= ler.nextByte();
    }while(continua!=0);
    System.out.println("Tchau, volte sempre!");
    }
}