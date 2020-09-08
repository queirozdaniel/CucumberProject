package com.danielqueiroz.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;

import com.danielqueiroz.locadora.entidades.Filme;
import com.danielqueiroz.locadora.entidades.NotaAluguel;
import com.danielqueiroz.locadora.entidades.TipoAluguel;
import com.danielqueiroz.locadora.service.AluguelService;
import com.danielqueiroz.locadora.utils.DateUtils;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AlugarFilmesSteps {

	private Filme filme;
	private AluguelService aluguelService = new AluguelService();
	private NotaAluguel notaAluguel;
	private String erro;
	private TipoAluguel tipoAluguel = TipoAluguel.COMUM;
	
	@Dado("um filme com estoque de {int} unidades")
	public void um_filme_com_estoque_de_unidades(Integer unidade) {
		filme = new Filme();
		filme.setEstoque(unidade);
	}

	@Dado("que o preço do aluguel seja R$ {int}")
	public void que_o_preço_do_aluguel_seja_r$(Integer aluguel) {
		filme.setAluguel(aluguel);
	}

	@Quando("alugar")
	public void alugar() {
		try {
			notaAluguel = aluguelService.alugar(filme, tipoAluguel);
		} catch(RuntimeException e) {
			erro = e.getMessage();
		}
	}

	@Entao("o preço do aluguel será R$ {int}")
	public void o_preço_do_aluguel_será_r$(Integer valor) {
		Assertions.assertEquals(valor, notaAluguel.getPreco());
	}

	@Entao("o estoque do filme será {int} unidade")
	public void o_estoque_do_filme_será_unidade(Integer int1) {
		Assertions.assertEquals(int1, filme.getEstoque());
	}
	
	@Entao("não será possível por falta de estoque")
	public void não_será_possível_por_falta_de_estoque() {
		Assertions.assertEquals("Filme sem estoque", erro);
	}
	
	@Dado("que o tipo do aluguel seja {word}")
	public void que_o_tipo_do_aluguel_seja_extendido(String tipo) {
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL : tipo.equals("extendido") ? TipoAluguel.EXTENDIDO : TipoAluguel.COMUM;
	}

	@Quando("a data de entrega será em {int} dia(s)")
	public void a_data_de_entrega_será_em_dias(Integer dias) {
		Date dataEsperada = DateUtils.obterDataDiferencaDias(dias);
		Date dataReal = notaAluguel.getDataEntrega();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Assertions.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Quando("a pontuação será de {int} pontos")
	public void a_pontuação_será_de_pontos(Integer int1) {
		Assertions.assertEquals(int1, notaAluguel.getPontuacao());
	}

	
}
