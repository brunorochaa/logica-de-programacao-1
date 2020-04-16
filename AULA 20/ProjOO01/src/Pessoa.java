
public class Pessoa {
    //atributos
    public String nome;
    public int anoNascimento;
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome+
               "\nAno Nascimento: " +anoNascimento;
    }
    
    //calculo
    public int calcularIdade(int anoAtual){
        return anoAtual-this.anoNascimento;
    }
    
}

