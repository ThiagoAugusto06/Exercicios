
//Classe Professor
//Autor: Thiago Augusto - Aula 19-09
Class Professor Extends Pessoa{
    private String strDisciplina;
    private String strSalario;
    private Int intTempodeCasa;

    //Construtor
    public Professor(String cpf, String nome){
        super(nome, cpf);
    }

    public void setDisciplina(String strDisciplina) {
            this.strDisciplina = strDisciplina;
    }

    public void setSalario(String strSalario) {
            this.strSalario = strSalario;
    }

    public void setTempodeCasa(String intTempodeCasa) {
            this.intTempodeCasa = intTempodeCasa;
    }

	public String getDisciplina() {
		return strDisciplina;
	}

	public String getSalario() {
		return strSalario;
	}

    public Int getTempodeCasa() {
		return intTempodeCasa;
	}

}
