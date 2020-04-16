
import java.awt.AWTException;
import java.awt.Robot;

import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Idade i1= new Idade();
        
        //menu
        byte menu;
        do{
            System.out.println("1. Cadastrar Idades"
                    +"\n2. Ver Idades"
                    +"\n3. Ver Média de Idade"
                    +"\n4. Ver Maior Idade"
                    +"\n5. Ver Menor Idade"
                    +"\n6. Ver Mostre a Idade em Ordem Crescente"
                    +"\n7. Contar Menores de Idade"
                    +"\n8. Contar Maiores de Idade"
                    +"\n0. Sair");
            menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 limparTela();
                 int idade;
                 for(int i=0; i<i1.getIdade().length; i++){
                 do{
                     System.out.println("Digite a "+(i+1)+"ª idade: ");
                    idade= ler.nextInt();
                    if(idade<0){
                     System.out.println("Erro!");
                    }
                 }while(idade<0);
                 i1.cadastrar(i, idade);
                }
                break;
                
             case 2:
                 limparTela();
                 System.out.println("Vendo as idades...");
                 System.out.println(i1);
                 break;
             
             case 3:
                 limparTela();
                 System.out.println("Vendo a média de idades...");
                 System.out.println(i1.calcularMedia());
                 break;
                 
             case 4:
                 limparTela();
                 System.out.println("Vendo a maior idade...");
                 System.out.println(i1.acharMaior());
                 break;
                 
             case 5:
                 limparTela();
                 System.out.println("Vendo a menor idade...");
                 System.out.println(i1.acharMenor());
                 break;    
                 
             case 6:
                 limparTela();
                 System.out.println("Vendo idades por odem crescente...");
                 i1.ordenar();
                 System.out.println(i1);
                 break;
                 
             case 7:
                 limparTela();
                 System.out.println("Contando menores de idade...");
                 i1.ordenar();
                 System.out.println(i1.contarMenor());
                 break;
             
             case 8:
                 limparTela();
                 System.out.println("Contando menores de idade...");
                 i1.ordenar();
                 System.out.println(i1.contarMaior());
                 break;
                 
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