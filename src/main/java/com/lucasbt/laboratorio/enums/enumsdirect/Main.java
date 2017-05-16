package com.lucasbt.laboratorio.enums.enumsdirect;

import com.lucasbt.laboratorio.enums.typesafe.TipoConta;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		teste(TipoContaPersonalizadoEnum.BENEFICIO);
	}
	
	public static void teste (TipoConta<?> tipo){
		System.out.println(tipo.isPoupanca());
	}
}
