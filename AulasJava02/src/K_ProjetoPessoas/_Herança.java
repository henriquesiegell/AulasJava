package K_ProjetoPessoas;

public @interface _Herança {

	/*
	 
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
	 
	 
	 
	 
	 
	 
	 */
	
}
