
import java.util.ArrayList;

public class Cadastro {
    //atributo
    private ArrayList <Filme> lista;
    
    //construtor
    public Cadastro(){
        this.lista= new ArrayList<>();
    }
    
    //private
    public ArrayList<Filme> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Filme> lista) {
        this.lista = lista;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nFilmes Cadastrados: " +lista;
    }
    
    //CRUD - CREATE, READ, UPDATE & DELETE
    
    //create
    public void cadastrar(Filme f){
        this.lista.add(f);
    }
    
    //delete
    public void remover(Filme f){
        this.lista.remove(f);
    }
    
    //verificar quantidade cadastros
    public int verQuantidade(){
        return this.lista.size();
    }
    
    //pesquisarCodigo
    public Filme pesquisarPorCodigo(int codigo){
        Filme achei= null;
        for(int i=0; i<this.lista.size() && achei== null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei= this.lista.get(i);
            }
        }
       return achei; 
    }
    
    //pequisarIndice
    public int pesquisarIndice(int codigo){
        int achei= -1;
        for(int i=0; i<this.lista.size() && achei==-1; i++){
        if(this.lista.get(i).getCodigo()==codigo){
            achei= i;
        }
    }
        return achei;
    }
    
    //pesquisarGenero
    public ArrayList<Filme>pequisarGenero(byte genero){
        ArrayList<Filme>achei= new ArrayList<>();
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getGenero().getGenero()==genero){
                achei.add(this.lista.get(i));
            }
        }
        return achei;
    }
    
    //pesquisarClassificacao
    public ArrayList<Filme>pequisarClassificacao(byte classificacao){
        ArrayList<Filme>achei= new ArrayList<>();
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getClassificacao().getClassificacao()==classificacao){
                achei.add(this.lista.get(i));
            }
        }
        return achei;
    }
    
    //pesquisarPorTitulo
    public Filme pesquisarTitulo(String titulo){
        Filme achei= null;
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getTitulo().equalsIgnoreCase(titulo)){
                achei= this.lista.get(i);
            }
        }
        return achei;
    }
    
    //pesquisarPorFornecedor
    public ArrayList<Filme>pequisarFornecedor(String nome){
        ArrayList<Filme>achei= new ArrayList<>();
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getFornecedor().getNome().equalsIgnoreCase(nome)){
                achei.add(this.lista.get(i));
            }
        }
        return achei;
    }
    
    //pesquisarEstreia
    public ArrayList<Filme>pesquisarPorEstreia(byte mes, int ano){
        ArrayList<Filme>achei= new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getData().getMes()==mes && this.lista.get(i).getData().getAno()==ano);
                achei.add(this.lista.get(i));
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
    
}
