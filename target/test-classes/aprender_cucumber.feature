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
		