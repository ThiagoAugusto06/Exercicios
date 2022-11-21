//Classe Programador
public class Funcionario{

    private String nome; //Variável local
    private Double salarioliquido; //Variável local
    private String cpf; //Variável Local

    //Acesso às variáveis locais
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Double getSalario(){
        return salarioliquido;
    }

    public void setSalario(Double salarioliquido){
        this.salarioliquido = salarioliquido;
    }

    public Double calcularSalario(Double horaTrabalhada, int tipoFuncionario){
        
    	if(tipoFuncionario == 1) {
    		Double salarioliquido = 60 * horaTrabalhada;
    		salarioliquido = salarioliquido - (salarioliquido * 0.15);
            return salarioliquido;    		
    	}else {
    		Double salarioliquido = 40 * horaTrabalhada;
    		salarioliquido = salarioliquido - (salarioliquido * 0.07);
            return salarioliquido;    		
    	}
    	
    }

}
