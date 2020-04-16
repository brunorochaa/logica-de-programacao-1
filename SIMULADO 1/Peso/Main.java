
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (04/06/2019)
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
        double emagrecer;
        double engordar;
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
            resposta= "Homem";
        }else if(sexo==2){
            resposta= "Mulher";
        }else{
            resposta= "Inválido";
        }
        emagrecer= peso*0.80;
        engordar= peso*1.15;
        
        //saída
        System.out.println(nome+" é "+resposta+" pesa "+peso+ " kgs e tem "+altura+ " de altura");
        System.out.println(nome+" caso emagreça seu novo peso seria "+emagrecer+ " kgs");
        System.out.println(nome+" caso engorde seu novo peso seria "+engordar+ " kgs");
    }
}
        