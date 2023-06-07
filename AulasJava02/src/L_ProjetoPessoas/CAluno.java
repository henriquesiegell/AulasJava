package L_ProjetoPessoas;

public class CAluno extends APessoa {

	public CAluno(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
 	}

	// Atributos
	private int matricula;
	private String curso;
	
	// Método
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome() + "!");
	}
	
	
	// Métodos Especiais
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
	
}
