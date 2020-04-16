
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
        
        //instancia
        Pessoa p= new Pessoa ();
        
        //menu
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Digitar Dados"
                          +"\n2. Ver Dados"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nDigitando seus dados...");
                    System.out.println("Digite seu nome");
                    p.setNome(ler.next());
                    
                    do{
                        System.out.println("Digite seu CPF");
                        p.setCpf(ler.next());
                        if(p.getCpf().length()!=11){
                            System.out.println("Erro!");
                        }
                }while(p.getCpf().length()!=11);
                    
                    do{
                        System.out.println("Digite sua idade");
                        p.setIdade(ler.nextInt());
                        if(p.getIdade()<0){
                            System.out.println("Erro!");
                        }
                }while(p.getIdade()<0);
                    break;
                
                case 2:
                    System.out.println("Ver Dados: "+p);
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
                            System.out.println("Tchau, volte logo!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                        break;
                default:
                    System.out.println("Inválido!");
            }
        }while(menu!=0);
    } 
}
