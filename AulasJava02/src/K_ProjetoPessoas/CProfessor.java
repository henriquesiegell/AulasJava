package K_ProjetoPessoas;

public class CProfessor extends APessoa {

	// Método Construtor
	public CProfessor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributos
	private String especialidade;
	private float salario;
	
	// Métodos
	public void receberAum() {
		setSalario(this.getSalario() + 500);
	}

	
	// Métodos Especiais
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
