import org.junit.jupiter.api.Assertions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {

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

	
}
