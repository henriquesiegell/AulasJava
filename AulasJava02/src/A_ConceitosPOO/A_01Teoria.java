package A_ConceitosPOO;

public class A_01Teoria {
	
	/*
	 
	 
	  	Objeto: Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas 
	  	características, comportamento e estado atual.
	  	Ex: relógio, carro, relógio
	  	
	  	
	  	Classe: São projetos de um objeto, aonde têm características e comportamentos, e permite armazenar atributos e 
	  	métodos dentro dela. 
	  	Ex:	  
	  		  		  	
	  	Atributos:
	  	
	  	- Modelo: String BIC
	  	- Cor: String Azul
	  	- Ponta: float 0.5
	  	- Carga: int 100%
	  	- Tampada: boolean verdadeiro
	  	
 		Métodos:
 		
 		- Escrever
 		- Rabiscar
 		- Pintar
 		- Tampar
 		- Destampar
 		
 		-------Instanceamento-------
 		
 		Objeto: Caneta Azul
 		
 		
 		Classe: Define os Atributos e Métodos comuns que serão compartilhados por um Objeto.
 		 
 		Objeto: É a Instância de uma Classe.
 		
 		Instanciamento: Quando você pega uma Classe e consegue gerar um Objeto.
 		
 		Abstração: !!!
 		
 		
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------	 		
	  	
	  		  
	  	UML -  Linguagem de Modelagem Unificada
	  	
	  	--> Diagrama de Classes
	  		- Pensar como se fosse um retângulo.
	  		- Consiste em uma nova maneira de pensar. Tudo fica mais fácil de implementar e explicar se compararmos o projetos com Objetos do mundo real.
	  		  Tudo no mundo é um Objeto, ou é passível implementar como se fosse um.
	  	
	  	--> O nome da Classe vai começar sempre com uma letra maiúscula e no cabeçalho do retângulo.
	  		Ex: Caneta
	  	--> O nome dos Atributos vai começar com letra minúscula e no corpo central do retângulo.
	  		Ex: modelo, cor, ponta, etc
	  	--> O nome dos métodos tambbém vai começar com letra minúscula e no corpo inferior.
	  		Ex: escrever(), rabiscar(), pintar(), etc
	  		
	  	
	  	Modificadores de Visibilidade - Indicam o nível de acesso aos componentes internos de uma Classe (Atributos e Métodos).
	  	
	  	--> Público(+) - Visibilidade pública
	  	Ex: Orelhão
	  	- Trazendo para a realidade da POO: Todo Atributo ou Método definido como público, ele vai definir que a classe atual e todas as outras classes 
	  	podem ter acesso a ela. 
	  	
	  	--> Privado(-) - Visibilidade privada	
	  	Ex: Celular
	  	- Trazendo para a realidade da POO: Todo Atributo ou Método definido como privado só a classe atual pode mexer nele. 
	  	
	  	--> Protegido(#) - Visibilidade protegida	
	  	Ex: Telefone Residencial
	  	- Ela da acesso a classe atual e a todas as suas sub-classes.
	  	
	  	Ex:
	  	
	  	Atributos:
	  	
	  	+ modelo
	  	+ cor
	  	- ponta
	  	# carga
	  	# tampada
	  	
	  	Métodos
	  	
	  	+ escever()
	  	+ rabiscar()
	  	+ pintar()
	  	- tampar
	  	- destampar()
	  	
	  	
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------		  
	     
	     
	  	Métodos Especiais:
	  		  
	  	--> Métodos Acessores ou Método GET(ters) 
	  		- São Métodos que você pode pegar ou dar acesso a uma determinada coisa.
	  		  
	  	--> Métodos Modificadores ou Método SET(ters)
	  	    - São Métodos que modificam coisas dentro do Objeto, garantindo total segurança do Atributo, pois não deixa as pessoas mexerem diretamente 
	  	    no Atributo.
	  	
	  	Ex:
	  	
	  	Caneta
	  	
	    + modelo
	    - ponta
	    
	    + getModelo()
	  	+ setModelo(m)
	  	+ getPonta()
	  	+ setPonta(p) 
	  	
	  	
	  	Classe Caneta
	  		publico modelo: String
	  		privado ponta: float
	  		
	  		publico Metodo getModelo()
	  				retorne modelo
	  		
	  		FimMetodo
	  		
	  		publico Metodo setModelo
	  				(m: String)
	  			modelo = m
	  		
	  		FimMetodo
	  		
	  		publico Metodo getPonta()
	  		
	  		FimMetodo
	  		
	  		publico Metodo setPonta(p)
	  				(p: float)
	  			ponta = p
	  			
	  		FimMetodo
	  		
	  		
	  	FimClasse
	  	
	  	c1 = nova caneta
	  	c1.setModelo("BIC CRISTAL")
	  	c1.setPonta(0.5)
	  	Escreva (c1.getModelo())
	  	Escreva (c1.getModelo())	
	  	
	  	
	  	--> Método Construtor
	  		- Criam e inicializam Objetos que ainda não existem.
	  		
	  		
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------	  	

		
		Pilares da POO: 
	 
	 	- Encapsulamento --> lembra de cápsula
	 		- Um software Encapsulado tem um mesmo padrão e protege o usuário(programador) do código e o código do usuário(programador);
	 	
	 		- Um código Encapsulado não deixa o programador fazer besteira, o programador não vai conseguir prejudicar o código;
	 	
	 		- Um código Encapsulado usa inteface, ele usa moldes padrões e esses moldes padrões eles fazem com que o código que ta la dentro não importe, não importa
	 		como eu faço o código, o que importa eh que o resultado seja sempre o mesmo.
	 	
	  		- Encapsular: ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.  
	 	
	 		- Interfaces: Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um Objeto de 
	 		uma Classe.
	 	
	 		- Na POO você consegue conversar com a capsula (você consegue conversar com  os Objetos);
	 	
	 		- A troca de informações do mundo exterior e de um Objeto é chamado de Mensagem;
	 			- A gente manda msg pra capsula e ela responde.
	 		
	 	VANTAGENS:
	 	- Tornar mudanças invisíveis; 
	 		--> Depois do código todo pronto, o código é mais propenso a sofrer manutenções. Com o Encapsulamento, isso passa a ser mais fácil devida a proteção
	 		de acesso aos dados, o programador vai achar  mais rápido o erro que precisa ser corrigido.
	 		
	 	- Facilitar a reutilização do código;
	 		--> Com o Encapsulamento, o programa terá mais chances de ter o código reaproveitado em outros projetos, poupando bastante tempo da equipe 
	 		de desenvolvimento.
	 		
	 	- Reduzir efeitos colaterais;
	 		--> O Encapsulamento protege alguns códigos em uma espécie de caixa preta. Isso significa que as Classes externas não precisam acessar alguns dados 
	 		de forma direta, deixando o desenvolvimento dos sistemas mais simplificado e acelerado.
	 	
	 	
	 	Ex: 
	 	
	 		<<Interface>>
	 		 Controlador
	 		 
	 		 Métodos Abstratos: é aquele método que não vão ser desenvolvidos na Interface, eu não escrevo o código do Método na Interface, eu so vou dizer que vai 
	 		 	||	existir tal Método ali. Geralmente, todos 
	 		 	|| 
	 		 	\/
	 		 + ligar()									
	 		 + desligar()
	 		 + abrirMenu()
	 		 + fecharMenu()
	 		 + maiVolume()
	 		 + menosVolume()
	 		 + ligarMudo()
	 		 + play()
	 		 + mouse()
	 		 									  <<Classe>>
	 				|							Controle Remoto
	 				|							
	 				|							Atributos: Para o encapsulamento, todos os Atributos devem estar privados ou protegidos para que nenhum externo 
	 				|										mexa nos Atributos.
	 				|							- volume
	 				|							- ligado 
	 				|							- tocando
	 				|							
	 				|							Métodos:
	 				|
	 				|							+ ligar()									
	 		 		|							+ desligar()
	 		 		|							+ abrirMenu()
	 		 		|--------------------->		+ fecharMenu()
	 		 		preciso colocar os Métodos 	+ maisVolume()
	 		 		da Interface na Classe.		+ menosVolume()
	 		 									+ ligarMudo()
	 		 									+ play()
	 		 									+ mouse()
	 		 									- setVolume()
	 		 		------------------------>	- getVolume()
	 		 		Não é obrigatório que os 	- setLigado()
	 		 		Métodos internos sejam 		- getLigado()
	 		 		privados.					- setTocando()
	 		 									- getTocando()
	 		 									
	 		 									
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	  		
	  		
	  Relacionamento entre Classes
	  		
	  		
		 						ligação entre as Classes
		 Classe Lutador -------------------------------------- Classe Luta 
		 					é uma relação do tipo Agregação
		 					
		 
		 A Relação de Agregação mostra um classificador como parte ou como subordinado a outro classificador (Lutador e Luta)
		 	 
	 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	  		
	  	 
	 Herança --> Permite basear uma nova Classe na definição de outra Classe previamente existente.
	 			--> A Herança será aplicada tanto para as características, quanto para os comportamentos.
	 
	 Ex: 
	 		Aluno								Professor						Funcionario
	 	
	 	- nome									- nome							- nome		
	 	- idade									- idade							- idade	
	 	- sexo									- sexo							- sexo
	 	- matr									- especialidade					- setor
	 	- curso									- salario						- trabalhando
	 	
	 	+ fazerNiver()							+ fazerNiver()					+ fazerNiver()
	 	+ cancelarMatr()						+ receberAum()					+ mudarTrabalho()
	 	
	 	
	 	--> Todas as Classes compartilham algumas características
	 	--> Para melhorar o código, devemos criar uma nova Classe com o Atributos e Métodos que tenham em comum
	 	
	 
	 Ex:
			Pessoa				 		Aluno								Professor						Funcionario
								 	
		- nome					 	- matr									- especialidade					- setor
		- idade					 	- curso									- salario						- trabalhando
		- sexo					 												
								 	+ cancelarMatr()						+ receberAum()					+ mudarTrabalho()
		+ fazerNiver()			 											
		
		
		
		--> Existem dois tipo de Herança:
			
			- Herança de Implementação(Herança Pobre): O objetivo é reutilizar código, ou seja, a classe filha já nasce com as funcionalidades
			de sua progenitora
			
			- Herança para Diferença: Programação por diferença significa herdar uma classe e adicionar apenas o código que torne a nova 
			classe diferente da classe herdada. 
			
				Ex:	
											nome
									Pessoa	idade
											sexo
											fazerNiver()
							     --------/\-------
					 	 		 |	   	 |		 | 	  
								 |		 |		 |	   especialidade
							 	 |	   	 |	Professor  salario
						    Visitante 	 |	 		   receberAumento()
									  	 |	
									  	 |		
									  	 |		matricula
									   Aluno	curso
												*pagarMensalidade()*
							
								----------/\----------
								|					 |
			bolsa				|					 |		registroProfissional
			renovarBolsa()	Bolsista			  Técnico	praticar()
			*pagarMensalidade()*
			  	|
			  	|- Sobrescrição
			  	
			  											 	
		--> Classe Abstrata - Não pode gerar objetos. Só pode servir como progenitora.
		
		--> Método Abstrato - Declarado, mas não implementado na progenitora.
		
		--> Classe Final - Não pode ter "Filhos". Ela é obrigatoriamente Folha.
		
		--> Método Final - Ele é obrigatoriamente Herdado. 
	 
	  
	 
		--> Existem dois tipo de Herança:
			
			- Herança de Implementação(Herança Pobre): O objetivo é reutilizar código, ou seja, a classe filha já nasce com as funcionalidades
			de sua progenitora
			
			- Herança para Diferença: Programação por diferença significa herdar uma classe e adicionar apenas o código que torne a nova 
			classe diferente da classe herdada. 
			
				Ex:	
											nome
									Pessoa	idade
											sexo
											fazerNiver()
							     --------/\-------
					 	 		 |	   	 |		 | 	  
								 |		 |		 |	   especialidade
							 	 |	   	 |	Professor  salario
						    Visitante 	 |	 		   receberAumento()
									  	 |	
									  	 |		
									  	 |		matricula
									   Aluno	curso
												*pagarMensalidade()*
							
								----------/\----------
								|					 |
			bolsa				|					 |		registroProfissional
			renovarBolsa()	Bolsista			  Técnico	praticar()
			*pagarMensalidade()*
			  	|
			  	|- Sobrescrição
			  	
			  											 	
		--> Classe Abstrata - Não pode gerar objetos. Só pode servir como progenitora.
		
		--> Método Abstrato - Declarado, mas não implementado na progenitora.
		
		--> Classe Final - Não pode ter "Filhos". Ela é obrigatoriamente Folha.
		
		--> Método Final - Ele é obrigatoriamente Herdado. 
	 
	 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	 
	 
	 Poli = muitas / Morfo = formas
	 
	 Polimorfismo --> Permite que um mesmo nome represente vários comportamentos diferentes.
	 
	 
	 Assinatura do Método --> Tem a Quantidade e os Tipos dos parâmetros.
	 
	 Ex:
	 		*calcMedia (n1: Real,
	 				   n2: Real)*: Real		
	 							              --> Tem a mesma Assinatura
	 		*calcMedia (n1: Real,
	 				   n2: Real)*: Inteiro
	 				   
	 		calcMedia (bim: Inteiro,
	 				   n1: Real,			 --> Não tem a mesma assinatura que o resto
	 				   n2: Real): Real		   
	 
	 		
	 --> Existem dois tipo de Polimorfismo:
	 
	 	- Sobreposição: Acontece quando substituimos um Método de uma Superclasse na sua Subclasse, usando a mesma Assinatura.
	 	
	 	Ex: 
	 			Mamífero
	 			 emitirSom()
	 			 "Som de mamífero"
	 				|
	 				|
	 				|
	 			   Lobo
	 			    emitirSom()
	 			    "Aauuuuuu"
	 			   	|
	 			   	|
	 			   	|
	 			 Cachorro
	 			  emitirSom()
	 			  "Au! Au!
	 			  
	 
	 - Sobrecarga: Permite que um método de determinado nome tenha comportamentos distintos, em função de diferentes parâmetros 
	 	que ele recebe.
	 	
	 	Ex:
	 			Cachorro
	 	
	 	falar frase --> agradável: abanar e latir
	 	 				agressiva: rosnar
	 	
	 	horário do dia --> manhã: abanar
	 					   tarde: abanar e latir
	 					   noite: ignorar
	 	
	 	dono --> é dono: abanar
	 			 não é: rosnar e latir
	 
	 	
	 */

}
