package K_ProjetoPessoas;

public class BAluno extends APessoa {
	
	// Método Construtor
	public BAluno(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributos
	private int matr;
	private String curso;
	
	// Métodos
	public void cancelarMatr() {
		System.out.println("Sua matricula esta cancelada!");
		setMatr(0000);
	}

	
	// Métodos Especiais
	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
