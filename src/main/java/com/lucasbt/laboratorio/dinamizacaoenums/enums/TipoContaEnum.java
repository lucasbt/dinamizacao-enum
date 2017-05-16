/**
 * 
 */
package com.lucasbt.laboratorio.dinamizacaoenums.enums;

import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

/**
 * @author lucas
 *
 */
public enum TipoContaEnum implements TipoConta<Integer> {
	CORRENTE(1, "Corrente"), POUPANCA(2, "Poupança"), SALARIO(3, "Salário");

	protected String nome;
	protected Integer valor;

	private TipoContaEnum(Integer valor, String nome) {
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
}
