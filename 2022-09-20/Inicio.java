import java.util.Scanner;

public class Inicio{

    public static void main (String [] args){
        Usuario usuario = new Usuario(); //Criando uma variavel do tipo usuario - Instanciando
        String nomeDigitado;
        String senhaDigitada;
        String opcaoMenu = "0";

        Scanner entradaDados = new Scanner(System.in); //Objeto criado para obter os dados digitados em tela
        Gerente gerenteLoja = new Gerente(); //Objeto criado para o programador java
        Coordenador coordenadorLoja = new Coordenador(); //Objeto criado para o programador PHP


        //System.out.println(usuario.getNome());
        //System.out.println(usuario.getSenha());

        System.out.println("Digite o usuario: ");
            nomeDigitado = entradaDados.next();
        System.out.println("Digite a senha: ");
            senhaDigitada = entradaDados.next();

        if(nomeDigitado.equals(usuario.getNome()) && senhaDigitada.equals(usuario.getSenha())){
            System.out.println("Login realizado com sucesso.");
            System.out.println("Digite 1 para Gerente; 2 para Coordenador");
            opcaoMenu = entradaDados.next();
            if(opcaoMenu.equals("1") || opcaoMenu.equals("2")){
                System.out.println("Entrou");
                switch(opcaoMenu){
                    case "1":
                        //Recebendo os dados através do console e armazenando no objeto gerenteLoja
                        System.out.println("Digite o nome do gerente: ");
                        gerenteLoja.setNome(entradaDados.next());
                        System.out.println("Digite a hora trabalhada: ");
                        gerenteLoja.setSalario(gerenteLoja.calcularSalario(Double.parseDouble(entradaDados.next()),1));
                        System.out.println("Digite a Regional: ");
                        gerenteLoja.setRegional(entradaDados.next());
                        System.out.println("Digite a meta Regional: ");
                        gerenteLoja.setMetaRegional(Double.parseDouble(entradaDados.next()));
                        //Apresentando os dados que foram digitados
                        System.out.println("Nome do Gerente: " + gerenteLoja.getNome());
                        System.out.println("Salario do Gerente c/ Desconto: " + gerenteLoja.getSalario());
                        System.out.println("Regional: " + gerenteLoja.getRegional());
                        System.out.println("Meta Regional: " + gerenteLoja.getMetaRegional());



                    break;

                    case "2":
                        System.out.println("Digite o nome do coordenador: ");
                        coordenadorLoja.setNome(entradaDados.next());
                        System.out.println("Digite a hora trabalhada: ");
                        coordenadorLoja.setSalario(gerenteLoja.calcularSalario(Double.parseDouble(entradaDados.next()),2));
                        System.out.println("Digite a Loja: ");
                        coordenadorLoja.setLoja(entradaDados.next());
                        System.out.println("Digite a meta da Loja: ");
                        coordenadorLoja.setMetaLoja(Double.parseDouble(entradaDados.next()));
                        //Apresentando os dados que foram digitados
                        System.out.println("Nome do Coordenador: " + coordenadorLoja.getNome());
                        System.out.println("Salario do Coordenador c/ Desconto: " + coordenadorLoja.getSalario());
                        System.out.println("Loja: " + coordenadorLoja.getLoja());
                        System.out.println("Meta Loja: " + coordenadorLoja.getMetaLoja());
                    break;
                }

            }else{
                System.out.println("Opção Inválida");
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
