package E_Caneta;

public @interface _MetodosEspeciais {

	/*
	 
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
	  	
	 
	 */
	
	
}
