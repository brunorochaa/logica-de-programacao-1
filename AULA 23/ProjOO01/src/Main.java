
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Aluno a= new Aluno ();
        
        //repete
        byte menu;
        do{
       
            //valores
            System.out.println("Digite o nome do aluno");
            a.setNome(ler.next());

            do{
                System.out.println("Digite a Nota 1 de "+a.getNome());
                a.setNota1(ler.nextDouble());
                if(a.getNota1()<0 || a.getNota1()>10){
                        System.out.println("Erro!");
                }
            }while(a.getNota1()<0 || a.getNota1()>10);

            do{
                System.out.println("Digite a Nota 2 de "+a.getNome());
                a.setNota2(ler.nextDouble());
                if(a.getNota2()<0 || a.getNota2()>10){
                        System.out.println("Erro!");
                }
            }while(a.getNota2()<0 || a.getNota2()>10);

            //argumento
            int numeroAulas;

            do{
                System.out.println("Digite o número de Aulas de "+a.getNome());
                numeroAulas= ler.nextInt();
                if(numeroAulas<0){
                        System.out.println("Erro!");
                }
            }while(numeroAulas<0);

            do{
                System.out.println("Digite o número de faltas de "+a.getNome());
                a.setFaltas(ler.nextInt());
                if(a.getFaltas()<0 || a.getFaltas()>numeroAulas){
                        System.out.println("Erro!");
                }
            }while(a.getFaltas()<0 || a.getFaltas()>numeroAulas);

            //saída
            System.out.println("Dados: "+a);
            System.out.println(a.getNome()+" teve média: "+a.calcularMedia());
            System.out.println(a.getNome()+" teve frequência: "+a.calcularFrequencia(numeroAulas)+ "%");
            System.out.println(a.getNome()+" foi: "+a.calcularAprovado(numeroAulas));

        //repete
            System.out.println("\nDeseja continuar?"
                             + "\n1. Sim "
                             + "\n0. Não");
            menu= ler.nextByte();
        }while(menu!=0);
        System.out.println("Tchau, volte sempre!");
    }
}
