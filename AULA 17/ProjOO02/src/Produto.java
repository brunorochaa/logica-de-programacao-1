
public class Produto {
    //variaveis
    public String nome;
    public int quantidade;
    public double valor;
    
    //calculo
    public double calcularTotal(){
        return this.quantidade*this.valor;
    }
    public double calcularDesconto() {
        return calcularTotal()*0.95;
    }
}
