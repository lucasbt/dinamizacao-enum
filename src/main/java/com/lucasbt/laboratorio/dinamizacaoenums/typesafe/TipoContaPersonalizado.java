/*
* Fóton Informática S.A.
* Criação : 15 de mai de 2017
*/
package com.lucasbt.laboratorio.dinamizacaoenums.typesafe;

import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

/**
* Descrição do Fonte
* 
* @author <Mês por extenso>/2017: <Nome Completo do Implementador> <DD>
*/
public interface TipoContaPersonalizado extends TipoConta<Integer>
{

   Boolean isBeneficio();
   
}
