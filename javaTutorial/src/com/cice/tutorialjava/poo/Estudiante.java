package com.cice.tutorialjava.poo;

public class Estudiante extends Persona{
	private String nie;
	private String curso;
	private String[] cursos;
	
	public Estudiante() {
		
	}
	public Estudiante(String nombre, int edad, String curso, String nie, String...cursos) {
		super(nombre,edad);
		this.nie=nie;
		this.curso=curso;
		this.cursos=cursos;
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public void addCurso(String curso){
		int i;
		String[] copia=cursos;
		cursos=new String [cursos.length+1];
		for (i=0;i<copia.length; i++){
			cursos[i]=copia[i];
		}
		cursos[i]=curso;
	}
	/**
	 * Elimina el parámetro curso de la matriz cursos, ajustando su tamaño 
	 * @param curso que se desea borrar
	 */
    public void removeCurso(String curso){
    	int j=0;
    	boolean existe=false;
    	if (cursos.length>0){
			String[] copia= new String [cursos.length-1];
			for (int i=0;i<cursos.length; i++){
				if (cursos[i].equals(curso)){
					existe=true;
				}else{
					copia[j]=cursos[i];
					j++;
				}
			}
			if (existe){
				cursos=copia;
			}
    	}
	}
    void print(){
		System.out.println("Alumno ["+ this.getNombre() + "] Edad [" + this.getEdad() + "] NIE ["+ this.getNie() + "] numero cursos: " + this.getCursos().length + "]" );
		System.out.println("	Cursos:");
		for ( String curso:this.cursos){
			System.out.println("		" + curso);
		}
	}
}
