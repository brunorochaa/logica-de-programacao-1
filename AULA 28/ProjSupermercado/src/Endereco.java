
public class Endereco {
    //atributos
    private String cidade;
    private String estado;
    
    //construtor
    public Endereco(){
        
    }
    
    //private
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //toString
    @Override
    public String toString() {
        return cidade+ "-" +estado;
    }
}
