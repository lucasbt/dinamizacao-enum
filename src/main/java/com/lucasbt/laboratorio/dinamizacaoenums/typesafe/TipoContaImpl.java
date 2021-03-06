
package com.lucasbt.laboratorio.dinamizacaoenums.typesafe;

import com.lucasbt.laboratorio.dinamizacaoenums.AbstractDominioEnum;
import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

/**
 * Descrição do Fonte
 * 
 * @author <Mês por extenso>/2017: <Nome Completo do Implementador>
 *         <DD>
 */
public class TipoContaImpl extends AbstractDominioEnum<Integer> implements TipoConta<Integer>
{

   private static final long serialVersionUID = 1L;
   public static final TipoConta<Integer> CORRENTE = new TipoContaImpl(1, "Conta Corrente");
   public static final TipoConta<Integer> POUPANCA = new TipoContaImpl(2, "Conta Poupança");
   public static final TipoConta<Integer> SALARIO = new TipoContaImpl(3, "Conta Salário");

   protected TipoContaImpl(Integer valor, String nome)
   {
      super(valor, nome);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.dinamizacaoenums.TipoConta#isCorrente()
    */
   @Override
   public Boolean isCorrente()
   {
      return this.equals(CORRENTE);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.dinamizacaoenums.TipoConta#isPoupanca()
    */
   @Override
   public Boolean isPoupanca()
   {
      return this.equals(POUPANCA);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.dinamizacaoenums.TipoConta#isSalario()
    */
   @Override
   public Boolean isSalario()
   {
      return this.equals(SALARIO);
   }

}

/// **
// *
// *
// * @author lucas
// */
// public class TipoContaImpl implements DominioEnum<TipoContaImpl,Integer>,
/// Serializable {
// private static final long serialVersionUID = 1L;
// private final Set<TipoContaImpl> valores;
//
// @Getter
// private final Integer valor;
//
// @GetterT
// private final String descricao;
//
// public final TipoContaImpl CORRENTE = new TipoContaImpl(1, "Conta Corrente");
// public final TipoContaImpl POUPANCA = new TipoContaImpl(2, "Conta Poupança");
// public final TipoContaImpl JUDICIAL = new TipoContaImpl(3, "Conta Judicial");
//
// protected TipoContaImpl(Integer valor, String descricao) {
// this.valor = valor;
// this.descricao = descricao;
//
// valores = new HashSet<>();
// valores.add(CORRENTE);
// valores.add(POUPANCA);
// valores.add(JUDICIAL);
// }
//
// static {
//
// }
//
// public Set<TipoContaImpl> values() {
// // Recuera um clone da lista.
// return new HashSet<>(valores);
// }
//
// @Override
// public int compareTo(TipoContaImpl o) {
// // TODO Auto-generated method stub
// return 0;
// }
//
// @Override
// public TipoContaImpl valueOf(Integer valor) {
// // TODO Auto-generated method stub
// return null;
// }
//
// @Override
// public List<TipoContaImpl> valores() {
// // TODO Auto-generated method stub
// return null;
// }
//
// }

// public class TipoConta implements DominioEnum<TipoConta,Integer>{
//
// private static final long serialVersionUID = 1L;
//
// @Getter
// private final Integer valor;
//
// @Getter
// private final String descricao;
//
// public static final TipoConta CORRENTE = new TipoConta(1,"Conta Corrente");
// public static final TipoConta POUPANCA = new TipoConta(2, "Conta Poupança");
// public static final TipoConta JUDICIAL = new TipoConta(3, "Conta Judicial");
//
// protected TipoConta(Integer valor, String descricao){
// this.valor = valor;
// this.descricao = descricao;
// }
//
// public int compareTo(TipoConta o) {
// // TODO Auto-generated method stub
// return 0;
// }
//
// public TipoConta valueOf(Integer valor) {
// // TODO Auto-generated method stub
// return null;
// }
//
// public List<TipoConta> valores() {
// // TODO Auto-generated method stub
// return null;
// }
//
// }
