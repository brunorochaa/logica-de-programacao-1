
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        //instancia
        Calculo c= new Calculo ();
        
        //valores
        System.out.println("Digite o nome do funcionário: ");
        c.nome = ler.nextLine();
        System.out.println("Digite o cpf: ");
        c.cpf = ler.nextLine();
        System.out.println("Digite o cargo: ");
        c.cargo = ler.nextLine();
        
        do{
        System.out.println("Digite o valor da hora: ");
        c.valorHora = ler.nextDouble();
        if(c.valorHora<0){
            System.out.println("Erro!");
        }
        }while(c.valorHora<0);
        
        do{
        System.out.println("Digite a quantidade de horas: ");
        c.quantidadeHoras = ler.nextDouble();
        if(c.quantidadeHoras<0){
            System.out.println("Erro!");
        }
        }while(c.quantidadeHoras<0);
        
        do{
        System.out.println("Digite o valor da passagem: ");
        c.valorPassagem = ler.nextDouble();
        if(c.valorPassagem<0){
            System.out.println("Erro!");
        }
        }while(c.valorPassagem<0);
        
        do{
        System.out.println("Digite a quantidade de dependentes: ");
        c.dependentes = ler.nextByte();
        if(c.dependentes<0){
            System.out.println("Erro!");
        }
        }while(c.dependentes<0);
        
        do{
        System.out.println("Digite a insalubridade: "
                + "\n 1 - Sem insalubridade"
                + "\n 2 - Mínimo"
                + "\n 3 - Média"
                + "\n 4 - Máxima");
        c.tipoInsalubridade = ler.nextByte();
        if(c.tipoInsalubridade<0){
            System.out.println("Erro!");
        }
        }while(c.tipoInsalubridade<0);
        
        do{
        System.out.println("Digite o valor da refeição diária: ");
        c.valorRefeicao = ler.nextDouble();
        if(c.valorRefeicao<0){
            System.out.println("Erro!");
        }
        }while(c.valorRefeicao<0);
        
        do{
        System.out.println("Digite as horas extras semanais: ");
        c.horasExtras50 = ler.nextDouble();
        if(c.horasExtras50<0){
            System.out.println("Erro!");
        }
        }while(c.horasExtras50<0);
        
        do{
        System.out.println("Digite as horas extras fim de semana e "
                + "feriados: ");
        c.horasExtras100 = ler.nextDouble();
        if(c.horasExtras100<0){
            System.out.println("Erro!");
        }
        }while(c.horasExtras100<0);
        
        //saída
        System.out.println("\n---------RESPOSTAS-----------");
        System.out.println("Dados Pessoais: ");
        System.out.println("Funcionário: "+c.nome);
        System.out.println("CPF: "+c.cpf);
        System.out.println("Cargo: "+c.cargo);
        System.out.println("Valor hora: R$ "+c.valorHora);
        System.out.println("Quantidade de horas: "
                +c.quantidadeHoras);
        System.out.println("Valor Passagem: R$ "+c.valorPassagem);
        System.out.println("Nº de dependentes: "+c.dependentes);
        System.out.println("Insalubridade: "+c.tipoInsalubridade);
        System.out.println("Valor Refeição diária: R$ "
                +c.valorRefeicao);
        System.out.println("Horas Extras Semanais: "
                +c.horasExtras50);
        System.out.println("Horas Extras Finais de semana: "
                +c.horasExtras100);
        System.out.println("Cálculos:");
        System.out.println("Salário Bruto: R$ "+c.calcularSalarioBruto());
        System.out.println("Vale Transporte: R$ "+c.calcularValeTransporte());
        System.out.println("Salário Família: R$ "+c.calcularSalarioFamilia());
        System.out.println("Vale Refeição: R$ "+c.calcularValeRefeicao());
        System.out.println("INSS: R$ "+c.calcularInss());
        System.out.println("Insalubridade: "+c.calcularInsalubridade());
        System.out.println("Horas Extras 50%: R$ "+c.calcularValorExtra50());
        System.out.println("Horas Extras 100% R$ "+c.calcularValorExtra100());
        System.out.println("Salário Líquido: R$ "+c.calcularSalarioLiquido()); 
        
    }
    
}
