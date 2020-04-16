
public class Dado {
    //atributos
    private byte numero;
    
    //construtor
    public Dado(byte numero){
        this.numero= numero;
    }
    
    //toString
    @Override
    public String toString() {
        return "Número: " +numero;
    }
    
    //private
    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }
    
    
    
}
