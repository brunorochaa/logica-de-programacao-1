
public class Xerox {
    //variaveis
    public byte tipoCliente;
    public int quantidadeCopias;
    
    //calculo
    public double calcularTotal(){
        switch (tipoCliente) {
            case 1:
                return this.quantidadeCopias*0.15;
            case 2:
                return this.quantidadeCopias*0.07;
            case 3:
                return this.quantidadeCopias*0.00;
            default:
                return this.quantidadeCopias*0.20;
        }
    }
    public String cliente(){
        switch (tipoCliente) {
            case 1:
                return "Aluno";
            case 2:
                return "Professor";
            case 3:
                return "Diretor";
            default:
                return "Não aluno";
        }
    }
    public String verDados(){
        return "\nCópias: "+this.quantidadeCopias+
               "\nTipo de Cliente: "+cliente();
        
    }
    
}
