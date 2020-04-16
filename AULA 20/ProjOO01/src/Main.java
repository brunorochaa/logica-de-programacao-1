
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
        
        //valores
        System.out.println("Digite seu nome");
        p.nome= ler.nextLine();
        
        do{
            System.out.println("Digite seu ano de nascimento");
            p.anoNascimento= ler.nextInt();
            if(p.anoNascimento<0){
                System.out.println("Erro!");
            }
        }while(p.anoNascimento<0);
        
        //argumento
        int anoAtual;
        
        do{
            System.out.println("Digite o ano atual");
            anoAtual= ler.nextInt();
            if(anoAtual<p.anoNascimento){
                System.out.println("Erro!");
            }
        }while(anoAtual<=0 || anoAtual<p.anoNascimento);
        
        //idade
        
        //saída
        System.out.println("Dados: "+p.toString());
        System.out.println("Idade: "+p.calcularIdade(anoAtual));
    }
}
