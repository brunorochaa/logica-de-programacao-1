
public class Vendedor {
    //variaveis
    public String nome;
    public double vendasMarco;
    public double vendasAbril;
    
    //calcular
    public double calcularMedia(){
        return (this.vendasMarco+this.vendasAbril)/2;
        
    }
    public String classificar(){ 
    double md= calcularMedia();
        if(md<= 1000){
            return "Vendedor desmotivado";
        }else if(md>1000 && md<=5000){
            return "Vendedor padrão";
        }else if(md>5000 && md<=10000){
            return "Vendedor bom";
        }else{
            return "Ótimo vendedor";
        }
    }
    public String verDados(){
        return "\nVendas Março: "+this.vendasMarco+
               "\nVendas Abril: "+this.vendasAbril;
    }
}
