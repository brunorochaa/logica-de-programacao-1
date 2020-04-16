
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
        double cargaHoraria;
        double salarioHora;
        double salarioBruto;
        
        //valor
        nome= "Zé";
        cargaHoraria= 220;
        salarioHora= 10;
        
        //caculo
        salarioBruto= cargaHoraria*salarioHora;
        
        //saída
        System.out.println("\fResposta: ");
        System.out.println("Funcionário: "+nome);
        System.out.println("Carga Horária: "+cargaHoraria);
        System.out.println("Salário por Hora: "+salarioHora);
        System.out.println("Salário Bruto: "+salarioBruto);
}
}
