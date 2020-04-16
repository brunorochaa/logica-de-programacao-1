
public class Funcionario {
    private String nome;
    private double valorHora;
    private double quantidadeHoras;
    private byte dependentes;
    
    //private
    public String getNome() {   
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public byte getDependentes() {
        return dependentes;
    }

    public void setDependentes(byte dependentes) {    
        this.dependentes = dependentes;
    }

    //toString
    @Override
    public String toString() {
        return "\nNome: "+nome
                +"\nValor Hora: "+valorHora 
                +"\nQuantidade Horas: "+quantidadeHoras
                +"\nQuantidade Dependentes: " +dependentes;
    }
    
    //calculo
    public double calcularSalarioBruto(){
        return this.valorHora*this.quantidadeHoras;
    }
    
    public double calcularInss(){
        return calcularSalarioBruto()*0.11;
    }
    
    public double calcularSalarioFamilia(){
        if(this.dependentes>0){
            return 22.00*this.dependentes;
        }else{
            return 0;
    }
    }
    
    public double calcularSalarioLiquido(){
        return calcularSalarioBruto()+calcularSalarioFamilia()-calcularInss();
    }
    
}
