package L_ProjetoPessoas;

public class ETecnico extends CAluno {

	public ETecnico(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributo
	private int registroProfissional;
	private String cursoTecnico;
	
	
	// Método
	public void praticar() {
		System.out.println("Pronto, consegui arrumar!");
	}

	// Métodos Especiais
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public String getCursoTecnico() {
		return cursoTecnico;
	}

	public void setCursoTecnico(String cursoTecnico) {
		this.cursoTecnico = cursoTecnico;
	}
	
	
	
	
	
	
}
