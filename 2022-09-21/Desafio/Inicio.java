import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Inicio{

    public static void main (String [] args){
        Usuario usuario = new Usuario(); //Criando uma variavel do tipo usuario - Instanciando
        String nomeDigitado;
        String senhaDigitada;
        String opcaoMenu = "0";
        String opcaoSubMenu = "0";

        Scanner entradaDados = new Scanner(System.in); //Objeto criado para obter os dados digitados em tela

        RepositorioGerenteInterface repositorioGerenteInterface = new RepositorioGerenteInterface();

        List<Gerente> gerentes = new ArrayList<>();
        List<Coordenador> coordenadores = new ArrayList<>();

        //System.out.println(usuario.getNome());
        //System.out.println(usuario.getSenha());

        System.out.println("Digite o usuario: ");
            nomeDigitado = entradaDados.next();
        System.out.println("Digite a senha: ");
            senhaDigitada = entradaDados.next();

        boolean continuar = true;

        if(nomeDigitado.equals(usuario.getNome()) && senhaDigitada.equals(usuario.getSenha())){
            System.out.println("Login realizado com sucesso.");
            while(continuar){

                System.out.println("Digite 1 para Gerente; 2 para Coordenador; 3 para Encerrar");
                opcaoMenu = entradaDados.next();
                if(opcaoMenu.equals("1") || opcaoMenu.equals("2") || opcaoMenu.equals("3")){
                    //System.out.println("Entrou");
                    switch(opcaoMenu){
                        case "1":
                            Gerente gerenteLoja = new Gerente(); //Objeto criado para o programador java
                            //Recebendo os dados através do console e armazenando no objeto gerenteLoja
                            System.out.println("Digite o nome do gerente: ");
                            gerenteLoja.setNome(entradaDados.next());
                            System.out.println("Digite a hora trabalhada: ");
                            gerenteLoja.setSalario(gerenteLoja.calcularSalario(Double.parseDouble(entradaDados.next()),1));
                            System.out.println("Digite a Regional: ");
                            gerenteLoja.setRegional(entradaDados.next());
                            System.out.println("Digite a meta Regional: ");
                            gerenteLoja.setMetaRegional(Double.parseDouble(entradaDados.next()));

                            boolean validaCadastroGerente = repositorioGerenteInterface.salvarGerente(gerenteLoja);
                            if(validaCadastroGerente){
                                System.out.println("...");
                            }else{
                                System.out.println("XXX");
                            }

                            System.out.println("Digite 1 para cadastrar outro Gerente; 2 para listar os Gerentes; 3 para Excluir um Gerente; 4 para Encerrar");

                            opcaoSubMenu = entradaDados.next();

                            if(opcaoSubMenu.equals("1") || opcaoSubMenu.equals("2") || opcaoSubMenu.equals("3") || opcaoSubMenu.equals("4")){
                                switch(opcaoSubMenu){
                                    case "1":
                                        System.out.println("Cadastrar outro Gerente");
                                    break;

                                    case "2":
                                        for(Gerente gerenteLojaItem : repositorioGerenteInterface.listarGerente()){
                                            System.out.println("Nome do Gerente: " + gerenteLojaItem.getNome());
                                            System.out.println("Salario do Gerente c/ Desconto: " + gerenteLojaItem.getSalario());
                                            System.out.println("Regional: " + gerenteLojaItem.getRegional());
                                            System.out.println("Meta Regional: " + gerenteLojaItem.getMetaRegional());
                                            System.out.println("================================================================");
                                        }
                                    break;

                                    case "3":
                                        for(Gerente gerenteLojaItem : repositorioGerenteInterface.listarGerente()){
                                            System.out.println("Id do Gerente" + gerenteLojaItem.getId());
                                            System.out.println("Nome do Gerente: " + gerenteLojaItem.getNome());
                                            System.out.println("Salario do Gerente c/ Desconto: " + gerenteLojaItem.getSalario());
                                            System.out.println("Regional: " + gerenteLojaItem.getRegional());
                                            System.out.println("Meta Regional: " + gerenteLojaItem.getMetaRegional());
                                            System.out.println("================================================================");
                                        }
                                        System.out.println("Por gentileza, digitar o Id desejado para excluir: ");
                                        repositorioGerenteInterface.excluirGerente(entradaDados.next());

                                        for(Gerente gerenteLojaItem : repositorioGerenteInterface.listarGerente()){
                                            System.out.println("Id do Gerente" + gerenteLojaItem.getId());
                                            System.out.println("Nome do Gerente: " + gerenteLojaItem.getNome());
                                            System.out.println("Salario do Gerente c/ Desconto: " + gerenteLojaItem.getSalario());
                                            System.out.println("Regional: " + gerenteLojaItem.getRegional());
                                            System.out.println("Meta Regional: " + gerenteLojaItem.getMetaRegional());
                                            System.out.println("================================================================");
                                        }

                                    break;

                                    case "4":
                                        System.out.println("Programa Encerrado ");
                                        continuar = false;
                                    break;
                                }


                            }else{
                                System.out.println("Opção Inválida");
                            }


                        break;

                        case "2":
                            Coordenador coordenadorLoja = new Coordenador(); //Objeto criado para o programador PHP
                            System.out.println("Digite o nome do coordenador: ");
                            coordenadorLoja.setNome(entradaDados.next());
                            System.out.println("Digite a hora trabalhada: ");
                            coordenadorLoja.setSalario(coordenadorLoja.calcularSalario(Double.parseDouble(entradaDados.next()),2));
                            System.out.println("Digite a Loja: ");
                            coordenadorLoja.setLoja(entradaDados.next());
                            System.out.println("Digite a meta da Loja: ");
                            coordenadorLoja.setMetaLoja(Double.parseDouble(entradaDados.next()));

                            coordenadores.add(coordenadorLoja);

                            System.out.println("Digite 1 para cadastrar outro Coordenador; 2 para listar os Coordenadores; 3 para Encerrar");

                            opcaoSubMenu = entradaDados.next();

                            if(opcaoSubMenu.equals("1") || opcaoSubMenu.equals("2") || opcaoSubMenu.equals("3")){
                                switch(opcaoSubMenu){
                                    case "1":
                                        System.out.println("Cadastrar outro Coordenador");
                                    break;

                                    case "2":
                                        for(Coordenador coordenadorLojaItem : coordenadores){
                                            System.out.println("Nome do Coordenador: " + coordenadorLojaItem.getNome());
                                            System.out.println("Salario do Coordenador c/ Desconto: " + coordenadorLojaItem.getSalario());
                                            System.out.println("Loja: " + coordenadorLojaItem.getLoja());
                                            System.out.println("Meta Loja: " + coordenadorLojaItem.getMetaLoja());
                                            System.out.println("================================================================");
                                        }
                                    break;

                                    case "3":
                                        System.out.println("Programa Encerrado ");
                                        continuar = false;
                                    break;
                                }


                            }else{
                                System.out.println("Opção Inválida");
                            }

                            //Apresentando os dados que foram digitados
                            //System.out.println("Nome do Coordenador: " + coordenadorLoja.getNome());
                            //System.out.println("Salario do Coordenador c/ Desconto: " + coordenadorLoja.getSalario());
                            //System.out.println("Loja: " + coordenadorLoja.getLoja());
                            //System.out.println("Meta Loja: " + coordenadorLoja.getMetaLoja());
                        break;

                        case "3":
                            System.out.println("Programa Encerrado ");
                            continuar = false;
                        break;
                    }

                }else{
                    System.out.println("Opção Inválida");
                }
            }
        }else{
            System.out.println("Login incorreto.");
            if(nomeDigitado.equals(usuario.getNome()) || senhaDigitada.equals(usuario.getSenha())){
                if(nomeDigitado.equals(usuario.getNome())){
                    System.out.println("Nome esta correto, mas a senha esta errada.");
                }else{
                    System.out.println("Senha esta correta, mas o nome esta errado.");
                }
            }
        }
    }
}
