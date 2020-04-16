
public class Aluno {
    //atributos
    private int ra;
    private String nome;
    private String cpf;
    private String filial;
    
    //construtor
    public Aluno(int ra, String nome, String cpf){
        this.ra= ra;
        this.nome= nome;
        this.cpf= cpf;
        this.filial= "FL02";
    }
    
    //toString
    @Override
    public String toString() {
        return "\nRA: " +ra
                +"\nNome: " +nome
                +"\nCPF : " +cpf 
                +"\nFilial: " +filial;
    }
    
    //private
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

}
