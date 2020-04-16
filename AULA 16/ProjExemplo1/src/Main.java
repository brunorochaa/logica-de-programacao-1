
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //variaveis
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;
        String conceito;
        
        //valores
        System.out.println("Digite o nome: ");
        nome= ler.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2= ler.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3= ler.nextDouble();
        
        //calculo
        media=(nota1+nota2+nota3)/3;
        if(media<=2){
            conceito= "D";
        }else if(media>2 && media <6){
            conceito= "C";
        }else if(media>=6 && media<9){
            conceito= "B";
        }else{
            conceito= "A";
        }
        
        //saída
        System.out.println("RESPOSTA");
        System.out.println("Nome: "+nome);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Média: "+media);
        System.out.println("Conceito: "+conceito);
    }
    
}
