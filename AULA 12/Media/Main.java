
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (03/06/2019)
 */
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
 
        //variaveis
        String nomeAluno;
        double nota1;
        double nota2;
        double media;
        String resposta;
        String resposta2;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nomeAluno= ler.nextLine();
        System.out.println("Digite a nota 1 de "+nomeAluno);
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2 de "+nomeAluno);
        nota2= ler.nextDouble();
        
        //calculo
        media= (nota1+nota2)/2;
        if(media==0 && media<=4){
            resposta= "Ruim, Conceito D";
            resposta2= "REPROVADO";
        }else if(media==4 && media<=6){
            resposta= "Regular, Conceito C";
            resposta2= "REPROVADO";
        }else if(media==6 && media<=9){
            resposta= "Bom, Conceito B";
            resposta2= "APROVADO";
        }else{
            resposta= "Òtimo, Conceito A";
            resposta2= "APROVADO";
        }
        
        //saída
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10){
            System.out.println("Dados Inválidos");
        }else{
        System.out.println(nomeAluno+ " tirou nota "+media+ " "+resposta+ ", "+resposta2);
    }
    
}
}