 
public class Genero {
    //atributo;
    private byte genero;
    
    //construtor
    public Genero(){
        
    }
    
    //private
    public byte getGenero() {
        return genero;
    }

    public void setGenero(byte genero) {
        this.genero = genero;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nGenêro: " +escolherGenero();
    }
    
    //metodo
    public String escolherGenero(){
    String resposta;
        switch (genero) {
            case 1:
                resposta= "Ação.";
                break;
            case 2:
                resposta= "Animação.";
                break;
            case 3:
                resposta= "Aventura.";
                break;
            case 4:
                resposta= "Cinema de Arte.";
                break;
            case 5:
                resposta="Chanchada.";
                break;
            case 6:
                resposta= "Cinema Catástrofe.";
                break;
            case 7:
                resposta= "Comédia.";
                break;
            case 8:
                resposta= "Comédia Romântica.";
                break;
            case 9:
                resposta= "Comédia Dramática.";
                break;
            case 10:
                resposta= "Comédia de Ação.";
                break;
            case 11:
                resposta= "Dança.";
                break;
            case 12:
                resposta= "Documentário.";
                break;
            case 13:
                resposta= "Docuficção.";
                break;
            case 14:
                resposta= "Drama.";
                break;
            case 15:
                resposta= "Espionagem.";
                break;
            case 16:
                resposta= "Faroeste (ou western).";
                break;
            case 17:
                resposta= "Fantasia Científica.";
                break;
            case 18:
                resposta= "Ficção Científica.";
                break;
            case 19:
                resposta= "Filmes de Guerra.";
                break;
            case 20:
                resposta= "Musical.";
                break;
            case 21:
                resposta= "Filme policial.";
                break;
            case 22:
                resposta= "Romance.";
                break;
            case 23:
                resposta= "Seriado.";
                break;
            case 24:
                resposta= "Suspense.";
                break;
            default:
                resposta= "Terror (ou horror)";
                break;
        }
        return resposta;
    }
    
}