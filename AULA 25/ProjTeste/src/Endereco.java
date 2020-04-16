
public class Endereco {
    //atributos
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private int cep;
    
    //metodo
    public Endereco(){
        
    }
    
    //toString
    @Override
    public String toString() {
        return "Estado: "+estado+ ", Cidade: " +cidade+ ", Bairro: " +bairro
                + ", Rua: " +rua+ ", Número: " +numero+ ", CEP: " +cep;
    }
    
    //private

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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    
}
