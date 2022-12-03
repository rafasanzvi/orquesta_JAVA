package com.curso.model;

public class Guitarra extends Instrumento {
	
	int numCuerdas;

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	
	
}
