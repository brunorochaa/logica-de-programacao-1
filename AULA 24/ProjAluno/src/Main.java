
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //valores
        System.out.println("Digite o nome do aluno");
        String nome= ler.nextLine();
        
        System.out.println("Digite o RA do aluno "+nome);
        int ra= ler.nextInt();
        
        String cpf;
        
        do{
            System.out.println("Digite o CPF do aluno "+nome);
            cpf= ler.next();
            if(cpf.length()!=11){
                                System.out.println("Erro!");
                            }
        }while(cpf.length()!=11);
        
        //instancia
        Aluno a= new Aluno(ra,nome,cpf);
        
        //saída
        System.out.println("\nDados: "+a);
    }
    
}
