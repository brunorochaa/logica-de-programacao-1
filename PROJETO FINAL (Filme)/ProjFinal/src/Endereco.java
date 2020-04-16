
public class Endereco {
    //atributos
    private String estado;
    private String cidade;
    private String complemento;
    private String rua;
    private String numero;
    
    //construtor
    public Endereco(){
        this.estado= "RS";
    }
    
    //private
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    //toString
    @Override
    public String toString() {
        return "Rua: "+rua+ ", Número: " +numero+ ", Complemento: " +complemento
                + ", \n" +cidade+ "/" +estado;
    }
}
