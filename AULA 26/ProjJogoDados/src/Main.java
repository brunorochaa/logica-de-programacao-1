
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
         System.out.println("♥♦♣♠ JOGUE ♠♣♦♥");
         System.out.println("\n1. Instruções do Jogo"
                 +"\n2. Jogar"
                 +"\n0. Sair");
         menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 System.out.println("\nO Jogo dos Dados "
                         + "\ntrata-se de um jogo da sorte"
                         + "\no usuário escolhe um número, "
                         + "\ne reza para que o dado"
                         + "\ncaia no seu número"
                         +"\nBoa Sorte!\n");
                 break;
                 
             case 2:
                 byte jogadaUsuario;
                 System.out.println("Jogando...");
                 do{
                    System.out.println("Em qual número você aposta? De 1 à 6");
                    jogadaUsuario= ler.nextByte();
                    if(jogadaUsuario<1 ||jogadaUsuario>6){
                        System.out.println("Erro!");
                }
             }while(jogadaUsuario<1 ||jogadaUsuario>6);
             //instancia 
             Jogada j= new Jogada(jogadaUsuario);
             //verificar ganhou
             System.out.println(j);
             if(j.verificarSeGanhou()){
                System.out.println("Parabéns! Você ganhou!");
             }else{
                System.out.println("Hahaha! Perdeu!");
             }
             break;
             
            case 0:
                    System.out.println("Tem certeza que deseja sair?"
                            + "\n1. Continua"
                            + "\n0. Sair");
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
