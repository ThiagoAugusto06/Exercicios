
import java.util.List;
import java.util.ArrayList;

public class RepositorioGerenteInterface implements GerenteInterface{

    private List<Gerente> listaIdGerente = new ArrayList<>();

    public boolean salvarGerente(Gerente gerenteLoja){
        int idContador;
        idContador = listaIdGerente.size() + 1; //conta quantos itens tem na lista
        String id = Integer.toString(idContador); //convertendo o Int para o String
        gerenteLoja.setId(id);

        try{
            listaIdGerente.add(gerenteLoja);
        }catch(Exception e){
            System.out.println("Erro ao incluir o registro");
            return false;
        }
        return true;
    }

    public List<Gerente> listarGerente(){
        return this.listaIdGerente;

    } //Listar


    public boolean excluirGerente(String id){
        boolean resposta = false;

        Gerente gerenteExcluir = new Gerente();

        for(Gerente gerente : listaIdGerente){
            if(gerente.getId().equals(id)){
                gerenteExcluir = gerente;
                break;
            }
        }
        try{
            listaIdGerente.remove(gerenteExcluir);
            resposta = true;
        }catch(Exception e){
            System.out.println("Erro ao excluir");
        }
        return resposta;
    }
}
