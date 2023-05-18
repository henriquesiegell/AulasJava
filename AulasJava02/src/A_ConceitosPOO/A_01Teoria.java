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
 		
 		
----------------------------------------------------------------------------------------------------------------------------------------------------------
 		
	  		  
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
	  	
	  	
----------------------------------------------------------------------------------------------------------------------------------------------------------	  	
	  
	     
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
	  		
	  		
----------------------------------------------------------------------------------------------------------------------------------------------------------	  	

	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	 */
	
	
	

}
