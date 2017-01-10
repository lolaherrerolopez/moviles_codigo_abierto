package com.cice.tutorialjava.poo;

public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Construyendo un objeto de tipo Persona...");
		Persona p=new Persona("Sin Nombre",0,"Sin Dirección");
		System.out.println("Objeto Persona construido..");
		p.print();
		p.setNombre("Lola");
		p.setEdad(42);
		p.setDomicilio("Alcorcon");
		System.out.println("Despues de inicializar..");
		p.print();
	}

}
