
import java.util.Arrays;
public class Aluno {
    //atributos
    private double[] medias;
    
    //metodo
    public Aluno(){
        this.medias= new double[5];
    }
    
    //private
    public double[] getMedias() {
        return medias;
    }

    public void setMedias(double[] medias) {
        this.medias= medias;
    }
    
    //toString
    @Override
    public String toString() {
        return "Médias: " +Arrays.toString(medias);
    }
    
    //cadastro
    public void cadastrar(int indice, double media){
        this.medias[indice]= media;
    }
    
    //ver primeira
    public double verPrimeira(){
        return this.medias[0];
    }
    
    //ver ultima
    public double verUltima(){
        return this.medias[this.medias.length-1];
    }
    
    //media
    public double calcularMedia(){
    double acum= 0;
    for(int i=0; i<this.medias.length;i++){
        acum+= this.medias[i];
    }
    return acum/this.medias.length;
  }
    
    //maior
    public double verMaior(){
        double maior=this.medias[0];
        for(int i=0; i<this.medias.length; i++){
            if(medias[i]>maior){
                maior= this.medias[i];
            }
        }
        return maior;
    }
    
    //menor
    public double verMenor(){
        double menor=this.medias[0];
        for(int i=0; i<this.medias.length; i++){
            if(medias[i]<menor){
                menor= this.medias[i];
            }
        }
        return menor;
    }
}
