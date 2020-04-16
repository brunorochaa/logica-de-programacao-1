
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
        double nota1;
        double nota2;
        double nota3;
        double media;
        String conceito;
        
        //valores
        System.out.println("Digite o nome do aluno");
        nome= ler.nextLine();
        System.out.println("Digite a nota 1 de "+nome);
        nota1= ler.nextDouble();
        System.out.println("Digite a nota 2 de "+nome);
        nota2= ler.nextDouble();
        System.out.println("Digite a nota 3 de "+nome);
        nota3= ler.nextDouble();
        
        //calculo
        media= (nota1+nota2+nota3)/3;
        if(media==0 && media<=6){
            conceito= "Ruim, Conceito D";
        }else if(media==6 && media<=7.9){
            conceito= "Regular, Conceito C";
        }else if(media==8 && media<=8.9){
            conceito= "Bom, Conceito B";
        }else{
            conceito= "Òtimo, Conceito A";
        }
        
        //saída
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10 || nota3<0 || nota3>10){
            System.out.println("Dados Inválidos");
        }else{
        System.out.println(nome+ " tirou nota "+media+ ", "+conceito);
    }
}
}
        
    
