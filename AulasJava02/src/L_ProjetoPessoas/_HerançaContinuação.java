package L_ProjetoPessoas;

public @interface _HerançaContinuação {

	/*
	 
	 
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
