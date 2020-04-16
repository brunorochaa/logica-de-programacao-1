
public class Calculo {

    
    //variaveis leitura
     private String nome;
     private String cpf;
     private String cargo;
     private double valorHora;
     private double quantidadeHoras;
     private double valorPassagem;
     private double valorRefeicao;
     private double horasExtras50;
     private double horasExtras100;
     private byte dependentes;
     private byte tipoInsalubridade;
     
     //toString
    @Override
    public String toString() {
        return "\nFuncionário: " +nome+ 
               "\nCPF: " +cpf+ 
               "\nCargo: " +cargo+ 
               "\nValor Hora: R$ " +valorHora+ 
               "\nQuantidade Horas: " +quantidadeHoras+ 
               "\nValor Passagem: R$ " +valorPassagem+ 
               "\nValor Refeição: R$ " +valorRefeicao + 
               "\nHoras Extras Semanais: R$ " +horasExtras50+ 
               "\nHoras Extras Finais de Seamana: R$ " +horasExtras100+ 
               "\nDependentes: " +dependentes+ 
               "\nTipo Insalubridade: " +tipoInsalubridade;
    }

    
     //privateNome
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //privateCPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //privateCargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //valorHora
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    //privateQuantidadeHoras
    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    
    //privateValorPassagem
    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    
    //privateValorRefeicao
    public double getValorRefeicao() {
        return valorRefeicao;
    }

    public void setValorRefeicao(double valorRefeicao) {
        this.valorRefeicao = valorRefeicao;
    }

    //privateHoras50
    public double getHorasExtras50() {
        return horasExtras50;
    }

    public void setHorasExtras50(double horasExtras50) {
        this.horasExtras50 = horasExtras50;
    }

    //privateHoras100
    public double getHorasExtras100() {
        return horasExtras100;
    }

    public void setHorasExtras100(double horasExtras100) {
        this.horasExtras100 = horasExtras100;
    }
    
    //privateDependentes
    public byte getDependentes() {
        return dependentes;
    }

    public void setDependentes(byte dependentes) {
        this.dependentes = dependentes;
    }

    //privateTipoInsalubridade
    public byte getTipoInsalubridade() {
        return tipoInsalubridade;
    }

    public void setTipoInsalubridade(byte tipoInsalubridade) {
        this.tipoInsalubridade = tipoInsalubridade;
    }
    
    
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
