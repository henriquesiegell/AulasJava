package H_ControleRemoto;

public class BControlador implements AControlador { // Para implementar, basta digitar "implements"
													// e deixar a IDE implementar os Métodos Abstratos automaticamente 

	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos Especiais
	
	public BControlador(int volume, boolean ligado, boolean tocando) {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Métodos Abstratos
	@Override 
	public void ligar() {
		this.setLigado(true);
	}


	@Override
	public void desligar() {
		this.setLigado(false);
	}


	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		
	}


	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}


	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossivel aumentar volume");
		}
	}


	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossivel diminuir volume");
		}
			
	}


	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}


	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}


	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Nao consegui reproduzir");
		}
	}


	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
	} else {
		System.out.println("Nao consegui pausar");
	}
	
	
	
	}
	
	
}
