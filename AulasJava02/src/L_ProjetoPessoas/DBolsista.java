package L_ProjetoPessoas;

public class DBolsista extends CAluno {

	public DBolsista(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Atributo
	private float bolsa;
	
	// Métodos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " eh bolsista! Pagamento facilitado.");
	}

	
	// Métodos Especiais
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}
