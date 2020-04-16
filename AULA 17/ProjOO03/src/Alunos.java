
public class Alunos {
    public String nome;
    public double nota1;
    public double nota2;
    String resposta;
    
    public double calcularMedia(){
        return (this.nota1+this.nota2)/2;
    }
    public String retornarResposta(){
       if(calcularMedia()>=6){
           resposta= "Aprovado";
       }else{
           resposta= "Reprovado";
       } 
       return resposta;
    }
           
}
