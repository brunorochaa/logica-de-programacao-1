
public class Dolar {
    //atributos
    public double valorReal;
    
    //toString
    @Override
    public String toString() {
        return "\nValor Real: R$ " +valorReal;
    }
    
    //calculo
    public double converter(double cotacao){
        return this.valorReal/cotacao;
    }
}
