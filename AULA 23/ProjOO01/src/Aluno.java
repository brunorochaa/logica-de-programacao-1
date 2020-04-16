
public class Aluno {
    //atributo
    private String nome;
    private double nota1;
    private double nota2;
    private int faltas;
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome
                +"\nNota 1: " +nota1
                +"\nNota 2: " +nota2
                +"\nFaltas: " +faltas;
    }
    
    //private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    //calculo
    public double calcularMedia(){
        return (this.nota1+this.nota2)/2;
    }
    
    public double calcularFrequencia(int numeroAulas){
        return ((numeroAulas-this.faltas)*100)/numeroAulas;
    }
    
    public String calcularAprovado(int numeroAulas){
        if(calcularMedia()>=6 && calcularFrequencia(numeroAulas)>=75){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
