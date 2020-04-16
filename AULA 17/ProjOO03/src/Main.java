
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Alunos a1= new Alunos();
        
        //valores
        System.out.println("Digite o nome do aluno:");
        a1.nome= ler.nextLine();
        System.out.println("Digite a nota 1 de "+a1.nome);
        a1.nota1= ler.nextDouble();
        System.out.println("Digite a nota 2 de "+a1.nome);
        a1.nota2= ler.nextDouble();
        
        //saída
        System.out.println("Aluno : "+a1.nome);
        System.out.println("Teve N1 = "+a1.nota1);
        System.out.println("Teve N2 = "+a1.nota2);
        System.out.println("Teve média de : "+a1.calcularMedia());
        System.out.println(a1.nome+" foi "+a1.retornarResposta());
       
    }
    
}
