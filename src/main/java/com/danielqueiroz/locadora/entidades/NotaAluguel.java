package com.danielqueiroz.locadora.entidades;

import java.util.Date;

public class NotaAluguel {

	private Integer preco;
	private Integer pontuacao;
	private Date dataEntrega;

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		dataEntrega = time;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}


}
