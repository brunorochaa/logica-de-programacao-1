
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version (29/05/2019)
 */
public class Main{
    public static void main (String [] args){
        //declaração 
        String nome;
        double valor;
        int quantidade;
        double totalPagar;
      
        
        //valor
        nome= "Bis";
        valor= 3.50;
        quantidade= 10;
        
        //calculo
        totalPagar= valor*quantidade;
        
        //saída
        System.out.println("\fResposta: ");
        System.out.println("Nome: "+nome);
        System.out.println("Valor R$ "+valor);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Total a Pagar R$: "+totalPagar);
    }
        
        
        

}