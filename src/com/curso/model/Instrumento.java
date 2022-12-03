package com.curso.model;

public abstract class Instrumento {

	//PROPIEDADES
	private String nombre;
	private String tipo;
	
	//CONSTRUCTOR, estoy en una clase abstracta, por lo que puedo pensar no necesito constructor porque no voy a crear un instrumento
	public Instrumento(String nombre, String tipo) { // Pero si lo necesito para la herencia de los hijos
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	
	//MÉTODOS
	public void tocar() {
		System.out.println("Tocando el instrumento " + nombre); //println lleva implícito un salto de línea
	}
	
	//GETTER AND SETTER
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public void afinar() {
		System.out.println("Afinando el instrumento " + nombre); //println lleva implícito un salto de línea
	}

}
