package com.curso.model;

public class GuitarraElectrica extends Guitarra {
	
	private int potencia;

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}

	public void tocar() {
		System.out.println("Tocando guitarra eléctrica");
	}
	
	
}
