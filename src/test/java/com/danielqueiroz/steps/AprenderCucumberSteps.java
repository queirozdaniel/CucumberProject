package com.danielqueiroz.steps;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {
	
	@Dado("que criei arquivo corretamente")
	public void que_criei_arquivo_corretamente() {
	}

	@Quando("executa-lo")
	public void executa_lo() {
	}

	@Entao("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {
	}

	private int contador = 0;

	@Dado("que o valor do cantador é {int}")
	public void que_o_valor_do_cantador_é(Integer int1) {
		contador = int1;
	}

	@Quando("eu imcrementar em {int}")
	public void eu_imcrementar_em(Integer int1) {
		contador += int1;
	}

	@Entao("o valor do cantador será {int}")
	public void o_valor_do_cantador_será(Integer int1) {
		int valor = int1;

		Assertions.assertEquals(valor, contador);
	}

	Date entrega = new Date();

	@Dado("que a entrega é dia {int}\\/{int}\\/{int}")
	public void que_a_entrega_é_dia(Integer dia, Integer mes, Integer ano) {
		entrega = returnDate(dia, mes, ano).getTime();
	}

	@Quando("a entrega atrasar em {int} {word}")
	public void a_entrega_atrasar_em_dias(Integer arg, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias") || tempo.equals("dia")) {
			cal.add(Calendar.DAY_OF_MONTH, arg);
		} else if (tempo.equals("meses") || tempo.equals("mes")) {
			cal.add(Calendar.MONTH, arg);
		}
		entrega = cal.getTime();
	}

	// Regex
	@Entao("a entrega será efetuada em {date}")
	public void a_entrega_será_efetuada_em( Date date) {
//		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		String dataEntregaFormatada = format.format(entrega);
//		Assertions.assertEquals(data, dataEntregaFormatada);
		System.out.println(date);
	}

	private Calendar returnDate(int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		return cal;
	}

	// Desafio
	@Dado("^que o ticket( especial)? é (A\\w{1}\\d{3})$")
	public void que_o_ticket_é(String tipo, String data) {
	}

	@Dado("que o valor da passagem é R$ {double}")
	public void que_o_valor_da_passagem_é_r$(Double valor) {
		Format format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		String valorFormatado = format.format(valor);
//		Assertions.assertEquals("230.45", valor);
	}

	@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
	public void que_o_nome_do_passageiro_é(String string) {
		Assertions.assertNotNull(string);
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void que_o_telefone_do_passageiro_é(String telefone) {
	}

	@Quando("criar os steps")
	public void criar_os_steps() {
	}

	@Entao("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	}

}
