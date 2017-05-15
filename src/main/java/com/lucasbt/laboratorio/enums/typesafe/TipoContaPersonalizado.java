/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

/**
 * @author lucas
 *
 */
public class TipoContaPersonalizado extends TipoConta {
	private static final long serialVersionUID = 1L;
	
	public TipoConta CORRENTE = new TipoConta(1,"Conta Corrente");
	
	private TipoContaPersonalizado(Integer valor, String descricao) {
		super(valor, descricao);
		
	}

	


}
