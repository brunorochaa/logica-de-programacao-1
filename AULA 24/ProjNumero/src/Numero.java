
public class Numero {
    //atributo
    private int numero;

    //toString
    @Override
    public String toString() {
        return "Número: " +numero;
    }

    //private
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

     //calculo
    public int calcularTabuada(int cont){
        return this.numero*cont;
    }
    
    public int calcularFatorial(){
        int acum= 1;
        for(int cont=1;cont<=this.numero;cont++){
            acum*= cont;
        }
        return acum;
    }
    
    public int calcularSomatorio(){
        int acum= 0;
        for(int cont=1;cont<=this.numero;cont++){
            acum+= cont;
        }
        return acum;
    }
    
    public int calcularSomatorioPar(){
        int acum= 0;
        for(int cont=1;cont<=this.numero;cont++){
            if(cont%2==0){
                acum+= cont;
            }
        }
        return acum;
    }
    
    public int calcularSomatorioImpar(){
        int acum= 0;
        for(int cont=1;cont<=this.numero;cont++){
            if(cont%2!=0){
                acum+= cont;
            }
        }
        return acum;
    }
    
    public int calcularContarPar(){
        int contPar= 0;
        for(int cont=1;cont<=this.numero;cont++){
            if(cont%2==0){
                contPar++;
            }
        }
        return contPar;
    }
    
    public int calcularContarImpar(){
        int contImpar= 0;
        for(int cont=1;cont<=this.numero;cont++){
            if(cont%2!=0){
                contImpar++;
            }
        }
        return contImpar;
    }
    
    public String calcularPerfeito(){
        int acum= 0;
        for(int cont=1;cont<this.numero;cont++){
            if(this.numero%cont==0){
                acum+= cont;
            }
        }
        if(acum== this.numero){
            return "É perfeito";
        }else{
            return "Não é perfeito";
        }
    }
}
