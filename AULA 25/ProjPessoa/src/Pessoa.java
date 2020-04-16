
public class Pessoa {
    //atributos
    private String nome;
    private String rg;
    private Data dataNascimento;
    private Endereco endereco;
    
    //metodo
    public Pessoa(){
        this.dataNascimento= new Data();
        this.endereco= new Endereco();
        
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome
                +"\nRG: " +rg 
                +"\nData de Nascimento: " +dataNascimento 
                +"\nEndereço: " +endereco;
    }
    
    //private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
