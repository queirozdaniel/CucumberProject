# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender utilizar cucumber
  Para que eu possa automatizar critérios de aceita��o

  Cenario: Deve executar uma especificação
    Dado que criei arquivo corretamente
    Quando executa-lo
    Entao a especificação deve finalizar com sucesso
	
	Cenario: Deve incrementar contador
		Dado que o valor do cantador é 15
		Quando eu imcrementar em 3
		Entao o valor do cantador será 18
		
	Cenario: Deve incrementar contador
		Dado que o valor do cantador é 30
		Quando eu imcrementar em 3
		Entao o valor do cantador será 33
	
	Cenario: Deve calcular atraso na entrega
		Dado que a entrega é dia 05/04/2018
		Quando a entrega atrasar em 2 dias
		Entao a entrega será efetuada em 07/04/2018
		
	Cenario: Deve calcular atraso na entrega da China
		Dado que a entrega é dia 05/04/2018
		Quando a entrega atrasar em 2 meses
		Entao a entrega será efetuada em 05/06/2018