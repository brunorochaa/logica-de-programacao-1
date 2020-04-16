
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        ContaBancaria c= new ContaBancaria ();
        
        //valores
        System.out.println("Digite o número da sua conta: ");
        c.numeroConta= ler.nextInt();
        
        
        do{
            System.out.println("Digite o limite: ");
            c.limite= ler.nextDouble();
            if(c.limite<=0){
                System.out.println("Erro!");
        }
        }while(c.limite<=0);
        
        do{
            System.out.println("Digite o saldo: ");
            c.saldo= ler.nextDouble();
            if(c.saldo<=0){
                System.out.println("Erro!");
        }
        }while(c.saldo<=0);
        
        //depositar
        double valorDeposito;
        //validando
        do{
            System.out.println("Digite o valor do depósito: ");
            valorDeposito= ler.nextDouble();
            if(valorDeposito<=0){
                System.out.println("Erro!");
        }
        }while(valorDeposito<=0);
        
        //depositando
        c.depositar(valorDeposito);
        System.out.println("Saldo: R$ "+c.verSaldo());
        
        //sacar
        double valorSaque;
        //valindando
        do{
            System.out.println("Digite o valor de saque: ");
            valorSaque= ler.nextDouble();
            if(valorSaque<=0){
                System.out.println("Erro!");
        }
        }while(valorSaque<0);
        
        //sacando
        c.sacar(valorSaque);
        System.out.println("Saldo: R$ "+c.verSaldo());
        
        //saída
        System.out.println("\nDados: "+c.toString());
    }
    
}
