
import java.awt.AWTException;
import java.awt.Robot;

import java.util.ArrayList;

import java.util.Scanner;
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
            System.out.println("1. Cadastrar novo filme"
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
                    +"\n0. Sair");
            menu= ler.nextByte();
         
         switch(menu){
            case 1:
                limparTela();
                System.out.println("CADASTRANDO FILME...");
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
                    System.out.println("Digite o título do filme: ");
                    ler.nextLine();
                    f.setTitulo(ler.nextLine());
                    //validando
                    if(f.getTitulo().length()<2){
                        System.out.println("Erro! Digite novamente.");
                    }
                }while(f.getTitulo().length()<2);
                //instanciando gênero
                Genero g= new Genero();
                //cadastrando genero
                do{
                    System.out.println("Escolha o gênero do filme: ");
                    System.out.println("Gêneros: "
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
                            g.setGenero(ler.nextByte());
                            //validando
                            if(g.getGenero()<1 || g.getGenero()>25){
                                System.out.println("Erro! Digite novamente.");
                            }
                }while(g.getGenero()<1 || g.getGenero()>25);
                //inserindo genero em filme
                f.setGenero(g);
                //instanciando classificação
                Classificacao c1= new Classificacao();
                //cadastrando genero
                do{
                    System.out.println("Escolha a classificação do filme: ");
                    System.out.println("Classificações: "
                            +"\n1. L (verde) – Livre para todos os públicos." 
                            +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                            +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                            +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                            +"\n5. 16 (vermelho) – Não recomendado para menores de "
                            + "16 anos. Por poder conter nudez parcial ou violência."
                            +"\n6. 18(preto) – Não recomendado para menores de 18 "
                            + "anos. Contém conteúdo explícito apropriado somente "
                            + "para adultos.");
                        c1.setClassificacao(ler.nextByte());
                        //validando
                        if(c1.getClassificacao()<1 || c1.getClassificacao()>6){
                            System.out.println("Erro! Digite novamente.");
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
                    System.out.println("DIGITANDO DATA DO FILME...");
                    System.out.println("Digite o dia: ");
                    d.setDia(ler.nextByte());
                    System.out.println("Digite o mês: ");
                    d.setMes(ler.nextByte());
                    System.out.println("Digite o ano: ");
                    d.setAno(ler.nextInt());
                    //validando
                    erroData = d.verificarErro();
                    if(erroData){
                        System.out.println("Data inválida");
                    }
                }while(erroData);
                //inserindo data em filme
                f.setData(d);
                //instancia fornecedor
                Fornecedor f1= new Fornecedor();
                //limpar tela
                limparTela();
                //fornecedor
                System.out.println("DIGITANDO DADOS DO FORNECEDOR...");
                do{
                    System.out.println("Digite o nome do fornecedor: ");
                    ler.nextLine();
                    f1.setNome(ler.nextLine());
                    //validando
                    if(f1.getNome().length()<2){
                            System.out.println("Erro! Digite novamente.");
                        }
                }while(f1.getNome().length()<2);
                
                do{
                    System.out.println("Digite o CPNJ do fornecedor: ");
                    f1.setCnpj(ler.nextLine());
                    //validando
                    if(f1.getCnpj().length()<14){
                        System.out.println("Erro! Digite novamente.");
                    }
                }while(f1.getCnpj().length()<14);
                
                do{
                    System.out.println("Digite o telefone do fornecedor: ");
                    f1.setTelefone(ler.nextLine());
                    //vaidando
                    if(f1.getTelefone().length()<8){
                        System.out.println("Erro! Digite novamente.");
                    }
                }while(f1.getTelefone().length()<8);
                //email
                boolean erroEmail;
                String email;
                do{
                    System.out.println("Digite o e-mail do fornecedor: ");
                    email = ler.nextLine();
                    //validando
                    erroEmail = f1.validarErro(email);
                        if(erroEmail){
                            System.out.println("E-mail inválido");
                        }
                }while(erroEmail);
                //set email
                f1.setEmail(email);
                //instancia endereço
                Endereco e= new Endereco();
                //limpar tela
                limparTela();
                //endereco fornecedor
                System.out.println("DIGITANDO ENDEREÇO DO FORNECEDOR...");
                do{
                    System.out.println("Digite a rua do fornecedor: ");
                    e.setRua(ler.nextLine());
                    //validando
                    if(e.getRua().length()<2){
                                System.out.println("Erro! Digite novamente.");
                            }
                }while(e.getRua().length()<2);
                
                do{
                    System.out.println("Digite o número do fornecedor: ");
                    e.setNumero(ler.nextLine());
                    //validando
                    if(e.getNumero().length()<1){
                                System.out.println("Erro! Digite novamente.");
                            }
                }while(e.getNumero().length()<1);
                
                System.out.println("Digite o complemento do fornecedor: ");
                e.setComplemento(ler.nextLine());
                
                do{
                    System.out.println("Digite a cidade do fornecedor: ");
                    e.setCidade(ler.nextLine());
                    //validando
                    if(e.getCidade().length()<2){
                                System.out.println("Erro! Digite novamente.");
                            }
                }while(e.getCidade().length()<2);
                
                do{
                    System.out.println("Digite o estado do fornecedor: ");
                    e.setEstado(ler.nextLine());
                    //validando
                    if(e.getEstado().length()<2){
                                System.out.println("Erro! Digite novamente.");
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
                System.out.println("MOSTRANDO FILMES EM CARTAZ...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não há Filmes em Cartaz.");
                }else{
                    System.out.println(c);
                }
                break;
              
            case 3:
                //limpaTela
                limparTela();
                //quantidade
                System.out.println("VISUALIZANDO QUANTIDADE DE FILMES...");
                System.out.println("Quantidade de FILMES: ");
                if(c.getLista().isEmpty()){
                    System.out.println("Não há filme cadastrados");
                }else if(c.verQuantidade()== 1){
                    System.out.println("Existe 1 filme cadastrado");
                }else{
                    System.out.println("Existem "+c.verQuantidade()+" filmes "
                            + "cadastrados.");
                }
                break;
                
            case 4: 
                //limpaTela
                limparTela();
                //removendo
                System.out.println("REMOVENDO FILMES...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem filmes cadastrados");
                }else{
                    System.out.println("EXCLUINDO FILME...");
                    do{
                        System.out.println("Digite o código do filme á ser removido: ");
                        codigo= ler.nextInt();
                        if(codigo<=0){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(codigo<=0);
                    Filme encontrado= c.pesquisarPorCodigo(codigo);
                    if(encontrado==null){
                        System.out.println("Não há filme.");
                    }else{
                        byte confirma;
                            System.out.println("Você tem certeza que deseja remover "
                                +encontrado.getTitulo()+"? \n1. Sim"
                                + "\n2.Não");
                        confirma= ler.nextByte();
                         
                        switch(confirma){
                            case 1:
                                limparTela();
                                c.remover(encontrado);
                                System.out.println("Filme removido com SUCESSO!");
                                break;
                                
                            case 2:
                                limparTela();
                                System.out.println("Operação cancelada.");
                                break;
                                
                            default:
                                limparTela();
                                System.out.println("Opção inválida!");
                         }
                     }
                 }
                 break;
                
            case 5:
                limparTela();
                System.out.println("PESQUISANDO FILMES POR TÍTULO...");
                String titulo;
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem filmes para pesquisar.");
                }else{
                    do{
                        System.out.println("Digite o nome do filme: ");
                        ler.nextLine();
                        titulo= ler.nextLine();
                         if(titulo.length()<2){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(titulo.length()<2);
                        Filme encontrados= c.pesquisarTitulo(titulo);
                        if(encontrados== null){
                        System.out.println("Não existem filmes para pesquisar.");
                    }else{
                        System.out.println(encontrados);
                    }  
                }
                break;
                    
            case 6:
                limparTela();
                System.out.println("PESQUISANDO FILMES POR GÊNERO...");
                if(c.getLista().isEmpty()){
                     System.out.println("Não há filmes para pesquisar.");
                }else{
                    byte genero;
                    do{
                        System.out.println("Digite o gênero do filme: ");
                        System.out.println("Gêneros: "
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
                            genero= ler.nextByte();
                            if(genero<1 || genero>25){
                                System.out.println("Erro! Digite novamente.");
                            }
                    }while(genero<1 || genero>25);
                    ArrayList<Filme> encontrado= c.pequisarGenero(genero);
                    if(encontrado.isEmpty()){
                        System.out.println("Não há filmes com esse gênero.");
                    }else{
                        System.out.println(encontrado);
                    }
                }
                break;
                
            case 7:
                limparTela();
                System.out.println("PESQUISANDO FILMES POR NOME DE FORNECEDOR...");
                String nome;
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem fornecedores para pesquisar.");
                }else{
                    do{
                        System.out.println("Digite o nome do fornecedor: ");
                        ler.nextLine();
                        nome= ler.nextLine();
                         if(nome.length()<=2){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(nome.length()<=2);
                    ArrayList<Filme> encontrados= c.pequisarFornecedor(nome);
                    if(encontrados== null){
                        System.out.println("Não existem fornecedores para pesquisar.");
                    }else{
                        System.out.println(encontrados);
                    }
                }
                break;
                
            case 8:
                limparTela();
                System.out.println("PESQUISANDO FILMES POR CLASSIFICAÇÃO...");
                if(c.getLista().isEmpty()){
                     System.out.println("Não há fimes para pesquisar.");
                }else{
                    byte classificacao;
                    do{
                        System.out.println("Digite a classificação do filme: ");
                        System.out.println("Classificações: "
                            +"\n1. L (verde) – Livre para todos os públicos." 
                            +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                            +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                            +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                            +"\n5. 16 (vermelho) – Não recomendado para menores de "
                            + "16 anos. Por poder conter nudez parcial ou violência."
                            +"\n6. 18(preto) – Não recomendado para menores de 18 "
                            + "anos. Contém conteúdo explícito apropriado somente "
                            + "para adultos.");
                        classificacao= ler.nextByte();
                        if(classificacao<1 || classificacao>6){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(classificacao<1 || classificacao>6);
                    ArrayList<Filme> encontrado= c.pequisarClassificacao(classificacao);
                    if(encontrado.isEmpty()){
                        System.out.println("Não há filmes com essa classificação.");
                    }else{
                        System.out.println(encontrado);
                    }
                }
                break;
                
            case 9:
                limparTela();
                System.out.println("PESQUISANDO FILMES POR MÊS DE ESTREIA...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não há filmes para pesquisar.");
                }else{
                    Byte mes;
                    int ano;
                    do{
                        System.out.println("Digite o mês: ");
                        mes=ler.nextByte();
                        //validando
                        if(mes<=0){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(mes<=0);
                    
                    do{
                        System.out.println("Digite o ano: ");
                        ano=ler.nextInt();
                        //validando
                        if(ano<=0){
                            System.out.println("Erro! Digite novamente.");
                        }
                    }while(ano<=0);
                    ArrayList<Filme> encontrado= c.pesquisarPorEstreia(mes, ano);
                    if(encontrado.isEmpty()){
                        System.out.println("Não há filmes estreiando nesse mês.");
                    }else{
                        System.out.println(encontrado);
                    }
                }
                break;
            
            case 10:
                limparTela();
                 System.out.println("PESQUISANDO FORNECEDOR POR CÓDIGO...");
                 if(c.getLista().isEmpty()){
                     System.out.println("Não há filmes para pesquisar.");
                 }else{
                     do{
                        System.out.println("Digite o código do filme: ");
                        codigo= ler.nextInt();
                        if(codigo<=0){
                            System.out.println("Erro! Digite novamente.");
                        }
                     }while(codigo<=0);
                     Fornecedor encontrado= c.pesquisarPorFornecedor(codigo);
                     if(encontrado== null){
                         System.out.println("Não há fornecedores com esse código.");
                     }else{
                         System.out.println(encontrado);
                     }
                 }
                 break;
            case 11:
                limparTela();
                System.out.println("EDITANDO...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem filmes para pesquisar");
                }else{
                    System.out.println("Digite o código do filme: ");
                    codigo= ler.nextInt();
                    int indiceEncontrado= c.pesquisarIndice(codigo);
                    if(indiceEncontrado==-1){
                        System.out.println("Não há filmes com este código.");
                    }else{
                         byte escolha;
                 System.out.println("Escolha o dado para editar: "
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
                            + "\n0. Sair");
                    menu= ler.nextByte();
                    
                    switch(menu){
                        case 1:
                            do{
                                limparTela();
                                System.out.println("EDITANDO TÍTULO DO FILME...");
                                System.out.println("Digite o novo título do filme: ");
                                ler.nextLine();
                                nome= ler.nextLine();
                                if(nome.length()<2){
                                    System.out.println("Erro!");
                                    }
                                }while(nome.length()<2);
                                c.getLista().get(indiceEncontrado).setTitulo(nome);
                                System.out.println("Título alterado com SUCESSO!");
                                break;
                        case 2:
                            limparTela();
                            byte genero;
                            do{
                                System.out.println("EDITANDO GÊNERO DO FILME...");
                                System.out.println("Digite o gênero do filme: ");
                                System.out.println("Gêneros: "     
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
                                genero= ler.nextByte();
                                if(genero<1 || genero>25){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(genero<1 || genero>25);
                                c.getLista().get(indiceEncontrado).getGenero().setGenero(genero);
                                System.out.println("Gênero alterado com SUCESSO!");
                                break;
                        case 3:
                            limparTela();
                            byte classificacao;
                            do{
                                System.out.println("EDITANDO CLASSIFICAÇÃO DO FILME...");
                                System.out.println("Digite a classificação do filme: ");
                                System.out.println("Classificações: "
                                    +"\n1. L (verde) – Livre para todos os públicos." 
                                    +"\n2. 10(azul)– Não recomendado para menores de 10 anos." 
                                    +"\n3. 12(amarelo)– Não recomendado para menores de 12 anos."
                                    +"\n4. 14(laranja) – Não recomendado para menores de 14 anos."
                                    +"\n5. 16 (vermelho) – Não recomendado para menores de "
                                    + "16 anos. Por poder conter nudez parcial ou violência."
                                    +"\n6. 18(preto) – Não recomendado para menores de 18 "
                                    + "anos. Contém conteúdo explícito apropriado somente "
                                    + "para adultos.");
                                classificacao= ler.nextByte();
                                if(classificacao<1 || classificacao>6){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(classificacao<1 || classificacao>6);
                                c.getLista().get(indiceEncontrado).getClassificacao().setClassificacao(classificacao);
                                System.out.println("Classificação alterada com SUCESSO!");
                                break;
                        case 4:
                            byte dia;
                            do{
                                System.out.println("EDITANDO DIA DE LANÇAMENTO DO FILME...");
                                System.out.println("Digite o dia: ");
                                dia= ler.nextByte();
                                        limparTela();
                                        erroData= c.getLista().get(dia).getData().verificarErro();
                                if(erroData){
                                    System.out.println("Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setDia(dia);
                            System.out.println("Dia alterado com SUCESSO!");
                            break;
                            
                        case 5:
                            limparTela();
                            byte mes;
                            do{
                                System.out.println("EDITANDO MÊS DE LANÇAMENTO DO FILME...");
                                System.out.println("Digite o mês: ");
                                mes= ler.nextByte();
                                        limparTela();
                                        erroData= c.getLista().get(mes).getData().verificarErro();
                                if(erroData){
                                    System.out.println("Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setMes(mes);
                            System.out.println("Mês alterado com SUCESSO!");
                            break;
                            
                            
                        case 6:
                            int ano;
                            do{
                                System.out.println("EDITANDO ANO DE LANÇAMENTO DO FILME...");
                                System.out.println("Digite o ano: ");
                                ano= ler.nextInt();
                                        limparTela();
                                        erroData= c.getLista().get(ano).getData().verificarErro();
                                if(erroData){
                                    System.out.println("Data inválida! Digite novamente.");
                                }
                            }while(erroData);
                            c.getLista().get(indiceEncontrado).getData().setAno(ano);
                            System.out.println("Ano alterado com SUCESSO!");
                            break;


                        case 7:
                            limparTela();
                            do{
                                System.out.println("EDITANDO NOME DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo nome para o fornecedor: ");
                                ler.nextLine();
                                nome= ler.nextLine();
                                if(nome.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(nome.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().setNome(nome);
                                System.out.println("Nome alterado com SUCESSO!");
                                break;
                            
                        case 8:
                            limparTela();
                            String cnpj;
                            do{
                                System.out.println("EDITANDO CNPJ DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo CNPJ para o fornecedor: ");
                                ler.nextLine();
                                cnpj= ler.nextLine();
                                if(cnpj.length()<14){
                                    System.out.println("Erro!");
                                    }
                                }while(cnpj.length()<14);
                                c.getLista().get(indiceEncontrado).getFornecedor().setCnpj(cnpj);
                                System.out.println("Nome alterado com SUCESSO!");
                                break;
                            
                        case 9:
                            limparTela();
                            String telefone;
                            do{
                                System.out.println("EDITANDO TELEFONE DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo telefone para o fornecedor: ");
                                ler.nextLine();
                                telefone= ler.nextLine();
                                if(telefone.length()<8){
                                    System.out.println("Erro!");
                                    }
                                }while(telefone.length()<8);
                                c.getLista().get(indiceEncontrado).getFornecedor().setTelefone(telefone);
                                System.out.println("Nome alterado com SUCESSO!");
                                break;
                            
                        case 10:
                            limparTela();
                            int i;
                            do{
                                System.out.println("EDITANDO E-MAIL DO FORNECEDOR DO FILME...");
                                System.out.println("Digite o e-mail do fornecedor: ");                                
                                email = ler.next();
                                //validando
                                erroEmail = c.getLista().get(indiceEncontrado).getFornecedor().validarErro(email);
                                    if(erroEmail){
                                        System.out.println("E-mail inválida");
                                    }
                            }while(erroEmail);
                            c.getLista().get(indiceEncontrado).getFornecedor().setEmail(email);
                            System.out.println("E-mail alterado com SUCESSO!");
                            break;
                            
                        case 11: 
                            limparTela();
                            String rua;
                            do{
                                System.out.println("EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                System.out.println("Digite uma nova rua para o fornecedor: ");
                                ler.nextLine();
                                rua= ler.nextLine();
                                if(rua.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(rua.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setRua(rua);
                                System.out.println("Rua alterada com SUCESSO!");
                                break;
                            
                        case 12:
                            limparTela();
                            String numero;
                            do{
                                System.out.println("EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo número para o fornecedor: ");
                                ler.nextLine();
                                numero= ler.nextLine();
                                if(numero.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(numero.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setNumero(numero);
                                System.out.println("Número alterado com SUCESSO!");
                                break;
                            
                        case 13:
                            limparTela();
                            String complemento;
                            do{
                                System.out.println("EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo complemento para o fornecedor: ");
                                ler.nextLine();
                                complemento= ler.nextLine();
                                if(complemento.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(complemento.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setComplemento(complemento);
                                System.out.println("Complemento alterado com SUCESSO!");
                                break;
                        
                        case 14:
                            limparTela();
                            String cidade;
                            do{
                                System.out.println("EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                System.out.println("Digite uma nova cidade para o fornecedor: ");
                                ler.nextLine();
                                cidade= ler.nextLine();
                                if(cidade.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(cidade.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setCidade(cidade);
                                System.out.println("Cidade alterada com SUCESSO!");
                                break;
                            
                        
                        case 15:
                            limparTela();
                            String estado;
                            do{
                                System.out.println("EDITANDO ENDEREÇO DO FORNECEDOR DO FILME...");
                                System.out.println("Digite um novo estado para o fornecedor: ");
                                ler.nextLine();
                                estado= ler.nextLine();
                                if(estado.length()<2){
                                    System.out.println("Erro! Digite novamente.");
                                    }
                                }while(estado.length()<2);
                                c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setEstado(estado);
                                System.out.println("Estado alterado com SUCESSO!");
                                break;
                            
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    }
                }
                        break;
            
            case 0:
                 limparTela();
                 System.out.println("Tem certeza que deseja sair?"
                        + "\n1. Continua"
                        + "\n0. Sair");
                 menu= ler.nextByte();
                       switch(menu){
                            case 1:
                               limparTela();
                               System.out.println("Legal!");
                               break;
                            case 0:
                               limparTela();
                               System.out.println("Tchau, volte logo!");
                               break;
                            default:
                               limparTela();
                               System.out.println("Opção inválida!");
                        }
                            break;  
                    default:
                       limparTela();
                       System.out.println("Inválido!");
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