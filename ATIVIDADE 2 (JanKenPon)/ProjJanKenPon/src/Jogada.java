
public class Jogada {
    private JanKenPon usuario;
    private JanKenPon maquina;
    
    //construtor
    public Jogada(byte jogadaUsuario){
        this.usuario= new JanKenPon(jogadaUsuario);
        byte sorteio= (byte)(Math.random()*3+1);
        this.maquina= new JanKenPon(sorteio);
    }
    
    //toString
    @Override
    public String toString() {
        return "\nJogada: "
              +"\nUsuário: " +usuario
              +"\nMaquina: " + maquina;
    }
    
    //private
    public JanKenPon getUsuario() {
        return usuario;
    }

    public JanKenPon getMaquina() {
        return maquina;
    }
    
    //calculo
    /**public String verificarSeGanhou(){
        byte usu= this.usuario.getJogada();
        byte maq= this.maquina.getJogada();
        //empate
        if(usu== 1 && maq== 1){
            return "Empate, ambos escolheram Pedra.";
        }else if(usu== 2 && maq== 2){
            return "Empate, ambos escolheram Papel.";
        }else if(usu== 3 && maq== 3){
            return "Empate, ambos escolheram Tesoura.";
        //usuário
        }else if(usu== 1 && maq== 3){
           return "Usuário Vence da Máquina, pois pedra quebra tesoura.";
        }else if(usu== 2 && maq== 1){
            return "Usuário Vence da Máquina, pois Papel enrola Pedra.";
        }else if(usu== 3 && maq== 2){
            return "Usuário Vence da Máquina, pois tesoura corta papel.";
        //máquina
        }else if(maq== 1 && usu== 3){
           return "Máquina Vence do Usuário, pois pedra quebra tesoura.";
        }else if(maq== 2 && usu== 1){
            return "Máquina Vence do Usuário, pois Papel enrola Pedra.";
        }else{
           return "Máquina Vence do Usuário, pois tesoura corta papel.";
       }
        
    }*/
    
    public String verificarSeGanhouUsu(){
        byte usu= this.usuario.getJogada();
        byte maq= this.maquina.getJogada();
        //empate
        if(usu== 1 && maq== 1){
            return "você empatou, ambos escolheram Pedra.";
        }else if(usu== 2 && maq== 2){
            return "você empatou, ambos escolheram Papel.";
        }else if(usu== 3 && maq== 3){
            return "você empatou, ambos escolheram Tesoura.";
        //usuário
        }else if(usu== 1 && maq== 3){
           return "você ganhou da máquina, pois pedra quebra tesoura.";
        }else if(usu== 2 && maq== 1){
            return "você ganhou da máquina, pois Papel enrola Pedra.";
        }else if(usu== 3 && maq== 2){
            return "você ganhou da máquina, pois tesoura corta papel.";
        //máquina
        }else if(maq== 1 && usu== 3){
           return "você perdeu para máquina, pois pedra quebra tesoura.";
        }else if(maq== 2 && usu== 1){
            return "você perdeu para máquina, pois Papel enrola Pedra.";
        }else{
           return "você perdeu para máquina, pois tesoura corta papel.";
       }
        
    }
    
}
