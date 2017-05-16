/*
* Fóton Informática S.A.
* Criação : 15 de mai de 2017
*/
package com.lucasbt.laboratorio.enums.typesafe;

import com.lucasbt.laboratorio.enums.DominioEnum;

/**
* Descrição do Fonte
* 
* @author <Mês por extenso>/2017: <Nome Completo do Implementador> <DD>
*/
public interface TipoConta<T> extends DominioEnum<T>
{

   Boolean isCorrente();

   Boolean isPoupanca();

   Boolean isSalario();

}
