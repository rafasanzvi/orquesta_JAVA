package com.curso.model;

public class Flauta extends Instrumento {

	private String modelo;
	

	//CONSTRUCTOR
	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}
	
	@Override //No es necesario ponerlo, pero es bueno
	public void tocar() {
		super.tocar();
		System.out.println("....Soplando....");
	}
	
}
