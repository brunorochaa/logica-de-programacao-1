
import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
     Scanner ler= new Scanner(System.in);
     
     //instancia
     Pessoa p= new Pessoa();
     Data d= new Data();
     Endereco e= new Endereco();
     
     //menu
     byte menu;
     do{
         System.out.println("\n1. Cadastrar Pessoa"
                 +"\n2. Ver Dados"
                 +"\n3. Editar Dados"
                 +"\n0. Sair");
         menu= ler.nextByte();
         
         switch(menu){
             case 1:
                 System.out.println("\nCadastrando...");
                 System.out.println("Digite o nome");
                 p.setNome(ler.nextLine());
                 p.setNome(ler.nextLine());
                 System.out.println("Digite o RG de "+p.getNome()+": ");
                 p.setRg(ler.nextLine());
                 //data
                 System.out.println("Digite o dia de nascimento: ");
                 d.setDia(ler.nextByte());
                 System.out.println("Digite o mes de nascimento: ");
                 d.setMes(ler.nextByte());
                 System.out.println("Digite o ano de nascimento: ");
                 d.setAno(ler.nextInt());
                 //inserindo data em pessoa
                 p.setDataNascimento(d);
                 //endereco
                 /**System.out.println("Digite o estado: ");
                 * e.setEstado(ler.nextLine());
                 * e.setEstado(ler.nextLine());*/
                 System.out.println("Digite a Rua: ");
                 e.setRua(ler.nextLine());
                 e.setRua(ler.nextLine());
                 System.out.println("Digite o Número: ");
                 e.setNumero(ler.nextLine());
                 System.out.println("Digite o Bairro: ");
                 e.setBairro(ler.nextLine());
                 System.out.println("Digite a cidade: ");
                 e.setCidade(ler.nextLine());
                 System.out.println("Digite o CEP: ");
                 e.setCep(ler.nextInt());
                 //inserindo endereco em pessoa
                 p.setEndereco(e);
                 break;
                 
             case 2:
                 System.out.println("Visualizando Dados...");
                 System.out.println("\nDados: "+p);
                 break;
                 
             case 3:
                 System.out.println("Escolha o dado para editar: "
                            + "\n1. Editar nome"
                            + "\n2. Editar RG"
                            + "\n3. Editar Dia de Nascimento"
                            + "\n4. Editar Mês de Nascimento"
                            + "\n5. Editar Ano de Nascimento"
                            + "\n6. Editar Estado"
                            + "\n7. Editar Rua"
                            + "\n8. Editar Número"
                            + "\n9. Editar Bairro"
                            + "\n10. Editar Cidade"
                            + "\n11. Editar CEP"
                            + "\n0. Sair");
                    menu= ler.nextByte();
                    
                    switch(menu){
                        case 1:
                            System.out.println("Editando nome...");
                            System.out.println("Digite o novo nome: ");
                            ler.nextLine();
                            p.setNome(ler.nextLine());
                            break;
                        case 2:
                            System.out.println("Editando RG...");
                            System.out.println("Digite o novo RG: ");
                            p.setRg(ler.next());
                            break;
                        case 3:
                            System.out.println("Editando Dia de Nascimento...");
                            System.out.println("Digite o novo Dia de Nascimento: ");
                            p.getDataNascimento().setDia(ler.nextByte());
                            break;
                        case 4:
                            System.out.println("Editando Mês de Nascimento...");
                            System.out.println("Digite o novo Dia de Nascimento: ");
                            p.getDataNascimento().setMes(ler.nextByte());
                            break;
                        case 5:
                            System.out.println("Editando Ano Nascimento...");
                            System.out.println("Digite o novo Ano de Nascimento: ");
                            p.getDataNascimento().setAno(ler.nextInt());
                            break;
                        case 6:
                            System.out.println("Editando Estado...");
                            System.out.println("Digite o novo Estado: ");
                            p.getEndereco().setEstado(ler.next());
                            break;
                        case 7:
                            System.out.println("Editando Rua...");
                            System.out.println("Digite a nova Rua: ");
                            p.getEndereco().setRua(ler.next());
                            break;
                        case 8:
                            System.out.println("Editando Número...");
                            System.out.println("Digite o novo Número: ");
                            p.getEndereco().setNumero(ler.next());
                            break;
                        case 9:
                            System.out.println("Editando Bairro...");
                            System.out.println("Digite o novo Bairro: ");
                            p.getEndereco().setBairro(ler.next());
                            break;
                        case 10:
                            System.out.println("Editando Cidade...");
                            System.out.println("Digite a nova Cidade: ");
                            p.getEndereco().setCidade(ler.next());
                            break;
                        case 11:
                            System.out.println("Editando CEP...");
                            System.out.println("Digite o novo CEP: ");
                            p.getEndereco().setCep(ler.nextInt());
                            break;
                        case 0:
                            System.out.println("Saíndo...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                        break;

             case 0:
                    System.out.println("Tem certeza que deseja sair?"
                            + "\n1. Continua"
                            + "\n0. Sair");
                    menu= ler.nextByte();
                    
                    switch(menu){
                        case 1:
                            System.out.println("Legal!");
                            break;
                        case 0:
                            System.out.println("Tchau, volte logo!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                        break;   
                default:
                    System.out.println("Inválido!");
            }
        }while(menu!=0);
    } 
}