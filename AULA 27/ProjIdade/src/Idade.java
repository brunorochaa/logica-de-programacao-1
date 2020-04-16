
import java.util.Arrays;
public class Idade {
    //atributo
    private int[] idade;
    
    //metodo
    public Idade(){
        this.idade= new int[20];
    } 
    
    //private
     public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }
    
    //toString
    @Override
    public String toString() {
        return "Médias: " +Arrays.toString(idade);
    }
    
    //cadastro
    public void cadastrar(int indice, int idade){
        this.idade[indice]= idade;
    }
    
    //media
    public double calcularMedia(){
    double acum= 0;
    for(int i=0; i<this.idade.length; i++){
        acum+= this.idade[i];
    }
    return acum/this.idade.length;
    }
    
    //maior
    public int acharMaior(){
        int maior = this.idade[0];
        for(int i=0; i<this.idade.length; i++){
            if(this.idade[i]>maior){
                maior= this.idade[i];
            }
        }
        return maior;
    }
    
    //maior
    public int acharMenor(){
        int menor = this.idade[0];
        for(int i=0; i>this.idade.length; i++){
            if(this.idade[i]>menor){
                menor= this.idade[i];
            }
        }
        return menor;
    }
    
    //ordem
    public void ordenar(){
        Arrays.sort(this.idade);
    }
  
    //menor de idade
    public int contarMenor(){
        int cont= 0;

        for(int i=0; i<this.idade.length; i++){
            if(this.idade[i]<18){
                cont++;
            }
        }
        return cont;
    }
    
    //maior de idade
    public int contarMaior(){
        int cont= 0;

        for(int i=0; i<this.idade.length; i++){
            if(this.idade[i]>18){
                cont++;
            }
        }
        return cont;
    }
    
}
