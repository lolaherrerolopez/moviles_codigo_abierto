package com.cice.tutorialjava.poo.interfaces;

public interface Comparable {
	/**
		<0-> Nuestro objeto es menor que other 
		0-> son iguales
		>0 ->nuesro objeto es mayor que other
	*/
	public int compareTo(Object other) throws ComparationException;
	
}
