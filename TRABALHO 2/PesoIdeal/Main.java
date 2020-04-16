
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
        String nome;
        int sexo;
        double altura;
        double peso;
        double calculo;
        double imc;
        String resposta;
        String resposta2;

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
        imc= peso/(altura*altura);
        if(imc<=18.5){
            resposta2= "Abaixo do peso";
        }else if(imc>=18.5 && imc<=24.9){
            resposta2= "Saudável";
        }else if(imc>=25.0 && imc<=29.9){
            resposta2= "Peso em excesso";
        }else if(imc>=30.0 && imc<=34.9){
            resposta2= "Obesidade Grau I";
        }else if(imc>=34.9 && imc<=39.9){
            resposta2= "Obesidade Grau II";
        }else{
            resposta2= "Obesidade Grau III"; 
        }
        
        //saída
        System.out.println(nome+" é "+resposta+" pesa "+peso+ " kgs e tem "+altura+ " de altura");
        System.out.println("O peso ideal de "+nome+ " é "+calculo+ " kgs");
        System.out.println("O seu imc é "+imc+ ", "+resposta2);
        
        }
    }
        
        
