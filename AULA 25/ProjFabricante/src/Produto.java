
public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private String fabricante;
    
    //construtor
    public Produto(String nome, int quantidade, double valor){
        this.nome= nome;
        this.quantidade= quantidade;
        this.valor= valor;
        this.fabricante= "Bah Tchê";
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome 
                +"\nQuantidade: "+ quantidade 
                +"\nValor: "+valor 
                +"\nFabricante: "+fabricante;
    }
    
    //private

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
