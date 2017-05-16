/**
 * 
 */
package com.lucasbt.laboratorio.dinamizacaoenums;

import java.io.Serializable;

/**
 * Interface comum a todos os tipos de enum.
 * 
 * @author lucas
 */
public interface DominioEnum<T> extends Serializable {

	T getValor();

	String getNome();

}
