
//limpar tela
import java.awt.AWTException;
import java.awt.Robot;
//import scanner
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
     
    //menu
     byte menu;
     do{
         System.out.println("•▒✄ JOGUE ✄▒•");
         System.out.println("\n1. Instruções do Jogo"
                 +"\n2. Jogar"
                 +"\n3. Vamos ver se você é bom?"
                 +"\n0. Sair");
         menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 limparTela();
                 System.out.println("Instruções...");
                 System.out.println("\nO JanKenPon "
                         +"\ntrata-se de um jogo recreativo"
                         +"\no usuário escolhe pedra,papel ou tesoura "
                         +"\ne reza para que a máquina"
                         +"\nnão enrole,quebre ou corte ele"
                         +"\nBoa Sorte!\n");
                 break;
                 
             case 2:
                 limparTela();
                 String nome;
                 System.out.println("Começando o jogo...");
                 System.out.println("Digite seu nome: ");
                 nome= ler.next();
                 limparTela();
                 byte jogadaUsuario;
                 System.out.println("Jogando...");
                 do{
                    System.out.println(nome+" em qual número você aposta? De 1 à 3"
                         +"\n1. Pedra"
                         +"\n2. Papel"
                         +"\n3. Tesoura");
                    jogadaUsuario= ler.nextByte();
                    if(jogadaUsuario<1 || jogadaUsuario>3){
                        System.out.println("Erro!");
                }
             }while(jogadaUsuario<1 || jogadaUsuario>3);
             //instancia 
             Jogada j= new Jogada(jogadaUsuario);
             //verificar ganhou
             System.out.println(j);
                 System.out.println(nome+" "+j.verificarSeGanhouUsu());
             break;
             
             case 3:
                 /**limparTela();
                 int cont= 3;
                 
                 for(cont=0;cont>2;cont++){
                    limparTela();
                    System.out.println("Começando o jogo...");
                    System.out.println("Digite seu nome: ");
                    nome= ler.next();
                    limparTela();
                    byte jogadaUsuario;
                    System.out.println("Jogando...");
                    do{
                        System.out.println(nome+" em qual número você aposta? De 1 à 3"
                            +"\n1. Pedra"
                            +"\n2. Papel"
                            +"\n3. Tesoura");
                        jogadaUsuario= ler.nextByte();
                        if(jogadaUsuario<1 || jogadaUsuario>3){
                            System.out.println("Erro!");
                       }
                    }while(jogadaUsuario<1 || jogadaUsuario>3);
                }
             }
             break;*/
             
             case 0:
                    limparTela();
                    System.out.println("Tem certeza que deseja sair?"
                            + "\n1. Continua"
                            + "\n0. Sair");
                    menu= ler.nextByte();
                    
                    switch(menu){
                        case 1:
                            limparTela();
                            System.out.println("Legal!");
                            break;
                        case 0:
                            limparTela();
                            System.out.println("Tchau, volte logo!");
                            break;
                        default:
                            limparTela();
                            System.out.println("Opção inválida!");
                    }
                        break;   
                default:
                    limparTela();
                    System.out.println("Inválido!");
            }
        }while(menu!=0);
    }
     //limpar tela
        public static void limparTela(){
        try {
            Robot pressbot= new Robot();
            pressbot.keyPress(17);
            pressbot.keyPress(76);
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
        } catch (AWTException awte) {
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    } 
}