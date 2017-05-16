/**
 * 
 */

package com.lucasbt.laboratorio.dinamizacaoenums.typesafe;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

/**
 * @author lucas
 */
@RunWith(MockitoJUnitRunner.class)
public class TipoContaPersonalizadoImplTest
{

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception
   {
   }

   /**
    * @throws java.lang.Exception
    */
   @After
   public void tearDown() throws Exception
   {
   }

   @Test
   public void testIsBeneficio() throws Exception
   {
      TipoConta<?> tipoContaBeneficio = TipoContaPersonalizadoImpl.BENEFICIO;
      Assert.assertTrue(((TipoContaPersonalizadoImpl) tipoContaBeneficio).isBeneficio());
   }

   @Test
   public void testIsNotBeneficio() throws Exception
   {
      TipoConta<?> tipo = TipoContaPersonalizadoImpl.BENEFICIO;
      Assert.assertFalse(((TipoContaPersonalizadoImpl) tipo).isCorrente());
   }

}
