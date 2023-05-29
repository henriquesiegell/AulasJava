package I_UEC;

import java.util.Random;

public class CLuta  {

	private BLutador desafiado;
	private BLutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	// Métodos
	public void marcarLuta(BLutador l1, BLutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	
	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			System.out.println();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			switch(vencedor) {
			case 0: // Empate
				System.out.println("Empatou!");
				System.out.println();
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1: // Desafiado vence
				System.out.println("Vitoria do " + this.getDesafiado().getNome() + "!");
				System.out.println();
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:	// Desafiante Vence
				System.out.println("Vitoria do " + this.getDesafiante().getNome() + "!");
				System.out.println();
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}
		} else {
			System.out.println("A luta nao pode acontecer!");
			System.out.println();
		}
		
		
	}
	
	
	// Métodos Especias
	public BLutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(BLutador l1) {
		this.desafiado = l1;
	}
	public BLutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(BLutador l2) {
		this.desafiante = l2;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	
	
	
	
	
}
