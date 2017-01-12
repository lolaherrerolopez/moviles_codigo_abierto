package com.cice.tutorialjava.poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Diccionario fichero=new Diccionario("palabras.txt");
			fichero.print();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
