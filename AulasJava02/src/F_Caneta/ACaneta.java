package F_Caneta;

public class ACaneta {

	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	
	public ACaneta(String m, String c, float p) {	// Este é o Método Construtor
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampar();
		
	}
	
	public String getModelo() { 
		return this.modelo;
	}
	
	public void setModelo(String m) { 
		this.modelo = m; 
	}					 
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Esta tampada? " + this.tampada);
	}
	
	
} 


