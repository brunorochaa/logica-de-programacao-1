
public class Jogada {
    //atributos
    private Dado usuario;
    private Dado maquina;
    
    //metodo
    public Jogada(byte jogadaUsuario){
        this.usuario= new Dado(jogadaUsuario);
        byte sorteio= (byte)(Math.random()*6+1); //2;(burlar)
        //if(jogadaUsuario==sorteio){
            //sorteio=(byte)(Math.random()*6+1);
        //}
        this.maquina= new Dado(sorteio);
    }
    
    //toString
    @Override    
    public String toString() {
        return "Jogada: " 
              +"\nUsuário: " +usuario
              +"\nMaquína: " +maquina;
    }

    //private
    public Dado getUsuario() {
        return usuario;
    }

    public Dado getMaquina() {
        return maquina;
    }
    
    //calculo
    public boolean verificarSeGanhou(){
        byte usu= this.usuario.getNumero();
        byte maq= this.maquina.getNumero();
        if(usu==maq){
            return true;
        }else{
            return false;
        }
    }
   
}
