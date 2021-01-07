package com.deveficiente.blblioteca.novainstancia;

import javax.validation.constraints.NotNull;

import com.deveficiente.blblioteca.novolivro.Livro;

public class NovaInstanciaRequest {

	@NotNull
	private Tipo tipo;
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Tipo getTipo() {
		return tipo;
	}

}
