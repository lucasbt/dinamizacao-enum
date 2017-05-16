/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

import com.lucasbt.laboratorio.enums.DominioEnum;

/**
 * @author lucas
 *
 */
public class TipoContaPersonalizadoImpl extends TipoContaImpl implements TipoContaPersonalizado{
	private static final long serialVersionUID = 1L;

	public static final TipoConta<?> BENEFICIO = new TipoContaPersonalizadoImpl(9, "Conta Benefício");

	private TipoContaPersonalizadoImpl(Integer valor, String descricao) {
		super(valor, descricao);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.lucasbt.laboratorio.enums.typesafe.TipoContaPersonalizado#isBeneficio()
	 */	
	@Override
	public Boolean isBeneficio() {		
		return this.equals(BENEFICIO);
	}
	
	public static void main(String[] args) {
		TipoConta tipo = TipoContaPersonalizadoImpl.CORRENTE;
		teste(tipo);
		TipoContaPersonalizado tipo2 = (TipoContaPersonalizadoImpl) tipo;
		teste(tipo2);
		
		System.out.println(((DominioEnum<?>)TipoContaPersonalizadoImpl.BENEFICIO).getValor());
		System.out.println(((DominioEnum<?>)TipoContaPersonalizadoImpl.POUPANCA).getNome());
	}
	
	public static void teste(TipoConta tipo){
		System.out.println(tipo.isCorrente());
	}
	
	public static void teste(TipoContaPersonalizado tipo){
		System.out.println(tipo.isBeneficio());
	}
}
