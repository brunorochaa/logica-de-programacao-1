
import java.awt.AWTException;
import java.awt.Robot;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *
 * @authors Bruno, Rafael e Thiago
 */
public class Main {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
       
       //instancia
       Cadastro c= new Cadastro();
       
       //menu
        byte menu;
        do{
            menu= Byte.parseByte(JOptionPane.showInputDialog("1. Cadastrar novo filme"
                    +"\n2. Mostrar filmes em cartaz"
                    +"\n3. Ver quantidade de filmes"
                    +"\n4. Remover algum filme"
                    +"\n5. Pesquisar filme por título"
                    +"\n6. Pesquisar filme por gênero"
                    +"\n7. Pesquisar filme por nome do fornecedor"
                    +"\n8. Pesquisar filme por classficação"
                    +"\n9. Pesquisar filmes que estreiam no mês requirido"
                    +"\n10. Pesquisar fornecedor do filme(código)"
                    +"\n11. Editar"
                    +"\n0. Sair"));
         
         switch(menu){
            case 1:
                limparTela();
                JOptionPane.showMessageDialog(null, "CADASTRANDO FILME...");
                //instanciando filme
                Filme f= new Filme();
                //codigo
                int codigo;
                if(c.getLista().isEmpty()){
                    codigo= 1;
                }else{
                    codigo= c.getLista().get(c.getLista().size()-1).getCodigo()+1;
                }
                f.setCodigo(codigo);
                //cadastrando filme
                do{
                    f.setTitulo(JOptionPane.showInputDialog("Digite o título do filme: "));
                    //validando
                    if(f.getTitulo().length()<2){
                        JOptionPane.showMessageDialog(null, "Erro! Digite novamente.");
                    }
                }while(f.getTitulo().length()<2);
                //instanciando gênero
                Genero g= new Genero();
                //cadastrando genero
                do{
                    JOptionPane.showMessageDialog(null,"Gêneros: "
                            +"\n1. Ação" 
                            +"\n2. Animação" 
                            +"\n3. Aventura"
                            +"\n4. Cinema de Arte"
                            +"\n5. Chanchada"
                            +"\n6. Cinema catástrofe" 
                            +"\n7. Comédia" 
                            +"\n8. Comédia romântica"
                            +"\n9. Comédia dramática"
                            +"\n10. Comédia de ação"
                            +"\n11. Dança" 
                            +"\n12. Documentário" 
                            +"\n13. Docuficção"
                            +"\n14. Drama"
                            +"\n15. Espionagem"
                            +"\n16. Faroeste (ou western)" 
                            +"\n17. Fantasia científica" 
                            +"\n18. Ficção científica"
                            +"\n19. Filmes de guerra"
                            +"\n20. Musical"
                            +"\n21. Filme policial" 
                            +"\n22. Romance" 
                            +"\n23. Seriado"
                            +"\n24. Suspense"
                            +"\n25. Terror (ou horror)");
                            g.setGenero(Byte.parseByte(JOptionPane.showInputDialog(null, "Escolha o gênero do filme: ")));
                            //validando
                            if(g.getGenero()<1 || g.getGenero()>25){
                                JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                            }
                }while(g.getGenero()<1 || g.getGenero()>25);
                //inserindo genero em filme
                f.setGenero(g);
                //instanciando classificação
                Classificacao c1= new Classificacao();
                //cadastrando genero
                do{
                    JOptionPane.showMessageDialog(null,"Classificações: "
                            +"\n1. L (verde) – Livre para todos os públicos." 
                            +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                            +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                            +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                            +"\n5. 16 (vermelho) – Não recomendado para menores de "
                            + "16 anos. Por poder conter nudez parcial ou violência."
                            +"\n6. 18(preto) – Não recomendado para menores de 18 "
                            + "anos. Contém conteúdo explícito apropriado somente "
                            + "para adultos.");
                        c1.setClassificacao(Byte.parseByte(JOptionPane.showInputDialog(null, "Escolha a classificação do filme: ")));
                        //validando
                        if(c1.getClassificacao()<1 || c1.getClassificacao()>6){
                           JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(c1.getClassificacao()<1 || c1.getClassificacao()>6);
                //inserindo classificação em filme
                f.setClassificacao(c1);
                //instanciando data
                Data d= new Data();
                //limpar tela
                limparTela();
                //data
                boolean erroData;
                do{
                    JOptionPane.showMessageDialog(null,"DIGITANDO DATA DE LANÇAMENTO DO FILME...");
                    d.setDia(Byte.parseByte(JOptionPane.showInputDialog(null,"Digite o dia: ")));
                    d.setMes(Byte.parseByte(JOptionPane.showInputDialog(null,"Digite o mês: ")));
                    d.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano: ")));
                    //validando
                    erroData = d.verificarErro();
                    if(erroData){
                        JOptionPane.showMessageDialog(null,"Data inválida");
                    }
                }while(erroData);
                //inserindo data em filme
                f.setData(d);
                //instancia fornecedor
                Fornecedor f1= new Fornecedor();
                //limpar tela
                limparTela();
                //fornecedor
                JOptionPane.showMessageDialog(null,"DIGITANDO DADOS DO FORNECEDOR...");
                do{
                    f1.setNome(JOptionPane.showInputDialog("Digite o nome do fornecedor: "));
                    //validando
                    if(f1.getNome().length()<2){
                        JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                }while(f1.getNome().length()<2);
                
                do{
                    f1.setCnpj(JOptionPane.showInputDialog("Digite o CPNJ do fornecedor: "));
                    //validando
                    if(f1.getCnpj().length()<14){
                        JOptionPane.showMessageDialog(null,"Erro!");
                    }
                }while(f1.getCnpj().length()<14);
                do{
                    f1.setTelefone(JOptionPane.showInputDialog("Digite o telefone do fornecedor: "));
                    //vaidando
                    if(f1.getTelefone().length()<8){
                        JOptionPane.showMessageDialog(null,"Erro!");
                    }
                }while(f1.getTelefone().length()<8);
                //email
                boolean erroEmail;
                String email;
                do{
                    email= (JOptionPane.showInputDialog("Digite o e-mail do fornecedor: "));
                    //validando
                    erroEmail = f1.validarErro(email);
                        if(erroEmail){
                            JOptionPane.showMessageDialog(null,"E-mail inválido");
                        }
                }while(erroEmail);
                //set email
                f1.setEmail(email);
                //instancia endereço
                Endereco e= new Endereco();
                //limpar tela
                limparTela();
                //endereco fornecedor
                JOptionPane.showMessageDialog(null,"DIGITANDO ENDEREÇO DO FORNECEDOR...");
                do{
                    e.setRua(JOptionPane.showInputDialog("Digite a rua do fornecedor: "));
                    //validando
                    if(e.getRua().length()<2){
                        JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                    }
                }while(e.getRua().length()<2);
                
                do{
                    e.setNumero(JOptionPane.showInputDialog("Digite o número do fornecedor: "));
                    //validando
                    if(e.getNumero().length()<1){
                        JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                }while(e.getNumero().length()<1);
                
                e.setComplemento(JOptionPane.showInputDialog("Digite o complemento do fornecedor: "));
                
                do{
                    e.setCidade(JOptionPane.showInputDialog("Digite a cidade do fornecedor: "));
                    //validando
                    if(e.getCidade().length()<2){
                        JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                }while(e.getCidade().length()<2);
                
                do{
                    e.setEstado(JOptionPane.showInputDialog("Digite o estado do fornecedor: "));
                    //validando
                    if(e.getEstado().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                            }
                }while(e.getEstado().length()<2);
                //inserindo endereco em fornecedor
                f1.setEndereco(e);
                 //inserindo fornecedor em filme
                f.setFornecedor(f1);
                //cadastrando filme
                c.cadastrar(f);
                break;
                
            case 2:
                 //limpaTela
                limparTela();
                //cartaz
                JOptionPane.showMessageDialog(null,"MOSTRANDO FILMES EM CARTAZ...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há Filmes em Cartaz.");
                }else{
                   JOptionPane.showMessageDialog(null,c);
                }
                break;
              
            case 3:
                //limpaTela
                limparTela();
                //quantidade
                JOptionPane.showMessageDialog(null,"VISUALIZANDO QUANTIDADE DE FILMES...");
                JOptionPane.showMessageDialog(null,"Quantidade de FILMES: ");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há filme cadastrados");
                }else if(c.verQuantidade()== 1){
                    JOptionPane.showMessageDialog(null,"Existe 1 filme cadastrado");
                }else{
                    JOptionPane.showMessageDialog(null,"Existem "+c.verQuantidade()+" filmes "
                            + "cadastrados.");
                }
                break;
                
            case 4: 
                //limpaTela
                limparTela();
                //removendo
                JOptionPane.showMessageDialog(null,"REMOVENDO FILMES...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não existem filmes cadastrados");
                }else{
                    JOptionPane.showMessageDialog(null,"EXCLUINDO FILME...");
                    do{
                        codigo= (Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do filme á ser removido: ")));
                        if(codigo<=0){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(codigo<=0);
                    Filme encontrado= c.pesquisarPorCodigo(codigo);
                    if(encontrado==null){
                        JOptionPane.showMessageDialog(null,"Não há filme.");
                    }else{
                        byte confirma;
                            confirma= Byte.parseByte(JOptionPane.showInputDialog("Você tem certeza que deseja remover "
                                +encontrado.getTitulo()+"? \n1. Sim"
                                + "\n2.Não"));
                         
                        switch(confirma){
                            case 1:
                                limparTela();
                                c.remover(encontrado);
                                JOptionPane.showMessageDialog(null,"Filme removido com SUCESSO!");
                                break;
                                
                            case 2:
                                limparTela();
                                JOptionPane.showMessageDialog(null,"Operação cancelada.");
                                break;
                                
                            default:
                                limparTela();
                                JOptionPane.showMessageDialog(null,"Opção inválida!");
                         }
                     }
                 }
                 break;
                
            case 5:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FILMES POR TÍTULO...");
                String titulo;
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não existem filmes para pesquisar.");
                }else{
                    do{
                        titulo=JOptionPane.showInputDialog("Digite o nome do filme: ");
                        if(titulo.length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(titulo.length()<2);
                        Filme encontrados= c.pesquisarTitulo(titulo);
                        if(encontrados== null){
                        JOptionPane.showMessageDialog(null,"Não existem filmes para pesquisar.");
                    }else{
                        JOptionPane.showMessageDialog(null,encontrados);
                    }  
                }
                break;
                    
            case 6:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FILMES POR GÊNERO...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há filmes para pesquisar.");
                }else{
                    byte genero;
                    do{
                       JOptionPane.showMessageDialog(null,"Gêneros: "
                            +"\n1. Ação" 
                            +"\n2. Animação" 
                            +"\n3. Aventura"
                            +"\n4. Cinema de Arte"
                            +"\n5. Chanchada"
                            +"\n6. Cinema catástrofe" 
                            +"\n7. Comédia" 
                            +"\n8. Comédia romântica"
                            +"\n9. Comédia dramática"
                            +"\n10. Comédia de ação"
                            +"\n11. Dança" 
                            +"\n12. Documentário" 
                            +"\n13. Docuficção"
                            +"\n14. Drama"
                            +"\n15. Espionagem"
                            +"\n16. Faroeste (ou western)" 
                            +"\n17. Fantasia científica" 
                            +"\n18. Ficção científica"
                            +"\n19. Filmes de guerra"
                            +"\n20. Musical"
                            +"\n21. Filme policial" 
                            +"\n22. Romance" 
                            +"\n23. Seriado"
                            +"\n24. Suspense"
                            +"\n25. Terror (ou horror)");
                            genero=(Byte.parseByte(JOptionPane.showInputDialog(null, "Escolha o gênero do filme: ")));
                            if(genero<1 || genero>25){
                                JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                            }
                    }while(genero<1 || genero>25);
                    ArrayList<Filme> encontrado= c.pequisarGenero(genero);
                    if(encontrado.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há filmes com esse gênero.");
                    }else{
                        JOptionPane.showMessageDialog(null,encontrado);
                    }
                }
                break;
                
            case 7:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FILMES POR NOME DE FORNECEDOR...");
                String nome;
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não existem fornecedores para pesquisar.");
                }else{
                    do{
                        nome= JOptionPane.showInputDialog("Digite o nome do fornecedor: ");
                        if(nome.length()<2){
                           JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(nome.length()<2);
                    ArrayList<Filme> encontrados= c.pequisarFornecedor(nome);
                    if(encontrados== null){
                        JOptionPane.showMessageDialog(null,"Não existem fornecedores para pesquisar.");
                    }else{
                        JOptionPane.showMessageDialog(null,encontrados);
                    }
                }
                break;
                
            case 8:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FILMES POR CLASSIFICAÇÃO...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há fimes para pesquisar.");
                }else{
                    byte classificacao;
                    do{
                        JOptionPane.showMessageDialog(null,"Classificações: "
                            +"\n1. L (verde) – Livre para todos os públicos." 
                            +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                            +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                            +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                            +"\n5. 16 (vermelho) – Não recomendado para menores de "
                            + "16 anos. Por poder conter nudez parcial ou violência."
                            +"\n6. 18(preto) – Não recomendado para menores de 18 "
                            + "anos. Contém conteúdo explícito apropriado somente "
                            + "para adultos.");
                        classificacao=(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite a classificação do filme: ")));
                        if(classificacao<1 || classificacao>6){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(classificacao<1 || classificacao>6);
                    ArrayList<Filme> encontrado= c.pequisarClassificacao(classificacao);
                    if(encontrado.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há filmes com essa classificação.");
                    }else{
                        JOptionPane.showMessageDialog(null,encontrado);
                    }
                }
                break;
                
            case 9:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FILMES POR MÊS DE ESTREIA...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há filmes para pesquisar.");
                }else{
                    Byte mes;
                    int ano;
                    do{
                        mes=Byte.parseByte(JOptionPane.showInputDialog(null,"Digite o mês: "));
                        //validando
                        if(mes<=0){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(mes<=0);
                    
                    do{
                        ano=(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano: ")));
                        //validando
                        if(ano<=0){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                    }while(ano<=0);
                    ArrayList<Filme> encontrado= c.pesquisarPorEstreia(mes, ano);
                    if(encontrado.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há filmes estreiando nesse mês.");
                    }else{
                        JOptionPane.showMessageDialog(null,encontrado);
                    }
                }
                break;
            
            case 10:
                limparTela();
                JOptionPane.showMessageDialog(null,"PESQUISANDO FORNECEDOR POR CÓDIGO...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não há filmes para pesquisar.");
                }else{
                    do{
                        codigo= (Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme: ")));
                        if(codigo<=0){
                            JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                        }
                     }while(codigo<=0);
                     Fornecedor encontrado= c.pesquisarPorFornecedor(codigo);
                     if(encontrado== null){
                        JOptionPane.showMessageDialog(null,"Não há fornecedores com esse código.");
                     }else{
                        JOptionPane.showMessageDialog(null,encontrado);
                     }
                 }
                 break;
            case 11:
                limparTela();
                JOptionPane.showMessageDialog(null,"EDITANDO...");
                if(c.getLista().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Não existem filmes para pesquisar");
                }else{
                    codigo= (Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do filme: ")));
                    int indiceEncontrado= c.pesquisarIndice(codigo);
                    if(indiceEncontrado==-1){
                        JOptionPane.showMessageDialog(null,"Não há filmes com este código.");
                    }else{
                        byte escolha;
                        escolha= Byte.parseByte(JOptionPane.showInputDialog("Escolha o dado para editar: "
                            + "\n1. Editar título"
                            + "\n2. Editar gênero"
                            + "\n3. Editar classificação"
                            + "\n4. Editar Dia da Lançamento"
                            + "\n5. Editar Mês da Lançamento"
                            + "\n6. Editar Ano de Lançamento"
                            + "\n7. Editar Nome de Fornecedor"
                            + "\n8. Editar CNPJ de Fornecedor"
                            + "\n9. Editar Telefone de Fornecedor"
                            + "\n10. Editar E-mail de Fornecedor"
                            + "\n11. Editar Rua de Fornecedor"
                            + "\n12. Editar Número de Fornecedor"
                            + "\n13. Editar Complemento de Fornecedor"
                            + "\n14. Editar Cidade de Fornecedor"
                            + "\n15. Editar Estado de Fornecedor"
                            + "\n0. Sair"));
                    
                    switch(menu){
                        case 1:
                            do{
                                limparTela();
                                JOptionPane.showMessageDialog(null,"EDITANDO TÍTULO DO FILME...");
                                nome= (JOptionPane.showInputDialog("Digite o novo título do filme: "));
                                if(nome.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro!");
                                    }
                                }while(nome.length()<2);
                                c.getLista().get(indiceEncontrado).setTitulo(nome);
                                JOptionPane.showMessageDialog(null,"Título alterado com SUCESSO!");
                                break;
                        case 2:
                            limparTela();
                            byte genero;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO GÊNERO DO FILME...");
                                JOptionPane.showMessageDialog(null,"Gêneros: "     
                                    +"\n1. Ação" 
                                    +"\n2. Animação" 
                                    +"\n3. Aventura"
                                    +"\n4. Cinema de Arte"
                                    +"\n5. Chanchada"
                                    +"\n6. Cinema catástrofe" 
                                    +"\n7. Comédia" 
                                    +"\n8. Comédia romântica"
                                    +"\n9. Comédia dramática"
                                    +"\n10. Comédia de ação"
                                    +"\n11. Dança" 
                                    +"\n12. Documentário" 
                                    +"\n13. Docuficção"
                                    +"\n14. Drama"
                                    +"\n15. Espionagem"
                                    +"\n16. Faroeste (ou western)" 
                                    +"\n17. Fantasia científica" 
                                    +"\n18. Ficção científica"
                                    +"\n19. Filmes de guerra"
                                    +"\n20. Musical"
                                    +"\n21. Filme policial" 
                                    +"\n22. Romance" 
                                    +"\n23. Seriado"
                                    +"\n24. Suspense"
                                    +"\n25. Terror (ou horror)");
                                genero= Byte.parseByte(JOptionPane.showInputDialog("Digite o gênero do filme: "));
                                if(genero<1 || genero>25){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(genero<1 || genero>25);
                                c.getLista().get(indiceEncontrado).getGenero().setGenero(genero);
                                JOptionPane.showMessageDialog(null,"Gênero alterado com SUCESSO!");
                                break;
                        case 3:
                            limparTela();
                            byte classificacao;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO CLASSIFICAÇÃO DO FILME...");
                                JOptionPane.showMessageDialog(null,"Classificações: "
                                    +"\n1. L (verde) – Livre para todos os públicos." 
                                    +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                                    +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                                    +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                                    +"\n5. 16 (vermelho) – Não recomendado para menores de "
                                    + "16 anos. Por poder conter nudez parcial ou violência."
                                    +"\n6. 18(preto) – Não recomendado para menores de 18 "
                                    + "anos. Contém conteúdo explícito apropriado somente "
                                    + "para adultos.");
                                classificacao= Byte.parseByte(JOptionPane.showInputDialog("Digite a classificação do filme: "));
                                if(classificacao<1 || classificacao>6){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(classificacao<1 || classificacao>6);
                                c.getLista().get(indiceEncontrado).getClassificacao().setClassificacao(classificacao);
                                JOptionPane.showMessageDialog(null,"Classificação alterada com SUCESSO!");
                                break;
                        case 4:
                            byte dia;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO DIA DE LANÇAMENTO DO FILME...");
                                dia= (Byte.parseByte(JOptionPane.showInputDialog("Digite o dia: ")));
                                        erroData= c.getLista().get(dia).getData().verificarErro();
                                if(erroData){
                                    JOptionPane.showMessageDialog(null,"Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setDia(dia);
                            JOptionPane.showMessageDialog(null,"Dia alterado com SUCESSO!");
                            break;
                            
                        case 5:
                            limparTela();
                            byte mes;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO MÊS DE LANÇAMENTO DO FILME...");
                                mes= (Byte.parseByte(JOptionPane.showInputDialog("Digite o mês: ")));
                                        erroData= c.getLista().get(mes).getData().verificarErro();
                                if(erroData){
                                    JOptionPane.showMessageDialog(null,"Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setMes(mes);
                            JOptionPane.showMessageDialog(null,"Mês alterado com SUCESSO!");
                            break;
                            
                            
                        case 6:
                            int ano;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ANO DE LANÇAMENTO DO FILME...");
                                ano= (Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")));
                                        erroData= c.getLista().get(ano).getData().verificarErro();
                                if(erroData){
                                    JOptionPane.showMessageDialog(null,"Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setAno(ano);
                            JOptionPane.showMessageDialog(null,"Ano alterado com SUCESSO!");
                            break;


                        case 7:
                            limparTela();
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO NOME DO FORNECEDOR DO FILME...");
                                nome= (JOptionPane.showInputDialog("Digite um novo nome para o fornecedor: "));

                                if(nome.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(nome.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().setNome(nome);
                                JOptionPane.showMessageDialog(null,"Nome alterado com SUCESSO!");
                                break;
                            
                        case 8:
                            limparTela();
                            String cnpj;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO CNPJ DO FORNECEDOR DO FILME...");
                                cnpj= (JOptionPane.showInputDialog("Digite um novo CNPJ para o fornecedor: "));
                                if(cnpj.length()<14){
                                    JOptionPane.showMessageDialog(null,"Erro!");
                                    }
                                }while(cnpj.length()<14);
                                c.getLista().get(indiceEncontrado).getFornecedor().setCnpj(cnpj);
                                JOptionPane.showMessageDialog(null,"Nome alterado com SUCESSO!");
                                break;
                            
                        case 9:
                            limparTela();
                            String telefone;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO TELEFONE DO FORNECEDOR DO FILME...");
                                telefone= (JOptionPane.showInputDialog("Digite um novo telefone para o fornecedor: "));
                                if(telefone.length()<8){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(telefone.length()<8);
                                c.getLista().get(indiceEncontrado).getFornecedor().setTelefone(telefone);
                                JOptionPane.showMessageDialog(null,"Nome alterado com SUCESSO!");
                                break;
                            
                        case 10:
                            limparTela();
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO E-MAIL DO FORNECEDOR DO FILME...");                              
                                email= (JOptionPane.showInputDialog("Digite o e-mail do fornecedor: "));
                                //validando
                                erroEmail = c.getLista().get(indiceEncontrado).getFornecedor().validarErro(email);
                                    if(erroEmail){
                                        JOptionPane.showMessageDialog(null,"E-mail inválida");
                                    }
                            }while(erroEmail);
                            c.getLista().get(indiceEncontrado).getFornecedor().setEmail(email);
                            JOptionPane.showMessageDialog(null,"E-mail alterado com SUCESSO!");
                            break;
                            
                        case 11: 
                            limparTela();
                            String rua;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                rua= (JOptionPane.showInputDialog("Digite uma nova rua para o fornecedor: "));
                                if(rua.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(rua.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setRua(rua);
                                JOptionPane.showMessageDialog(null,"Rua alterada com SUCESSO!");
                                break;
                            
                        case 12:
                            limparTela();
                            String numero;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                numero= (JOptionPane.showInputDialog("Digite um novo número para o fornecedor: "));
                                if(numero.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(numero.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setNumero(numero);
                                JOptionPane.showMessageDialog(null,"Número alterado com SUCESSO!");
                                break;
                            
                        case 13:
                            limparTela();
                            String complemento;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                complemento= (JOptionPane.showInputDialog("Digite um novo complemento para o fornecedor: "));
                                if(complemento.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(complemento.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setComplemento(complemento);
                                JOptionPane.showMessageDialog(null,"Complemento alterado com SUCESSO!");
                                break;
                        
                        case 14:
                            limparTela();
                            String cidade;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                cidade= (JOptionPane.showInputDialog("Digite uma nova cidade para o fornecedor: "));
                                if(cidade.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(cidade.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setCidade(cidade);
                                JOptionPane.showMessageDialog(null,"Cidade alterada com SUCESSO!");
                                break;
                            
                        
                        case 15:
                            limparTela();
                            String estado;
                            do{
                                JOptionPane.showMessageDialog(null,"EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                estado= (JOptionPane.showInputDialog("Digite um novo estado para o fornecedor: "));
                                if(estado.length()<2){
                                    JOptionPane.showMessageDialog(null,"Erro! Digite novamente.");
                                    }
                                }while(estado.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setEstado(estado);
                                JOptionPane.showMessageDialog(null,"Estado alterado com SUCESSO!");
                                break;
                            
                        case 0:
                            JOptionPane.showMessageDialog(null,"Saindo...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opção inválida!");
                    }
                    }
                }
                        break;
            
            case 0:
                limparTela();
                menu =Byte.parseByte(JOptionPane.showInputDialog("Tem certeza que deseja sair?"
                        + "\n1. Continua"
                        + "\n0. Sair"));
                       switch(menu){
                            case 1:
                               limparTela();
                               JOptionPane.showMessageDialog(null,"Legal!");
                               break;
                            case 0:
                               limparTela();
                               JOptionPane.showMessageDialog(null,"Tchau, volte logo!");
                               break;
                            default:
                               limparTela();
                               JOptionPane.showMessageDialog(null,"Opção inválida!");
                        }
                            break;
                    default:
                       limparTela();
                       JOptionPane.showMessageDialog(null,"Inválido!");
               }
        }while(menu!=0);
    }
    
     //limpar tela
        public static void limparTela(){
        try {
            Robot pressbot= new Robot();
            pressbot.keyPress(17);
            pressbot.keyPress(76);
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
        } catch (AWTException awte) {
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    } 
}