package K_ProjetoPessoas;

public class DFuncionario extends APessoa {

	// Método Construtor
	public DFuncionario(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributos
	 private String setor;
	 private boolean trabalhando;
	 
	 // Métodos
	 public void mudarTrabalho() {
		 this.trabalhando = ! this.isTrabalhando();
	 }

	// Métodos Especiais 
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	 
	 
}
