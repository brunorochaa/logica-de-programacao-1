
public class Salario {
    //variaveis
    public String nome;
    public double salario;
    
    //calculo
    public double calcularSalario(){
        if(salario<= 500){
            return 1.30*salario;
        }else{
            return salario;  
        }
    }
    public String verDados(){
        return "\nFuncionário : "+this.nome+
               "\nSalário: R$ "+calcularSalario();
    }
    
}
