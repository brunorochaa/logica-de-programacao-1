
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
        Aluno a = new Aluno();
        
        //menu
        byte menu;
        do{
            System.out.println("1. Cadastrar Notas"
                    +"\n2. Ver Notas"
                    +"\n3. Ver Primera Nota"
                    +"\n4. Ver Última Nota"
                    +"\n5. Ver Média da Turma"
                    +"\n6. Ver Maior Nota"
                    +"\n7. Ver Menor Nota"
                    +"\n0. Sair");
            menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 limparTela();
                 double media;
                 for(int i=0; i<a.getMedias().length; i++){
                   do{
                    System.out.println("Digite a "+(i+1)+"ª nota: ");
                    media= ler.nextDouble();
                    if(media<0 || media>10){
                        System.out.println("Erro!");
                }
                }while(media<0 || media>10);
                a.cadastrar(i, media);
                }
                break;
            
             case 2:
                 limparTela();
                 System.out.println(a);
                 break;
                 
             case 3:
                 limparTela();
                 System.out.println("Vendo a 1ª nota...");
                 System.out.println(a.verPrimeira());
                 break;
                 
             case 4:
                 limparTela();
                 System.out.println("Vendo a última nota...");
                 System.out.println(a.verUltima());
                 break;
                 
             case 5:
                 limparTela();
                 System.out.println("Vendo a média da turma...");
                 System.out.println(a.calcularMedia());
                 break;
                 
             case 6:
                 limparTela();
                 System.out.println("Vendo a maior nota...");
                 System.out.println(a.verMaior());
                 break;
                 
             case 7:
                 limparTela();
                 System.out.println("Vendo a menor nota...");
                 System.out.println(a.verMenor());
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
