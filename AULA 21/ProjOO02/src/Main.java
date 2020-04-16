
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Numeros n= new Numeros ();
        
        //valores
        System.out.println("Digite número 1");
        n.numero1= ler.nextDouble();
        System.out.println("Digite número 2");
        n.numero2= ler.nextDouble();
        
        //menu
        byte menu;
        
        do{
            System.out.println("Escolha: "
                              +"\n1. Ver Dados"
                              +"\n2. Somar"
                              +"\n3. Multiplicar"
                              +"\n4. Número 1 par ou impar"
                              +"\n5. Número 2 par ou impar"
                              +"\n6. Raiz de 1"
                              +"\n7. Número 2 positivo/negativo/nulo"
                              +"\n8. Divisão"
                              +"\n9. Somar algum número com o número 2"
                              +"\n10. Altere os número"
                              +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nVisualizando Dados...");
                    System.out.println(n);
                    break;
                    
                case 2:
                    System.out.println("\nSomando...");
                    System.out.println(n.somar());
                    break;
                    
                case 3:
                    System.out.println("\nMultiplicando...");
                    System.out.println(n.multiplicar());
                    break;
                
                case 4:
                    System.out.println("\nVerificando se número 1 é par ou impar...");
                    System.out.println(n.umpar());
                    break;
                
                 case 5:
                    System.out.println("\nVerificando se número 2 é par ou impar...");
                    System.out.println(n.doispar());
                    break;
                     
                 case 6:
                     if(n.numero1<0){
                         System.out.println("Erro! Número 1 não pode ser negativo");
                     }else{
                         System.out.println("\nCalculando a raíz quadrada de número 1...");
                         System.out.println(n.raiz());
                     }
                     break;
                
                 case 7:
                    System.out.println("\nVerificando se número 2 é positivo, negativo ou nulo...");
                    System.out.println(n.pnn());
                    break;
                
                 case 8:
                     if(n.numero2== 0){
                         System.out.println("Erro! Número 2 não pode ser zero");
                     }else{
                         System.out.println("\nDividindo...");
                         System.out.println(n.divisao());
                     }
                     break;
                     
                 case 9:
                    System.out.println("\nSomando valor ao número 2...");
                    double numero3;
                    System.out.println("\nDigite um valor: ");
                    numero3= ler.nextDouble();
                    System.out.println(n.somardois(numero3));
                    break;
                
                 case 10:
                        System.out.println("\nAlterar os números...");
                        System.out.println("Digite número 1");
                        n.numero1= ler.nextDouble();
                        System.out.println("Digite número 2");
                        n.numero2= ler.nextDouble();
                        
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
