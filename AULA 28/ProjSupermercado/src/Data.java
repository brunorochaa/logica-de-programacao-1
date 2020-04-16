
public class Data {
    //atributos
    private byte dia;
    private byte mes;
    private int ano;
    
    //construtor
    public Data(){
        
    }
    
    //private
    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //toString
    @Override
    public String toString() {
        return +dia+ "/" + mes + "/" + ano;
    }
}
