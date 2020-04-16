
public class Funcionario {
    //atributos
    public String nome;
    public String cargo;
    public double salario;
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome+ 
               "\nCargo: " +cargo+ 
               "\nSalario: " +salario;
    }
    
    //calculo
    public double calcularQuantos(double salarioMinimo){
        return this.salario/salarioMinimo;
    }
}
