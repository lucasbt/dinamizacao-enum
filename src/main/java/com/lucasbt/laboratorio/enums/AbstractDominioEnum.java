package com.lucasbt.laboratorio.enums;

import lombok.NonNull;

/**
 * 
 * @author lucas
 *
 * @param <T>
 */
public abstract class AbstractDominioEnum<T> implements DominioEnum<T> {

	private static final long serialVersionUID = 1L;
	@NonNull
	protected String nome;
	@NonNull
	protected T valor;

	public AbstractDominioEnum(T valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	/**
	 * (Ver Javadoc da super classe)
	 * 
	 * @see com.lucasbt.laboratorio.enums.DominioEnum#getValor()
	 */
	@Override
	public T getValor() {
		return this.valor;
	}

	/**
	 * (Ver Javadoc da super classe)
	 * 
	 * @see com.lucasbt.laboratorio.enums.DominioEnum#getNome()
	 */
	@Override
	public String getNome() {
		return this.nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractDominioEnum)) {
			return false;
		}
		AbstractDominioEnum<?> other = (AbstractDominioEnum<?>) obj;
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (valor == null) {
			if (other.valor != null) {
				return false;
			}
		} else if (!valor.equals(other.valor)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s [nome=%s, valor=%s]", this.getClass().getCanonicalName(), nome, valor);
	}
}