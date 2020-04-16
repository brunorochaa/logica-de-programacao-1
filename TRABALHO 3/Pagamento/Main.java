
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (05/06/2019)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner ler= new Scanner(System.in);
     System.out.print("\f");
     
     //variaveis leitura
     String nome;
     String cpf;
     String cargo;
     double valorHora;
     double quantidadeHoras;
     double valorPassagem;
     byte dependentes;
     byte tipoInsalubridade;
     //variaveis de calculo
     double salarioBruto;
     double valeTransporte;
     double salarioFamilia;
     double insalubridade;
     double inss;
     double salarioLiquido;
     
     //valores
     System.out.println("Digite o nome do funcionário");
     nome= ler.nextLine();
     System.out.println("Digite o CPF de "+nome);
     cpf= ler.nextLine();
     System.out.println("Digite o cargo de "+nome);
     cargo= ler.nextLine();
     System.out.println("Digite salário por hora de "+nome);
     valorHora= ler.nextDouble();
     System.out.println("Digite a quantidade de horas trabalhadas de "+nome);
     quantidadeHoras= ler.nextDouble();
     System.out.println("Digite o valor da passagem de "+nome);
     valorPassagem= ler.nextDouble();
     System.out.println("Digite a quantidade de dependentes de "+nome);
     dependentes= ler.nextByte();
     System.out.println("Digite a opção de insalubridade: \n1 – Sem Insalubridade \n2 – Mínimo \n3 – Médio \n4 – Máximo");
     tipoInsalubridade= ler.nextByte();
     
     //calculo
     
     //calculando salárioBruto
     salarioBruto= valorHora*quantidadeHoras; 
     
     //calculando valeTransporte
     if((salarioBruto*0.06)>valorPassagem){
         valeTransporte= valorPassagem;
     }else{
         valeTransporte= salarioBruto*0.06;
     }
     
     //salarioFamilia
     if(salarioBruto<=907.77){
         salarioFamilia= 46.54*dependentes;
     }else if(salarioBruto>907.77 && salarioBruto<=1364.43){
         salarioFamilia= 32.80*dependentes;
     }else{
         salarioFamilia= 0;
     }
     
     //insalubridade
        switch (tipoInsalubridade) {
            case 1:
                insalubridade= 0;
                break;
            case 2:
                insalubridade= 980*0.1;
                break;
            case 3:
                insalubridade= 980*0.2;
                break;
            default:
                insalubridade= 980*0.4;
                break;
        }
        
     //inss
     if(salarioBruto<=1751.81){
        inss= salarioBruto*0.08;
     }else if(salarioBruto>=1751.82 && salarioBruto<=2919.72){
        inss= salarioBruto*0.09;
     }else if(salarioBruto>=2919.73 && salarioBruto<=5839.45){
        inss=salarioBruto*0.11;
     }else{
        inss= salarioBruto*0.27;
     }
     
     //salarioLíquido
     salarioLiquido= salarioBruto+salarioFamilia+insalubridade-valeTransporte
             -inss;
     
     //saída
        System.out.println("Dados Pessoais: ");
        System.out.println("Funcionário: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Cargo: "+cargo);
        System.out.println("Número de dependentes: ");
        System.out.println("Salário: ");
        System.out.println("Salário por hora é R$ : "+valorHora);
        System.out.println("Trabalha "+quantidadeHoras+ " por mês");
        System.out.println(nome+ " seu salário bruto é R$ : "+salarioBruto);
        System.out.println(nome+ " seu salário família é R$ : "+salarioFamilia);
        System.out.println(nome+ " você paga de INSS: R$ "+inss);
        System.out.println(nome+ " seu salário líquido é: R$"+salarioLiquido );
    }
}
