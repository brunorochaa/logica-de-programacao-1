
public class Combustivel {
    //atributos
    public double valorCombustivel;
    public double autonomia;
    public double distancia;
    
    //calculo
    public double calcularTotalLitros(){
        return this.distancia/this.autonomia;
    }
    public double calcularValorGasto(){
        return calcularTotalLitros()*this.valorCombustivel;
    }
}
