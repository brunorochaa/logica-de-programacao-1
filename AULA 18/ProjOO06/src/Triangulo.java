
public class Triangulo {
    //variaveis
    public int x;
    public int y;
    public int z;
    
    //calculo
    public String validarTriangulo(){
        if (this.x<(this.y+this.z) || this.y<(this.x+this.z) || this.z<(this.x+this.y)) {
            return "Trata-se de um Triângulo";
        }else{
            return "Não é um Triângulo";
        }
    }
    
    public String tipoTriangulo(){
        if(this.x == this.y && this.x == this.z) {
            return "Três lados iguais. Equilátero";
        }else if(this.x == this.y || this.x == this.z){
            return "Dois lados iguais. Isósceles ";
        }else{
            return "Três lados diferentes.  Escaleno";
        }
    }
    
    public String verDados(){
        return "\nValor X: "+this.x+
               "\nValor Y: "+this.y+
               "\nValor Z: "+this.z+
               "\nResultado: "+validarTriangulo()+
               "\nTipo de Triângulo: "+tipoTriangulo();
    }
}