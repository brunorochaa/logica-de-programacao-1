
public class Media {
    //atributos
    private double numero1;
    private double numero2;
    
    //private
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNúmero 1: " +numero1 
                +"\nNúmero 2: " +numero2;
    }
    
    //calculo
    public double calcularSoma(){
        return this.numero1+this.numero2;
    }
    
    public double calcularMedia(){
        return calcularSoma()/2;
    }
}
