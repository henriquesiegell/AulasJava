package L_ProjetoPessoas;

public class FProfessor extends APessoa {

	public FProfessor(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributos
	private String especialidde;
	private float salario;
	
	// Método
	public void receberAumento() {
		this.setSalario(this.getSalario() + 500);
	}

	// Métodos Especiais
	public String getEspecialidde() {
		return especialidde;
	}

	public void setEspecialidde(String especialidde) {
		this.especialidde = especialidde;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
}
