
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Numero n= new Numero ();
        
        //menu
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Digitar Número"
                          +"\n2. Ver Número"
                          +"\n3. Ver Tabuada"
                          +"\n4. Ver Fatorial"
                          +"\n5. Ver Somatório"
                          +"\n6. Ver Somatório dos pares"
                          +"\n7. Ver Somatório dos impares"
                          +"\n8. Contar Pares"
                          +"\n9. Contar Impares"
                          +"\n10. Número Perfeito"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("Digite um número");
                    n.setNumero(ler.nextInt());
                    break;
                case 2:
                    System.out.println(""+n);
                    break; 
                case 3:
                    System.out.println("Visualizando tabuada do número: "+n.getNumero()+ "...");
                    for(int cont=0;cont<=10;cont++){
                    System.out.println(+n.getNumero()+" x "+cont+"="+n.calcularTabuada(cont));
                    }
                    break;
                case 4:
                    System.out.println("Visualizando fatorial do número: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularFatorial());
                    break;
                case 5:
                    System.out.println("Visualizando somatório do número: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularSomatorio());
                    break;
                case 6:
                    System.out.println("Visualizando somatório do número par: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularSomatorioPar());
                    break;
                case 7:
                    System.out.println("Visualizando somatório do número impar: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularSomatorioImpar());
                    break;
                case 8:
                    System.out.println("Visualizando Contando Par: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularContarPar());
                    break;
                case 9:
                    System.out.println("Visualizando Contando Impar: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularContarImpar());
                    break;
                case 10:
                    System.out.println("Visualizando Número Perfeito: "+n.getNumero()+ "...");
                    System.out.println(""+n.calcularPerfeito());
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

               
