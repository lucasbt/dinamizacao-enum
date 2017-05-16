/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

import java.io.Serializable;

/**
 * Interface comum a todos os tipos de enum.
 * 
 * @author lucas
 */
public interface DominioEnum<VALOR> extends Serializable, Comparable<VALOR>
{
	
	VALOR getValor();

   String getNome();

}
