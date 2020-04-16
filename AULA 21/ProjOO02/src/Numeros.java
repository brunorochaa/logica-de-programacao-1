
public class Numeros {
    //atributo
    public double numero1;
    public double numero2;
    
    //toString

    @Override
    public String toString() {
        return "\nNúmero 1: " +numero1
             + "\nNúmero 2: " +numero2;  
    }
    
    //calculo
    public double somar(){//1
        return this.numero1+this.numero2;
    }
    
    public double multiplicar(){//2
        return this.numero1*this.numero2;
    }
    
    public String umpar(){//3
        if(this.numero1%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    
    public String doispar(){//4
        if(this.numero2%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    
    public double raiz(){//5
        return Math.sqrt(this.numero1);
    }
    
    public String pnn(){//6
        if(this.numero2>0){
            return "Positivo";
        }else if(this.numero2<0){
            return "Negativo";
        }else{
            return "Nulo";
        }
    }
    
    public double divisao(){//7
        return this.numero1/this.numero2;
    }
    
    public double somardois(double numero3){//8
        return this.numero2+numero3;
    }

}
