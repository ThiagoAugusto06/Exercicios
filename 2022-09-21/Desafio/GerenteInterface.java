import java.util.List;
import java.util.ArrayList;

public interface GerenteInterface{

    public boolean salvarGerente(Gerente gerenteLoja); //Salvar
    public List<Gerente> listarGerente(); //Listar
    public boolean excluirGerente(String id);


}
