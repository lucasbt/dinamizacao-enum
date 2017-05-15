/**
 * 
 */
package com.lucasbt.laboratorio.enums.typesafe;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;

/**
 * 
 * 
 * @author lucas
 */
public class TipoConta implements DominioEnum<TipoConta,Integer>, Serializable {
	private static final long serialVersionUID = 1L;
	private final Set<TipoConta> valores;
	
	@Getter
	private final Integer valor;

	@Getter
	private final String descricao;

	public final TipoConta CORRENTE = new TipoConta(1, "Conta Corrente");
	public final TipoConta POUPANCA = new TipoConta(2, "Conta Poupança");
	public final TipoConta JUDICIAL = new TipoConta(3, "Conta Judicial");

	protected TipoConta(Integer valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
		
		valores = new HashSet<>();
		valores.add(CORRENTE);
		valores.add(POUPANCA);
		valores.add(JUDICIAL);
	}

	static {

	}

	public Set<TipoConta> values() {
		return new HashSet<>(valores);
	}

	@Override
	public int compareTo(TipoConta o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoConta valueOf(Integer valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoConta> valores() {
		// TODO Auto-generated method stub
		return null;
	}

}

//public class TipoConta implements DominioEnum<TipoConta,Integer>{
//
//	private static final long serialVersionUID = 1L;
//
//	@Getter
//	private final Integer valor;
//	
//	@Getter
//	private final String descricao;
//
//	public static final TipoConta CORRENTE = new TipoConta(1,"Conta Corrente");
//	public static final TipoConta POUPANCA = new TipoConta(2, "Conta Poupança");
//	public static final TipoConta JUDICIAL = new TipoConta(3, "Conta Judicial");
//
//	protected TipoConta(Integer valor, String descricao){
//      this.valor = valor;
//      this.descricao = descricao;
//  }
//
//	public int compareTo(TipoConta o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public TipoConta valueOf(Integer valor) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<TipoConta> valores() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
