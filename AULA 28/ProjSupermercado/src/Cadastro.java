
import java.util.ArrayList;

public class Cadastro {
    //atributo
    private ArrayList <Produto> lista;
    
    //construtor
    public Cadastro(){
        this.lista= new ArrayList<>();
    }
    
    //private
    public ArrayList<Produto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nProdutos Cadastrados: " +lista;
    }
    
    //CRUD - CREATE, READ, UPDATE & DELETE
    
    //create
    public void cadastrar(Produto p){
        this.lista.add(p);
    }
    
    //delete
    public void remover(Produto p){
        this.lista.remove(p);
    }
    
    //verificar quantidade cadastros
    public int verQuantidade(){
        return this.lista.size();
    }

    //pesquisarCodigo
    public Produto pesquisarPorCodigo(int codigo){
        Produto achei= null;
        for(int i=0; i<this.lista.size() && achei== null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei= this.lista.get(i);
            }
        }
       return achei; 
    }
    
    //pesquisarFornecedor
    public Fornecedor pesquisarPorFornecedor(int codigo){
        Fornecedor achei= null;
        for(int i=0; i<this.lista.size() && achei== null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei= this.lista.get(i).getFornecedor();
            }
        }
       return achei; 
    }
    
    //pesquisarTelefone
    public String pesquisarTelefoneFornecedor(String cnpj){
        String achei= null;
        for(int i=0; i<this.lista.size() && achei== null; i++){
            if(this.lista.get(i).getFornecedor().getCnpj().equals(cnpj)){
                achei= this.lista.get(i).getFornecedor().getTelefone();
            }
        }
       return achei; 
    }
    
    //pequisar indice por codigo
    public int pesquisarIndice(int codigo){
        int achei= -1;
        for(int i=0; i<this.lista.size() && achei==-1; i++){
        if(this.lista.get(i).getCodigo()==codigo){
            achei= i;
        }
    }
        return achei;
    }
    
    //pesquisarPorFornecedor
    public ArrayList<Produto>pequisarFornecedor(String cnpj){
        ArrayList<Produto>achados= new ArrayList<>();
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getFornecedor().getCnpj().equals(cnpj)){
                achados.add(this.lista.get(i));
            }
        }
        return achados;
    }
    
    //pesquisarPorValor
    public ArrayList<Produto>pequisarPorValor(double valor){
        ArrayList<Produto>achados= new ArrayList<>();
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getValor()<=valor){
                achados.add(this.lista.get(i));
            }
        }
        return achados;
    }
}
