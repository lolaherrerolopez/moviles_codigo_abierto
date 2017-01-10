package com.cice.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		Estudiante e=new Estudiante("Lola",99,"000001","POO","IOS","PADEL");

		e.print();
		System.out.println("añadimos Zumba");
		e.addCurso("ZUMBA");
		e.print();
		e.removeCurso("IOS");
		System.out.println("Borramos el curso IOS");
		e.print();
	}

}
