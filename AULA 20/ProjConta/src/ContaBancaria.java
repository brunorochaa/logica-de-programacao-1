
public class ContaBancaria {
    //atributos
    public int numeroConta;
    public double limite;
    public double saldo;
    
    //toString
    @Override
    public String toString() {
        return "\nNumero da Conta: " +numeroConta+
               "\nLimite: " +limite+
               "\nSaldo: " +saldo;
    }
    //calculo
    public double verSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        this.saldo-= valor;
    }
    
    public void depositar(double valor){
        this.saldo+= valor;
    }
   
}
