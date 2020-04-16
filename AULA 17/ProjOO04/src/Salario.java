
public class Salario {
    //variaveis
    public String nome;
    public String cargo;
    public double salarioHora;
    public int quantidadeHora;
    
    //calculo
    public double calcularSalarioBruto(){
        return this.salarioHora*this.quantidadeHora;
    }
    public double calcularSalarioAumento(){
        return this.calcularSalarioBruto()*1.12;
    }
    
}
