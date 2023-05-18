package G_ContaBanco;

import java.util.Scanner;



public class AContaBanco {
	Scanner entrada = new Scanner(System.in);
	
	//Criação de Atributos
	public int numConta;
	protected int tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Criação de Métodos
	public Object abrirConta(){
		System.out.print("Digite 1 para criar CC ou digite 2 para criar CP: ");
		int tipoCCCP = entrada.nextInt();
		
		if (tipoCCCP == 1) {
			System.out.println("Conta Corrente criada com sucesso!");
			this.status = true; // Para conta aberta, o status é true
			
		}  else if (tipoCCCP == 2) {
			System.out.println("Conta Poupança criada com sucesso!");
			this.status = true; // Para conta aberta, o status é true
			
		}	else {
			System.out.println("ERRO! Tente novamente.");
			return abrirConta(); // caso o usuario erre o numero, ele consegue responder novamente
		}
		return tipoCCCP;
		
		
		
	}
	
	
	public int fecharConta() {
		System.out.print("Para fechar a conta digite 1 para prosseguir ou 2 para desistir do cancelamento: ");
		int fechaConta = entrada.nextInt();
		
		if (fechaConta == 1) {
			
			
			if (saldo < 0) {
				System.out.println("Não podemos fechar, você esta devendo.");
			} else if (saldo > 0) {
				System.out.println("Não podemos fechar, você tem saldo na conta.");
			} else {
				System.out.println("Conta fechada com sucesso!");
				this.status = false;
			} 			
		
			
			} else if (fechaConta == 2 ) {
				System.out.println("Obrigado por continuar conosco!");
			} else {
				System.out.println("ERRO! Tente novamente.");
				return fecharConta();
			}
		return fechaConta;
			
		
		
	}
	
	
	public void depositar() {
		
	}
	
	
	public void sacar() {
		
	}
	
	
	public void pagarMensal() {
		
	}
	
	public void status() {
		System.out.println("A sua conta está aberta? " + this.status);
	}
	
	
	
	//Get Set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int Tipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	//Construtor
	
	
	
	
	
	
	
	
	
	
	
	

}
