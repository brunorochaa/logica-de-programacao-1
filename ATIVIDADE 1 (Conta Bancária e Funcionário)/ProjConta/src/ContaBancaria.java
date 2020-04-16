
public class ContaBancaria {
    //atributos
    private int numeroConta;
    private double limite;
    private double saldo;
    
    //private
    public int getNumeroConta() {    
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {    
        this.saldo = saldo;
    }

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
    public double diminuirLimite(double valorSaque){
        return this.limite -= this.saldo;
    }
   
}
