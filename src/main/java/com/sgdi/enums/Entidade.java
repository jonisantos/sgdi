package com.sgdi.enums;

public enum Entidade {

	FIEMT(1, "FIEMT"),
	SESI(2, "SESI"),
	SENAI(3, "SENAI"),
	IEL(4,"IEL"),
	CONDOMINIO(5, "CONDOMINIO");
	
	private int cod;
	private String descricao;	
	
	private Entidade(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Entidade toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(Entidade x : Entidade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido: " + cod); 
		
	}
	
	
}
