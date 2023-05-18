package E_Caneta;

public class ACaneta {
	
	public String modelo;
	private float ponta;
	
	
	public String getModelo() {
		return this.modelo; // Esse Retorne ele vai retonar o modelo que é um Atributo
	}
	
	public void setModelo(String m) { // Recebe um parâmetro que é do mesmo Tipo(String) do Atributo modelo
		this.modelo = m; // O setModelo recebe ""m"" que é String. String por sua vez que é o mesmo Tipo de Modelo que é o Atributo que o
	}					 //  Método SET(ter) ta mexendo
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
	}
	
	
	

}
