
public class Classificacao {
    //atributo
    private byte classificacao;
    
    //construtor
    public Classificacao(){
        
    }
    
    //private
    public byte getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(byte classificacao) {
        this.classificacao = classificacao;
    }
    
    //toString
    @Override
    public String toString() {
        return "Classificacao: " +escolherClassificacao();
    }
    
    //metodo
    public String escolherClassificacao(){
    String resposta;
        switch (classificacao) {
            case 1:
                resposta= "L (verde) – Livre para todos os públicos.";
                break;
            case 2:
                resposta= "10(azul)– Não recomendado para menores de 10 anos.";
                break;
            case 3:
                resposta= "12(amarelo)– Não recomendado para menores de 12 anos.";
                break;
            case 4:
                resposta= "14(laranja) – Não recomendado para menores de 14 anos.";
                break;
            case 5:
                resposta= "16 (vermelho) – Não recomendado para menores de 16 anos. Por "
                        + "poder conter nudez parcial ou violência.";
                break;
            default:
                resposta= "18(preto) – Não recomendado para menores de 18 anos. Contém "
                        + "conteúdo explícito apropriado somente para adultos.";
                break;
        }
        return resposta;
    }
    
}
