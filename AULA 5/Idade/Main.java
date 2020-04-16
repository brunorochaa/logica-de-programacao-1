 
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (21/05/2019)
 */
public class Main{
    public static void main(String [] args){
        //variaveis
        String nome;
        int anoAtual;
        int anoNascimento;
        int idade;
        int meses;
        int dias;
        
        //valores
        nome= "Berenice Rocha";
        anoAtual= 2019;
        anoNascimento= 2000;
        meses= 12;
        dias= 365;
        
        //calculo
        idade= anoAtual-anoNascimento;
        meses= idade*meses;
        dias= idade*dias;
        
        //saída
        System.out.println("\fResposta: " );
        System.out.println("Nome: "+nome );
        System.out.println("Data de Nascimento: "+anoNascimento);
        System.out.println("Ano Atual: "+anoAtual);
        System.out.println("Idade em anos: "+idade);
        System.out.println("idade em Meses: "+meses);
        System.out.println("idade em Dias: "+dias);
    }
        
}
