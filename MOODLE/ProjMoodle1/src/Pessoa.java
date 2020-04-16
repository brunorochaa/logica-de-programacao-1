
public class Pessoa {
    private String nome;
    private int idade;
    
    //private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nSeu nome é "+nome 
                +"\nVocê tem "+idade+" anos";
    }
  
}
