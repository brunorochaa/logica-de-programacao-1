
public class Hora {
    //variaveis
    public int hora;
    
    public int calcularMinutos(){
        return hora*60;
    }
    public int calcularSegundos(){
        return hora*3600;
    } 
    public String verDados(){
        return "\nHoras: "+this.hora+
               "\nMinutos: "+calcularMinutos()+
               "\nSegundos: "+calcularSegundos();
    }
    
    
}
