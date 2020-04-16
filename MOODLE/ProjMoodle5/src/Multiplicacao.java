
public class Multiplicacao {
    //atributos
    private int numero1;
    private int numero2;
    private int numero3;
    
    //private
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNúmero 1: " +numero1 
                +"\nNúmero 2: " +numero2 
                +"\nNúmero 3: " +numero3;
    }
    
    //calculo
    public double multiplicacao(){
        return this.numero1*this.numero2*this.numero3;
    }
    
    
}
