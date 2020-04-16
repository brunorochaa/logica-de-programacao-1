
public class Produto {
    //variaveis
    public String nome;
    public int quantidade;
    public double valor;
    
    //calcular
    public double calcularTotal(){
        return this.quantidade*this.valor;
    }
    public double calcularComDesconto(){
    double total= calcularTotal();
        if(total<=100){
            return total*0.92;
        }else if(total>=100 && total<=200){
            return total*0.97;
        }else{
            return total*0.95;
        }
    }
    public String verDados(){
        return "\nNome: "+this.nome+
               "\nQuantidade: "+this.quantidade+
               "\nValor: R$ "+this.valor;
    }
}