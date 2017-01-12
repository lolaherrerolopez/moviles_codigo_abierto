package com.cice.tutorialjava.poo;

public class Persona {
	private String nombre;
	private int edad;
	private String domicilio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>=0){
			this.edad = edad;
		}
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad, String domicilio) {
		super();
		this.nombre = nombre;
		setEdad(edad);
		this.domicilio = domicilio;
	}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		setEdad(edad);
	}
	
	public void print(){
		System.out.println("Nombre ["+ this.nombre + "] Edad [" + this.edad + "] Domicilio [" + this.domicilio + "]");
	}
}
