
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
        
        //menu 
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Ver Saldo"
                          +"\n2. Depositar "
                          +"\n3. Sacar"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nVisualizando Saldo...");
                    System.out.println(c);
                    break;
                        
                case 2:
                    System.out.println("\nDepositando...");
                    double valorDeposito;
                    do{
                        System.out.println("Digite o valor do depósito: ");
                        valorDeposito= ler.nextDouble();
                        if(valorDeposito<=0){
                        System.out.println("Erro!");
                        }
                    }while(valorDeposito<=0);
                    c.depositar(valorDeposito);
                    System.out.println("Depósito efetuado com sucesso!");
                    break;
                        
                case 3:
                    System.out.println("\nSacando...");
                    double valorSaque;
                    do{
                        do{
                            System.out.println("Digite o valor de saque: ");
                            valorSaque = ler.nextDouble();
                            if(valorSaque > c.limite){
                            System.out.println("Erro! Valor de saque maior que o limite!");
                            }
                            if(valorSaque> c.verSaldo()){
                               System.out.println("Deseja entrar no limite de crédito?"
                                       + "\n1. Sim"
                                       + "\n2. Não");
                            menu = ler.nextByte();
                            }
                            switch(menu){
                                case 1:
                                   System.out.println("Usando o limite de crédito.");
                                   break;

                                case 2: 
                                   System.out.println("Reidigite o valor do saque.");
                                   valorSaque= ler.nextDouble();
                                   if(valorSaque> c.limite){
                                    System.out.println("Erro! Valor de saque maior que o limite!");
                                    }
                                    if(valorSaque<= 0){
                                    System.out.println("Erro! Valor invalido");
                                    }
                            }
                        }while(valorSaque<= 0);
                        }while(valorSaque> c.limite);
                        c.sacar(valorSaque);
                        System.out.println("Saque efetuado com sucesso!");
                        break;

                case 0:
                    System.out.println("Tem certeza que deseja sair?"
                            + "\n1. Continua"
                            + "\n2. Sair");
                    menu= ler.nextByte();
                    
                    switch(menu){
                        case 1:
                            System.out.println("Legal!");
                            break;
                        case 0:
                            System.out.println("Tchau, volte sempre!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;           
                default:
                    System.out.println("Opção inválida!");
            }
        }while(menu!=0);
    } 
}
