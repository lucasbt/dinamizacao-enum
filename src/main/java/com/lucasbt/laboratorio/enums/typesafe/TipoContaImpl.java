
package com.lucasbt.laboratorio.enums.typesafe;

/**
 * Descrição do Fonte
 * 
 * @author <Mês por extenso>/2017: <Nome Completo do Implementador>
 *         <DD>
 */
public class TipoContaImpl implements TipoConta
{

   private static final long serialVersionUID = 1L;
   private Integer valor;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.enums.typesafe.DominioEnum#getValor()
    */
   @Override
   public Integer getValor()
   {
      return this.valor;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.enums.typesafe.DominioEnum#getNome()
    */
   @Override
   public String getNome()
   {
      return null;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(Integer o)
   {
      return 0;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isCorrente()
    */
   @Override
   public Boolean isCorrente()
   {
      return null;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isPoupanca()
    */
   @Override
   public Boolean isPoupanca()
   {
      return null;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see com.lucasbt.laboratorio.enums.typesafe.TipoConta#isSalario()
    */
   @Override
   public Boolean isSalario()
   {
      return null;
   }

}

/// **
// *
// *
// * @author lucas
// */
// public class TipoContaImpl implements DominioEnum<TipoContaImpl,Integer>, Serializable {
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
