
public class JanKenPon {
    //atributos
    private byte jogada;
    
    //construtor
    public JanKenPon(byte jogada){
        this.jogada=jogada;
    }
    
    //toString
    @Override
    public String toString() {
        switch(this.jogada){
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            default:
                return "Tesoura";
        }
    }    

    //private
    public byte getJogada() {
        return jogada;
    }

    public void setJogada(byte jogada) {
        this.jogada = jogada;
    }
  
}
