
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
        
        //repetir
        byte continua;
        do{
        
        //valores
        System.out.println("Digite o nome do funcionário: ");
        c.setNome(ler.nextLine());
        
        do{
            System.out.println("Digite seu CPF");
            c.setCpf(ler.nextLine());
            if(c.getCpf().length()!=11){
                System.out.println("Erro!");
                }
        }while(c.getCpf().length()!=11);
        
        System.out.println("Digite o cargo: ");
        c.setCargo(ler.nextLine());
        
        do{
            System.out.println("Digite o valor da hora: ");
            c.setValorHora(ler.nextDouble());
            if(c.getValorHora()<0){
                System.out.println("Erro!");
            }
        }while(c.getValorHora()<0);
        
        do{
            System.out.println("Digite a quantidade de horas: ");
            c.setQuantidadeHoras(ler.nextDouble());
            if(c.getQuantidadeHoras()<0){
                System.out.println("Erro!");
            }
        }while(c.getQuantidadeHoras()<0);
        
        do{
            System.out.println("Digite o valor da passagem: ");
            c.setValorPassagem(ler.nextDouble());
            if(c.getValorPassagem()<0){
                System.out.println("Erro!");
            }
        }while(c.getValorPassagem()<0);
        
        do{
            System.out.println("Digite a quantidade de dependentes: ");
            c.setDependentes(ler.nextByte());
            if(c.getDependentes()<0){
                System.out.println("Erro!");
            }
        }while(c.getDependentes()<0);
        
        do{
            System.out.println("Digite a insalubridade: "
                    + "\n 1 - Sem insalubridade"
                    + "\n 2 - Mínimo"
                    + "\n 3 - Média"
                    + "\n 4 - Máxima");
            c.setTipoInsalubridade(ler.nextByte());
            if(c.getTipoInsalubridade()<0){
                System.out.println("Erro!");
            }
        }while(c.getTipoInsalubridade()<0);
        
        do{
            System.out.println("Digite o valor da refeição diária: ");
            c.setValorRefeicao(ler.nextDouble());
            if(c.getValorRefeicao()<0){
                System.out.println("Erro!");
            }
        }while(c.getValorRefeicao()<0);
        
        do{
            System.out.println("Digite as horas extras semanais: ");
            c.setHorasExtras50(ler.nextDouble());
            if(c.getHorasExtras50()<0){
                System.out.println("Erro!");
            }
        }while(c.getHorasExtras50()<0);
        
        do{
            System.out.println("Digite as horas extras fim de semana e "
                    + "feriados: ");
            c.setHorasExtras100(ler.nextDouble());
            if(c.getHorasExtras100()<0){
                System.out.println("Erro!");
            }
        }while(c.getHorasExtras100()<0);
  
        
        //saída
        System.out.println("\n---------RESPOSTAS-----------");
        System.out.println("Dados Pessoais: "+c);
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
        
        //repete
            System.out.println("\nDeseja repitir?"
                             + "\n1. Sim "
                             + "\n0. Não");
            continua= ler.nextByte();
        }while(continua!=0);
        System.out.println("Obrigado, volte sempre!");
    }
}

