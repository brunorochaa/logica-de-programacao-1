
import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
       
       //instancia
       Cadastro c= new Cadastro();
       
       //menu
        byte menu;
        do{
            System.out.println("\n1. Cadastrar Produtos"
                    +"\n2. Ver Produtos"
                    +"\n3. Ver Quantidade de Produtos"
                    +"\n4. Excluir Produto"
                    +"\n5. Editar Produto"
                    +"\n6. Pesquisar por Código"
                    +"\n7. Pesquisar Produtos por Fornecedor"
                    +"\n8. Pesquisar Produtos Abaixo de um Valor"
                    +"\n9. Pesquisar Fornecedor do Produto"
                    +"\n10. Pesquisar Telefone do Fornecedor"
                    +"\n0. Sair");
            menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 limparTela();
                 System.out.println("Cadastrando...");
                 //instancia
                 Produto p= new Produto();
                 //codigo
                 int codigo;
                 if(c.getLista().isEmpty()){
                     codigo= 1;
                 }else{
                     codigo= c.getLista().get(c.getLista().size()-1).getCodigo()+1;
                 }
                 p.setCodigo(codigo);
                 do{
                    System.out.println("Digite o nome do produto: ");
                    ler.nextLine();
                    p.setNome(ler.nextLine());
                    if(p.getNome().length()<=2){
                        System.out.println("Erro!");
                    }
                 }while(p.getNome().length()<=2);
                 
                 do{
                    System.out.println("Digite a quantidade de produtos:");
                    p.setQuantidade(ler.nextInt());
                    if(p.getQuantidade()<0){
                        System.out.println("Erro!");
                     }
                 }while(p.getQuantidade()<0);
                 
                 do{
                    System.out.println("Digite o valor dos produtos:");
                    p.setValor(ler.nextDouble());
                    if(p.getValor()<0){
                        System.out.println("Erro!");
                     }
                 }while(p.getValor()<0);
                 //instancia 
                 Data d= new Data();
                 //data
                 System.out.println("Digite Data de Vencimento...");
                 System.out.println("Digite o dia: ");
                 d.setDia(ler.nextByte());
                 System.out.println("Digite o mês: ");
                 d.setMes(ler.nextByte());
                 System.out.println("Digite o ano: ");
                 d.setAno(ler.nextInt());
                 //inserindo data em produto
                 p.setDataVencimento(d);
                 //instancia
                 Fornecedor f= new Fornecedor();
                 //fornecedor
                 System.out.println("Digite os Dados do Fornecedor...");
                 System.out.println("Digite o Nome do Fornecedor: ");
                 ler.nextLine();
                 f.setNome(ler.nextLine());
                 
                 do{
                    System.out.println("Digite o CPNJ do Fornecedor "+f.getNome());
                    f.setCnpj(ler.nextLine());
                    if(f.getCnpj().length()<14){
                        System.out.println("Erro!");
                    }
                 }while(f.getCnpj().length()<14);
                 
                 System.out.println("Digite o Telefone do Fornecedor "+f.getNome());
                 f.setTelefone(ler.nextLine());
                 //instancia
                 Endereco e= new Endereco();
                 //endereco fornecedor
                 System.out.println("Digite o Endereço do Fornecedor "+f.getNome()+"...");
                 System.out.println("Digite a Cidade do Fornecedor "+f.getNome());
                 e.setCidade(ler.nextLine());
                 System.out.println("Digite o Estado do Fornecedor "+f.getNome());
                 e.setEstado(ler.nextLine());
                 //inserindo endereco em fornecedor
                 f.setEndereco(e);
                 //inserindo fornecedor em produto
                 p.setFornecedor(f);
                 //cadastrando produto
                 c.cadastrar(p);
                 break;
             
             case 2:
                 limparTela();
                 System.out.println("Visualizando Cadastros...");
                 if(c.getLista().isEmpty()){
                     System.out.println("Não há cadastros.");
                 }else{
                     System.out.println(c);
                 }
                 break;
             
             case 3:
                 limparTela();
                 System.out.println("Total de Cadastros...");
                 System.out.println("Quantidade de produtos: ");
                 if(c.getLista().isEmpty()){
                     System.out.println("Não há produtos cadastrados");
                 }else if(c.verQuantidade()== 1){
                     System.out.println("Existe 1 produto cadastrado");
                 }else{
                    System.out.println("Existem "+c.verQuantidade()+" produtos.");
                 }
                 break;
              
             case 4:
                 limparTela();
                 if(c.getLista().isEmpty()){
                    System.out.println("Não existem cadastros");
                 }else{
                    System.out.println("Excluíndo Produtos...");
                    do{
                        System.out.println("Digite o código do produto á ser removido: ");
                        codigo= ler.nextInt();
                        if(codigo<=0){
                            System.out.println("Erro!");
                        }
                     }while(codigo<=0);
                     Produto encontrado= c.pesquisarPorCodigo(codigo);
                     if(encontrado==null){
                         System.out.println("Não há prduto com sucesso.");
                     }else{
                         byte confirma;
                             System.out.println("Você tem certeza que deseja remover "
                                 +encontrado.getNome() +"? \n1. Sim"
                                 + "\n2.Não");
                         confirma= ler.nextByte();
                         
                         switch(confirma){
                             case 1:
                                 limparTela();
                                 c.remover(encontrado);
                                 System.out.println("Produto removido com SUCESSO!");
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
                 System.out.println("Editando Produtos...");
                 if(c.getLista().isEmpty()){
                        System.out.println("Não existem produtos para pesquisar");
                 }else{
                     System.out.println("Digite o código do produto: ");
                     codigo= ler.nextInt();
                     int indiceEncontrado= c.pesquisarIndice(codigo);
                     if(indiceEncontrado==-1){
                         System.out.println("Não há produtos com este código.");
                     }else{
                         byte escolha;
                         System.out.println("O que deseja editar?"
                                 + "\n1. Nome do Produto"
                                 + "\n2. Nome do Fornecedor"
                                 + "\n3. Estado do Fornecedor"
                                 + "\n4. Cancelar a operação");
                         escolha= ler.nextByte();
                         switch(escolha){
                             case 1:
                                 String nome;
                                 do{
                                    System.out.println("Digite o novo nome do produto: ");
                                    ler.nextLine();
                                    nome= ler.nextLine();
                                    if(nome.length()<2){
                                        System.out.println("Erro!");
                                    }
                                 }while(nome.length()<2);
                                 c.getLista().get(indiceEncontrado).setNome(nome);
                                 System.out.println("Nome alterado com SUCESSO!");
                                 break;
                                 
                             case 2:
                                 do{
                                    System.out.println("Digite um novo nome para o fornecedor: ");
                                    ler.nextLine();
                                    nome= ler.nextLine();
                                    if(nome.length()<2){
                                        System.out.println("Erro!");
                                    }
                                 }while(nome.length()<2);
                                 c.getLista().get(indiceEncontrado).getFornecedor().setNome(nome);
                                 System.out.println("Nome alterado com SUCESSO!");
                                 break;
                             
                             case 3:
                                  do{
                                    System.out.println("Digite um novo nome para o fornecedor: ");
                                    ler.nextLine();
                                    nome= ler.nextLine();
                                    if(nome.length()<2){
                                        System.out.println("Erro!");
                                    }
                                 }while(nome.length()<2);
                                 c.getLista().get(indiceEncontrado).getFornecedor().getEndereco().setEstado(nome);
                                 System.out.println("Estado alterado com SUCESSO!");
                                 break;
                         }
                     }
                 }
                 break;
                 
             case 6:
                limparTela();
                System.out.println("Pesquisando...");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não existem produtos para pesquisar");
                    }else{
                        do{
                        System.out.println("Digite o código do produto: ");
                        codigo= ler.nextInt();
                        if(codigo<=0){
                            System.out.println("Erro!");
                        }
                     }while(codigo<=0);
                     Produto encontrado= c.pesquisarPorCodigo(codigo);
                     if(encontrado== null){
                         System.out.println("Não há produto com esse código");
                     }else{
                         System.out.println(encontrado);
                     }
                 }
                 break;
                 
             case 7:
                limparTela();
                System.out.println("Pesquisando...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem produtos para pesquisar");
                }else{
                    String cnpj;
                    System.out.println("Digite o cnpj do fornecedor: ");
                    cnpj= ler.next();
                    ArrayList<Produto> encontrados= c.pequisarFornecedor(cnpj);
                    if(cnpj.length()<14){
                        System.out.println("Erro!");
                    }
                }while(cnpj.length()<14);
                        
                 break;
                 
             case 8:
                 limparTela();
                 System.out.println("Pesquisando...");
                 System.out.println("Pesquisando...");
                if(c.getLista().isEmpty()){
                    System.out.println("Não existem produtos para pesquisar");
                }else{
                    double valor;
                    System.out.println("Digite o valor requirido do produto: ");
                    valor= ler.nextDouble();
                    ArrayList<Produto> encontrados= c.pequisarPorValor(valor);
                    if(valor<0){
                        System.out.println("Erro!");
                    }
                }while(valor<0);
                break;
                 
             case 9:
                 limparTela();
                 System.out.println("Pesquisando...");
                 if(c.getLista().isEmpty()){
                     System.out.println("Não há produtos para pesquisar");
                 }else{
                     do{
                        System.out.println("Digite o código do produto: ");
                        codigo= ler.nextInt();
                        if(codigo<=0){
                            System.out.println("Erro!");
                        }
                     }while(codigo<=0);
                     Fornecedor encontrado= c.pesquisarPorFornecedor(codigo);
                     if(encontrado== null){
                         System.out.println("Não há produto com esse código");
                     }else{
                         System.out.println(encontrado);
                     }
                 }
                 break;
             
             case 10:
                 limparTela();
                 String cnpj;
                 System.out.println("Pesquisando...");
                 if(c.getLista().isEmpty()){
                     System.out.println("Não há produtos para pesquisar");
                 }else{
                     do{
                         System.out.println("Digite o código do produto: ");
                         cnpj= ler.nextLine();
                         if(cnpj.length()<14){
                             System.out.println("Erro!");
                         }
                     }while(cnpj.length()<14);
                     String telefoneEncontrado= c.pesquisarTelefoneFornecedor(cnpj);
                     if(telefoneEncontrado== null){
                         System.out.println("Não há produto com esse código");
                     }else{
                         System.out.println(telefoneEncontrado);
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