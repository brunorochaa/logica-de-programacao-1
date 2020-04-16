
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Fornecedor {
    //atributo
    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    private Endereco endereco;
    
    //construtor
    public Fornecedor(){
        this.endereco= new Endereco();
    }
    
    //private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " +nome
                +"\nCNPJ: "+cnpj
                +"\nTelefone: " +telefone
                +"\nE-mail: " +email 
                +"\nEndereço: " +endereco;
    }
    
    //validarEmail
    public boolean validarErro(String e){
        boolean isEmailIdValid = true;
        if (e != null && e.length() > 0) {
            String expression= "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern= Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher= pattern.matcher(e);
            if (matcher.matches()){
                isEmailIdValid = false;
            }
        }
        return isEmailIdValid;
    }
}
