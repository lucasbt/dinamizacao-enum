/**
 * 
 */
package com.lucasbt.laboratorio.dinamizacaoenums.enums;

import com.lucasbt.laboratorio.dinamizacaoenums.TipoContaPersonalizado;

/**
 * @author lucas
 *
 */
public enum TipoContaPersonalizadoEnum implements TipoContaPersonalizado {
	CORRENTE(1, "Corrente"), POUPANCA(2, "Poupança"), SALARIO(3, "Salário"),BENEFICIO(9, "Benefício");

	protected String nome;
	protected Integer valor;

	private TipoContaPersonalizadoEnum(Integer valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lucasbt.laboratorio.enums.typesafe.DominioEnum#getValor()
	 */
	@Override
	public Integer getValor() {
		return this.valor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lucasbt.laboratorio.enums.typesafe.DominioEnum#getNome()
	 */
	@Override
	public String getNome() {
		return this.nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isCorrente()
	 */
	@Override
	public Boolean isCorrente() {
		return this.equals(CORRENTE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isPoupanca()
	 */
	@Override
	public Boolean isPoupanca() {
		return this.equals(POUPANCA);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isSalario()
	 */
	@Override
	public Boolean isSalario() {
		return this.equals(SALARIO);
	}

	@Override
	public Boolean isBeneficio() {
		return this.equals(BENEFICIO);
	}
}
