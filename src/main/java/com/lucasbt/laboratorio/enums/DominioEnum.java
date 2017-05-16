/**
 * 
 */
package com.lucasbt.laboratorio.enums;

import java.io.Serializable;

/**
 * Interface comum a todos os tipos de enum.
 * 
 * @author lucas
 */
public interface DominioEnum<VALOR> extends Serializable {

	VALOR getValor();

	String getNome();

}
