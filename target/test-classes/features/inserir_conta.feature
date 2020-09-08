#language: pt
Funcionalidade: Cadastro de contas
	Como um usuário 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada

	Cenario: Deve inserir uma conta com sucesso
		Dado que estou acessando a aplicação
		Quando informo o usuário "daniel@as"
		E a senha "abc"
		E seleciono entrar
		Entao visualizo a página inicial
		Quando seleciono Contas
		E seleciono Adicionar
		E informo a conta "Conta de Teste"
		E seleciono Salvar
		Entao a conta é inserida com sucesso
	
	@ignore
	Cenario: Não deve inserir uma conta sem nome
		Dado que estou acessando a aplicação
		Quando informo o usuário "daniel@as"
		E a senha "abc"
		E seleciono entrar
		Entao visualizo a página inicial
		Quando seleciono Contas
		E seleciono Adicionar
		E seleciono Salvar
		Entao sou notificar que o nome da conta é obrigatório
	
	@ignore
	Cenario: Não deve inserir uma conta com nome já existente
		Dado que estou acessando a aplicação
		Quando informo o usuário "daniel@as"
		E a senha "abc"
		E seleciono entrar
		Entao visualizo a página inicial
		Quando seleciono Contas
		E seleciono Adicionar
		E informo a conta "Conta de Teste"
		E seleciono Salvar
		Entao sou notificado que já existe uma conta com esse nome
