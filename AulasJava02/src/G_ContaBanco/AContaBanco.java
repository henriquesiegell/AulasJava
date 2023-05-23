package G_ContaBanco;

import java.util.Scanner;

public class AContaBanco {
	Scanner entrada = new Scanner(System.in);
	
	//Criação de Atributos
	public int numConta;
	protected int tipo;
	private String dono;
	private float saldo;
	private float pagMensal;
	private boolean status;
		
	
	//Construtor
	public AContaBanco(float saldo, boolean status) {
			this.saldo = 0;
			this.status = false;
	}
	
	
	//Criação de Métodos
	public void estadoAtual() {
		System.out.println("---------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$" + getSaldo());
		System.out.println("Status: " + isStatus());
		System.out.println("---------------------------------------------");
		
	}
	
	
	public Object abrirConta(){		
		System.out.print(this.dono + ", digite 1 para criar CC ou digite 2 para criar CP: ");
		int tipoCCCP = entrada.nextInt();
		System.out.println();
		
		if (tipoCCCP == 1) {						
			System.out.println("Conta Corrente criada com sucesso!");
			System.out.println();
	
			this.setStatus(true); // Para conta aberta, o status é true
			this.setSaldo(50);
			this.setTipo(1);
			
			
			
			
		}  else if (tipoCCCP == 2) {
			System.out.println("Conta Poupanca criada com sucesso!");			
			System.out.println();
			
			this.status = true; // Para conta aberta, o status é true
			this.setSaldo(150);
			this.setTipo(2);
			
			
		}	else {
			System.out.println("ERRO! Tente novamente.");
			System.out.println();
			return abrirConta(); // caso o usuario erre o numero, ele consegue responder novamente
		}
		return tipoCCCP;
		
	}
	
	
	public int fecharConta() {
		System.out.print(this.dono + ", para fechar a conta digite 1 para prosseguir ou 2 para desistir do cancelamento: ");
		int fechaConta = entrada.nextInt();
		
		if (fechaConta == 1) { // para fechar uma conta não pode ter dinheiro e nem dever na conta
			
			if (this.getSaldo() < 0) {
				System.out.println("Não podemos fechar, você esta devendo.");
				System.out.println();
				this.status = true;
			} else if (this.getSaldo() > 0) {
				System.out.println("Não podemos fechar, você tem saldo na conta.");
				System.out.println();
				this.status = true;
			} else {
				System.out.println("Conta fechada com sucesso!");
				System.out.println();
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
		System.out.print(this.dono + ", qual valor do deposito? R$");
		float depositoConta = entrada.nextFloat();
		
		if (this.isStatus() == true) {
			 
			this.setSaldo(this.getSaldo() + depositoConta);
			System.out.println("Deposito realizado com sucesso! Seu saldo agora eh de R$" + this.saldo);
			
			
		} else {
			System.out.println("Nao da para depositar, voce ainda nao tem conta.");
		}
	}
	
	
	public void sacar() {
		System.out.print(this.dono + ", qual valor do saque: R$");
		float saque = entrada.nextFloat();
		
		if (this.status == true) {
			if (saque <= getSaldo()) {
				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Saque feito com sucesso!");

			} else {
				System.out.println("ERRO! Saldo insuficiente.");
			}
		} else {
			System.out.println("ERRO! Voce nao tem conta.");
		}
	}
	
	
	public void pagarMensal() {
		if (this.getTipo() == 1) {
			this.setPagMensal(this.getSaldo() - 12);
			System.out.println("O valor do pagamento eh de R$12,00 e o saldo ficou em R$" + this.saldo );
			System.out.println();
			
		} else  {
			this.setPagMensal(this.getSaldo() - 20);
			System.out.println("O valor do pagamento eh de R$20,00 e o saldo ficou em R$" + this.saldo);
			System.out.println();
		} 
	}
	
	
	public void status() {
		if (this.status == false) {
			System.out.println("Sua conta esta fechada!");
			System.out.println();
		} else {
			System.out.println("Sua conta esta aberta!");
			System.out.println();
		}
		
		
	}
	
	
	public void numConta() {
		System.out.println("O numero da sua conta eh " + this.numConta);
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


	public float getPagMensal() {
		return pagMensal;
	}


	public void setPagMensal(float pagMensal) {
		this.pagMensal = pagMensal;
	}


	public int getTipo() {
		return tipo;
	}
	
	
	

	
	
	
	

	

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


