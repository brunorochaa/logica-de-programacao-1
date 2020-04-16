
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (05/06/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("\f");
        
        //variaveis 
        String nome;
        String cpf;
        String cargo;
        double salarioHora;
        double quantidadeHora;
        double valorPassagens;
        double quantidadeDependentes;
        byte codigoInsalubridade;
        double salarioBruto;
        double valeTransporte;
        double salarioFamilia;
        double descontoInss;
        double salarioLiquido;
        //variaveis pós leitura
        double insalubridade;
        double valorTransporte;
        
        //dados
        System.out.println("Digite o nome do funcionário");
        nome= ler.nextLine();
        System.out.println("Digite o CPF de "+nome);
        cpf= ler.nextLine();
        System.out.println("Digite o cargo de "+nome);
        cargo= ler.nextLine();
        System.out.println("Digite o salário por hora de "+nome);
        salarioHora= ler.nextDouble();
        System.out.println("Digite o quantas horas "+nome+ " trabalha por mês");
        quantidadeHora= ler.nextDouble();
        System.out.println("Digite o gasto e passagens de "+nome+ " por mês");
        valorTransporte= ler.nextDouble();
        System.out.println("Digite o número de dependentes(filhos) de "+nome);
        quantidadeDependentes= ler.nextByte();
        System.out.println("Digite a opção de insalubridade / \n1= Sem / \n2= Minímo / \n3=Médio / \n4=Maxímo");
        codigoInsalubridade= ler.nextByte();
       
        //saída
        salarioBruto= salarioHora*quantidadeHora; //salário bruto
        valeTransporte= 0.06/salarioBruto; // 6% 
        //valor passagem
        if(valorTransporte>valeTransporte){
            valorPassagens= valorTransporte;
        }else{
            valorPassagens= valorTransporte*0.06;
        }
        //salarioFamilia
        if(salarioBruto==0 && salarioBruto<=725.02){
            salarioFamilia= 37.18*quantidadeDependentes;
        }else if(salarioBruto>=725.03 && salarioBruto<=1089.72){
            salarioFamilia= 26.20*quantidadeDependentes;
        }else{
            salarioFamilia= 0*quantidadeDependentes;
        }
        //insalubridade
        if(codigoInsalubridade==1){
            insalubridade= 998.00;
        }else if(codigoInsalubridade==2){
            insalubridade= 998.00*1.10;
        }else if(codigoInsalubridade==3){
            insalubridade= 998.00*1.20;
        }else if(codigoInsalubridade==4){
            insalubridade= 998.00*1.40;
        }else{
            insalubridade= 0;
        }  
        //inss
         if(salarioBruto<= 1.75181){
            descontoInss= salarioBruto*0.92;
        }else if(salarioBruto>= 1.75182 && salarioBruto <= 2.91972){
            descontoInss= salarioBruto*0.93;
        }else if(salarioBruto>= 2.91973 && salarioBruto <= 5.83945){
            descontoInss= salarioBruto*0.89;
        }else if(salarioBruto>= 5.83946){
            descontoInss= salarioBruto*0.73;
        }else{
            descontoInss= salarioBruto*0.73;
        }
        //salario liquido
        salarioLiquido= salarioBruto-valorPassagens+salarioFamilia+insalubridade-descontoInss;
        
        //saída
        System.out.println("O funcionário "+nome+ ", CPF "+cpf+ ", " +cargo);
        System.out.println("Trabalha "+quantidadeHora+ " horas por mês, ganhando R$ "+salarioHora+ " por hora");
        System.out.println(nome+ " gasta R$ "+valorPassagens+ " com passagem por mês ");
        System.out.println(nome+ " tem "+quantidadeDependentes+ " dependentes");
        System.out.println("Salário líquido de "+nome+ " é igual a R$ "+salarioLiquido);
    }
}
        
            
            
            
        
            