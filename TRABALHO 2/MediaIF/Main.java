
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
        double nota3;
        double nota4;
        double media;
        String resposta;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nomeAluno= ler.nextLine();
        System.out.println("Digite a nota 1 de "+nomeAluno);
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2 de "+nomeAluno);
        nota2= ler.nextDouble();
        System.out.println("Digite a nota 3 de "+nomeAluno);
        nota3= ler.nextDouble();
        System.out.println("Digite a nota 4 de "+nomeAluno);
        nota4= ler.nextDouble();
        
        //calculo
        media= (nota1+nota2+nota3+nota4)/4;
        if(media==0 && media<=2){
            resposta= "Ruim, Conceito D";
        }else if(media>=2 && media<=5.9){
            resposta= "Regular, Conceito C";
        }else if(media>=5.9 && media<=8.9){
            resposta= "Bom, Conceito B";
        }else if(media>=9 && media>=9){
            resposta= "Òtimo, Conceito A";
        }else{
            resposta= "Ruim, Conceito D";
        }
        
        //saída
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10 || nota3<0 || nota3>10 || nota4<0 || nota4>10){
            System.out.println("Dados Inválidos");
        }else{
        System.out.println(nomeAluno+ " tirou nota "+media+ " conceito "+resposta);
    }
}
}
        
