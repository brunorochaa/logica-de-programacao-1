
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha, Antônio)
 * @version (06/06/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        String nome;
        int diaNascimento;
        int mesNascimento;
        int anoNascimento;
        int diaAtual;
        int mesAtual;
        int anoAtual;
        int idade;
        String signo;
        
        //valores
        System.out.println("Digite seu nome");
        nome= ler.nextLine();
        System.out.println("Digite seu dia de nascimento");
        diaNascimento= ler.nextInt();
        System.out.println("Digite seu mês de nascimento");
        mesNascimento= ler.nextInt();
        System.out.println("Digite seu ano de nascimento");
        anoNascimento= ler.nextInt();
        System.out.println("Digite dia atual");
        diaAtual= ler.nextInt();
        System.out.println("Digite mês atual");
        mesAtual= ler.nextInt();
        System.out.println("Digite ano atual");
        anoAtual= ler.nextInt();
        
        //calculando idade
        if(mesAtual<mesNascimento || mesNascimento==mesAtual && diaAtual<diaNascimento){
            idade= anoAtual-anoNascimento-1;
        }else{
            idade= anoAtual-anoNascimento;
        }
        
        //calculando signo
        if(mesNascimento==3 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==4 && diaNascimento>=1 && diaNascimento<=19){
            signo= "Áries";
        }else if(mesNascimento==4 && diaNascimento>=20 && diaNascimento<=30 || mesNascimento==5 && diaNascimento>=1 && diaNascimento <=20){
            signo= "Touro";
        }else if(mesNascimento==5 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==6 && diaNascimento>=1 && diaNascimento <=20){
            signo= "Gêmeos";
        }else if(mesNascimento==6 && diaNascimento>=21 && diaNascimento<=30 || mesNascimento==7 && diaNascimento>=1 && diaNascimento <=22){
            signo= "Câncer";
        }else if(mesNascimento==7 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==8 && diaNascimento>=1 && diaNascimento <=22){
            signo= "Leão";
        }else if(mesNascimento==8 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==9 && diaNascimento>=1 && diaNascimento <=22){
            signo= "Virgem";
        }else if(mesNascimento==9 && diaNascimento>=23 && diaNascimento<=30 || mesNascimento==10 && diaNascimento>=1 && diaNascimento <=22){
            signo= "Libra";
        }else if(mesNascimento==10 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==11 && diaNascimento>=1 && diaNascimento <=21){
            signo= "Escorpião";
        }else if(mesNascimento==11 && diaNascimento>=22 && diaNascimento<=30 || mesNascimento==12 && diaNascimento>=1 && diaNascimento <=20){
            signo= "Sagitário";
        }else if(mesNascimento==12 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==01 && diaNascimento>=1 && diaNascimento <=19){
            signo= "Capricórnio";
        }else if(mesNascimento==01 && diaNascimento>=20 && diaNascimento<=31 || mesNascimento==02 && diaNascimento>=1 && diaNascimento <=17){
            signo= "Aquário";
        }else{
            signo= "Peixes";
        }
        
        //saída
        if(mesAtual<1 || mesAtual>12 || mesNascimento<1 || mesNascimento>12){
            System.out.println("Erro! Este mês não existe.");
        }else if(diaAtual<1 || diaAtual>31 || diaNascimento<1 || diaNascimento>31){
            System.out.println("Erro! Este mês não existe.");
        }else if(anoNascimento>anoAtual){
            System.out.println("Erro! Você não nasceu ainda.");
        }else if(mesAtual==4 && diaAtual==31 || mesAtual==6 && diaAtual==31 || mesAtual==9 && diaAtual==31 || mesAtual==11 && diaAtual==31 || mesNascimento==4 && 
        diaNascimento==31 || mesNascimento==6 && diaNascimento==31 || mesNascimento==9 && diaNascimento==31 || mesNascimento==11 && diaNascimento==31){
            System.out.println("Erro! Este mês não possui 31 dias");
         }else if(diaNascimento== 29 && mesNascimento== 2 && anoNascimento %4 ==0){
            System.out.println("\fErro! Este ano é bissexto.");
        }else if(diaAtual== 29 && mesAtual== 2 && anoAtual %4 ==0){
            System.out.println("\fErro! Este ano é bissexto.");
        }else if(anoNascimento== anoAtual && mesNascimento== mesAtual && diaNascimento>diaAtual){
            System.out.println("Erro! Você não nasceu ainda.");
        }else if(diaNascimento== diaAtual && mesNascimento== mesAtual){
            System.out.println("\fHOJE VAI SER UMA FESTA, BOLO E GUARANÁ MUITO DOCE PRA VOCÊ! É O SEU ANIVERSÁRIO...");
            System.out.println("Nome: "+nome);
            System.out.println("Data de nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
            System.out.println("Data atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
            System.out.println("Você tem: "+idade+" anos");
            System.out.println("Você é do signo de "+signo);
        }else if(idade == 0){
            System.out.println("\fQUE NOVINHO! VOCÊ TEM MESES DE VIDA QUERIDO...");
            System.out.println("Nome: "+nome);
            System.out.println("Data de nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
            System.out.println("Data atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
            System.out.println("Você tem: "+idade+" anos");
            System.out.println("Você é do signo de "+signo);
        }else{
            System.out.println("\fNome: "+nome);
            System.out.println("Data de nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
            System.out.println("Data atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
            System.out.println("Você tem: "+idade+" anos");
            System.out.println("Você é do signo de "+signo);
        }
    }
}
     