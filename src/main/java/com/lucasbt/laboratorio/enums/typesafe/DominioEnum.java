/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

import java.io.Serializable;
import java.util.List;

/**
 * Interface comum a todos os tipos de enum.
 * 
 * @author lucas
 */
public interface DominioEnum<TIPO, VALOR> extends Serializable, Comparable<TIPO> {
	
	VALOR getValor();
	
	TIPO valueOf(VALOR valor);
	
	List<TIPO> valores();
}
