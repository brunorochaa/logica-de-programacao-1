
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Tabuada t= new Tabuada ();
        
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
                    System.out.println("Digite o número no qual queira a tabuada");
                    t.setNumero(ler.nextInt());
                    break;
                case 2:
                    System.out.println("Visualizando tabuada do número: "+t.getNumero()+ "...");
                    for(int cont=0;cont<=10;cont++){
                    System.out.println(+t.getNumero()+" x "+cont+"="+t.calcularTabuada(cont));
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

               