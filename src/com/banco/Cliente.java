package com.banco;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cliente {
	private Integer id;
	private String nome;
	private String cpf;
	
	public Cliente(Integer id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	

	@Override
	public String toString() {
		return "\nDados do cliente:\nId=" + id + "\nNome=" + nome + "\ncpf=" + cpf;
	}

	
}
