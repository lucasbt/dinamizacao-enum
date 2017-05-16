/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

/**
 * @author lucas
 *
 */
public class TipoContaPersonalizado extends TipoContaImpl {
	private static final long serialVersionUID = 1L;
	
	public TipoContaImpl CORRENTE = new TipoContaImpl(1,"Conta Corrente");
	
	private TipoContaPersonalizado(Integer valor, String descricao) {
		super(valor, descricao);
		
	}

	


}
