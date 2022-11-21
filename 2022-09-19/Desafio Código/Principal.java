
//Classe Principal
//Autor: Thiago Augusto - Aula 19-09
public class Principal{
	public static void main(String[] args){

		Professor professor1 = new Professor("Luciano - Impacta" , "123.456.789-00");
		professor1.setDisciplina("Java");
		professor1.setSalario("R$19.330,27");
        professor1.setTempodeCasa(4)

		Aluno aluno1 = new Aluno("Thiago Augusto" , "123.654.321-00");
		aluno1.setTurma("Java - Acelera Sênior");
		aluno1.setAdvertencia("Programando e colando");
        aluno1.setTempoAdvertencia(2);

		System.out.println("Primeiro Desafio Acelera Sênior!");
		System.out.println("Professor: " + professor1.getNome());
		System.out.println("CPF: " + professor1.getCpf());
		System.out.println("Disciplina: " + professor1.getDisciplina());
		System.out.println("Salário: " + professor1.getSalario());
        System.out.println("Tempo de Casa:" + professor1.getTempodeCasa() + " anos");
		System.out.println("");
		System.out.println("Aluno: " + aluno1.getNome());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Turma: " + aluno1.getTurma());
		System.out.println("Advertência: " + aluno1.getAdvertencia());
        System.out.println("Tempo de Advertência: " + aluno1.getTempoAdvertencia() + " dias")
}
}
