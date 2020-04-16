
import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Salario s1= new Salario();
        
        //valores
        System.out.println("Digite o nome do funcionário");
        s1.nome= ler.nextLine();
        System.out.println("Digite o cargo de "+s1.nome);
        s1.cargo= ler.nextLine();
        System.out.println("Digite o salário hora de "+s1.nome);
        s1.salarioHora= ler.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas "+s1.nome);
        s1.quantidadeHora= ler.nextInt();
        
        //saída
        System.out.println("Nome: "+s1.nome);
        System.out.println("Cargo: "+s1.cargo);
        System.out.println("Salario hora: "+s1.salarioHora);
        System.out.println("Quantidade horas: "+s1.quantidadeHora);
        System.out.println("Salario Bruto: "+s1.calcularSalarioBruto());
        System.out.println("Salario com Aumento: "+s1.calcularSalarioAumento());
        
    }
    
}
