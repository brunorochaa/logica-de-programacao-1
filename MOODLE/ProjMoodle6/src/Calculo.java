
public class Calculo {
    //atributos
    private double a;
    
    //private
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nA: " +a;
    }
    
    //dobro
    public double calcularDobro(){
        return this.a*2;
    }
    
    //triplo do dobro
    public double calcularTriplo(){
        return calcularDobro()*3;
    }
    
    //metade do triplo do dobro
    public double calcularMetade(){
        return calcularTriplo()/2;
    }
    
    //quadrado da metade do triplo do dobro
    public double calcularQuadrado(){
        return Math.pow(calcularMetade(),2);
    }
    
    //quinta do quadrado da metade do triplo do dobro
    public double calcularQuinto(){
        return calcularQuadrado()/5;
    }
    
}
