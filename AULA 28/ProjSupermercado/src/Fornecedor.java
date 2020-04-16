
public class Fornecedor {
    //atributos
    private String nome;
    private String cnpj;
    private String telefone;
    private Endereco endereco;
    
    //construtor
    public Fornecedor(){
        this.endereco= new Endereco();
    }
    
    //private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome
                +"\nCNPJ: " +cnpj
                +"\nTelefone: " +telefone
                +"\nEndereço: " +endereco;
    }
}
