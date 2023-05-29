package H_ControleRemoto;

public @interface _Encapsulamento {

	/*
	 
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
	 		 									
	 		 									
	 
	 */
	
}
