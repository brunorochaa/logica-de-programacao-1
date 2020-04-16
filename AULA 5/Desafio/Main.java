
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (21/05/2019)
 */
public class Main{
    public static void main(String [] args){
        //variaveis
        double numero1;
        double numero2;
        double soma;
        double diferenca;
        double produto;
        double quociente;
        
        //valores
        numero1= 10;
        numero2= 5;
        
        //calculo
        soma= numero1+numero2;
        diferenca= numero1-numero2;
        produto= numero1*numero2;
        quociente= numero1/numero2;
        
        //saída
        System.out.println("\fRespostas: ");
        System.out.println("Número1: "+numero1);
        System.out.println("Número2: "+numero2);
        System.out.println("Soma: "+soma);
        System.out.println("Diferença: "+diferenca);
        System.out.println("Produto: "+produto);
        System.out.println("Quociente: "+quociente);
}
}