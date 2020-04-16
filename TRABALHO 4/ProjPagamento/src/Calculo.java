
public class Calculo {
    //variaveis leitura
     public String nome;
     public String cpf;
     public String cargo;
     public double valorHora;
     public double quantidadeHoras;
     public double valorPassagem;
     public double valorRefeicao;
     public double horasExtras50;
     public double horasExtras100;
     public byte dependentes;
     public byte tipoInsalubridade;
     
    
    //calculo
     public double calcularSalarioBruto(){
         return this.valorHora*this.quantidadeHoras;
     }
     
     //valeTransporte
     public double calcularValeTransporte(){
         if((calcularSalarioBruto()*0.06)>this.valorPassagem){
             return this.valorPassagem;
        }else{
             return calcularSalarioBruto()*0.06;
     }
     }
         
    //salarioFamilia
     public double calcularSalarioFamilia(){
         if(calcularSalarioBruto()<=907.77){
            return 46.54*this.dependentes;
         }else if(calcularSalarioBruto()>907.77 && calcularSalarioBruto()<=1364.43){
            return 32.80*this.dependentes;
         }else{
            return 0;
     }
     }
     
      //insalubridade
     public double calcularInsalubridade(){
         switch (this.tipoInsalubridade) {
             case 1:
                return 0;
            case 2:
                return 980*0.1;
            case 3:
                return 980*0.2;
            default:
                return 980*0.4;
     }
     }
     
     //inss
     public double calcularInss(){
     if(calcularSalarioBruto()<=1751.81){
        return calcularSalarioBruto()*0.08;
     }else if(calcularSalarioBruto()>=1751.82 && calcularSalarioBruto()<=2919.72){
        return calcularSalarioBruto()*0.09;
     }else if(calcularSalarioBruto()>=2919.73 && calcularSalarioBruto()<=5839.45){
        return calcularSalarioBruto()*0.11;
     }else{
        return calcularSalarioBruto()*0.27;
     }
     }
     
     //valeRefeicao:
     public double calcularValeRefeicao(){
         return (valorRefeicao*25)*0.2;
     }
    //salarioExtra50:
     public double calcularValorExtra50(){
         return (valorHora * 1.5) * horasExtras50;
     }
    //salarioExtra100:
     public double calcularValorExtra100(){
         return (valorHora * 2) * horasExtras100;
     }  
     //salarioLíquido
     public double calcularSalarioLiquido(){
         return calcularSalarioBruto()+calcularSalarioFamilia()+calcularInsalubridade()
                 -calcularValeTransporte()-calcularInss()- calcularValeRefeicao()
                 + calcularValorExtra50() + calcularValorExtra100();
     }
   
}
