
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
      Scanner ler= new Scanner(System.in);
        
        //instancia
       Combustivel c1= new Combustivel();
       
       //valores
        System.out.println("Digite o valor do litro de combustível: R$ ");
        c1.valorCombustivel= ler.nextDouble();
        System.out.println("Digite quantos km seu carro faz por litro: ");
        c1.autonomia= ler.nextDouble();
        System.out.println("Digite a distância que será percorrida: ");
        c1.distancia= ler.nextDouble();
        
        //saída
        System.out.println("Valor do litro do combustível: R$ "
                +c1.valorCombustivel);
        System.out.println("Quilômetro por litro: "+c1.autonomia);
        System.out.println("Distância percorrida: "+c1.distancia);
        System.out.println("Total litros: "+c1.calcularTotalLitros());
        System.out.println("Valor gasto: R$ "+c1.calcularValorGasto());
    }
    
}
