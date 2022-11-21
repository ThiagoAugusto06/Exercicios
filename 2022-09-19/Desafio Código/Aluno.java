
//Classe Aluno
//Autor: Thiago Augusto - Aula 19-09
Class Aluno Extends Pessoa{
    private String strTurma;
    private String strAdvertencia;
    private Int intTempoAdvertencia;

    //Construtor
    public Aluno(String cpf, String nome){
        super(nome, cpf);
    }

    public void setTurma(String strTurma) {
            this.strTurma = strTurma;
    }

    public void setAdvertencia(String strAdvertencia) {
            this.strAdvertencia = strAdvertencia;
    }

    public void setTempoAdvertencia(String intTempoAdvertencia) {
            this.intTempoAdvertencia = intTempoAdvertencia;
    }

	public String getTurma() {
		return strTurma;
	}

	public String getAdvertencia() {
		return strAdvertencia;
	}

    public Int getTempoAdvertencia() {
		return intTempoAdvertencia;
	}

}
