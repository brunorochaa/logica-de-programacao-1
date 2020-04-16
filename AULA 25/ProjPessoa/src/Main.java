
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
                 +"\n3. Editar Nome"
                 +"\n4. Editar RG"
                 +"\n5. Editar Ano Nascimento"
                 +"\n6. Editar Estado"
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
                 System.out.println("Editando nome...");
                 System.out.println("Digite o novo nome: ");
                 ler.nextLine();
                 p.setNome(ler.nextLine());
                 break;
                 
             case 4:
                 System.out.println("Editando RG...");
                 System.out.println("Digite o novo RG: ");
                 p.setRg(ler.next());
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