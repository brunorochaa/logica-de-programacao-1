
public class Tabuada {
    //atributo
    private int numero;

    //toString
        @Override
        public String toString() {
            return "Número: " +numero;
        }

    //private
        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

     //calculo
    public int calcularTabuada(int cont){
        return this.numero*cont;
    }
    }