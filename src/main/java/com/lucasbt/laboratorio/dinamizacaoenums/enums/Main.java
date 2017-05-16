package com.lucasbt.laboratorio.dinamizacaoenums.enums;

import com.lucasbt.laboratorio.dinamizacaoenums.TipoConta;

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
