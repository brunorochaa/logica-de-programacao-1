
public class Filme {
    //atributo
    private int codigo;
    private String titulo;
    private Data data;
    private Genero genero;
    private Classificacao classificacao;
    private Fornecedor fornecedor;
    
    //construtor
    public Filme(){
        this.data= new Data();
        this.genero= new Genero();
        this.classificacao= new Classificacao();
        this.fornecedor= new Fornecedor();
    }
    
    //private
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
   
    //toString

    @Override
    public String toString() {
        return "\n\\------------------------------/"
                + "\nCódigo: " +codigo 
                + "\nTítulo: " +titulo
                + ""+genero
                + "\n"+classificacao
                + "\nData de Lançamento: " +data
                + "\nFornecedor: " +fornecedor;
    }
    
    }
