
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (29/25/2019)
 */
import java.util.Scanner;

    public class Main{
        public static void main(String [] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //variaveis
        String nome;
        int sexo;
        double altura;
        double peso;
        double calculo;
        String resposta;

        //valores
        System.out.println("Digite o nome da pessoa");
        nome= ler.nextLine();
        System.out.println("Digite / 1= Homem / 2= Mulher");
        sexo= ler.nextInt();
        System.out.println("Digite a altura da pessoa");
        altura= ler.nextDouble();
        System.out.println("Digite o peso atual da pessoa");
        peso= ler.nextDouble();
        
        //calculo
        if(sexo==1){
            calculo= (72.7*altura)-58;
            resposta= "Homem";
        }else if(sexo==2){
            calculo= (62.1*altura)-44.7;
            resposta= "Mulher";
        }else{
            calculo= 0;
            resposta= "Inválido";
        }
        
        //saída
        System.out.println(nome+" é "+resposta+" pesa "+peso+ " kgs e tem "+altura+ " de altura");
        System.out.println("O peso ideal de "+nome+ " é "+calculo+ " kgs");
        }
    }
            
        

        


