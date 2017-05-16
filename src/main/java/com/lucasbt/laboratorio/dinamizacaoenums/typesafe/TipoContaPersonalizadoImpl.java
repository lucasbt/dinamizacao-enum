/**
 * 
 */

package com.lucasbt.laboratorio.dinamizacaoenums.typesafe;

import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

/**
 * @author lucas
 */
public class TipoContaPersonalizadoImpl extends TipoContaImpl implements TipoContaPersonalizado
{

   private static final long serialVersionUID = 1L;

   public static final TipoConta<?> BENEFICIO = new TipoContaPersonalizadoImpl(9, "Conta Benefício");

   private TipoContaPersonalizadoImpl(Integer valor, String descricao)
   {
      super(valor, descricao);
   }

   /*
    * (non-Javadoc)
    * @see com.lucasbt.laboratorio.enums.typesafe.TipoContaPersonalizado#isBeneficio()
    */
   @Override
   public Boolean isBeneficio()
   {
      return this.equals(BENEFICIO);
   }
}
