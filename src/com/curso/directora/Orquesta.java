package com.curso.directora;

import com.curso.model.Flauta;
import com.curso.model.Guitarra;
import com.curso.model.GuitarraElectrica;
import com.curso.model.Instrumento;
import com.curso.model.Tambor;

public class Orquesta {

	public static void main(String[] args) {
		
		//Instancias
		Flauta f1 = new Flauta("flautaSuper", "travesera", "M45");
		Guitarra g1 = new Guitarra("pepita", "española", 6);
		GuitarraElectrica ge1 = new GuitarraElectrica("Electricotronix", "Electrica", 6, 120);
		Tambor t = new Tambor("Trueno", "bombo", "Grande");
		
		f1.afinar();
		f1.tocar();
		g1.afinar();
		g1.tocar();
		ge1.tocar();
		ge1.afinar();
		t.afinar(); //El tambor también hereda el tocar y lo puedo invocar
		t.tocar(); //El tambor también hereda el afinar y lo puedo invocar
		t.aporrear();
		
		//Esto mejor el tener que añadir los métodos de forma manual
		Instrumento[] instrumentos = {f1, g1, ge1, t};

		for (Instrumento instrumento : instrumentos) {
			
			instrumento.afinar();
			
			if(instrumento instanceof Tambor) { // Es como compararlo con el equal, pero con el instanceof ya tengo esa lógica implementada
				((Tambor) instrumento).aporrear(); //Instancia que es del tipo instrumento te lo cambio y lo pones con el tipo Tambor para que puedas utilizar el método de la clase Tambor
				} else {
				instrumento.tocar();
			    }
		}
			
			
	}

}
