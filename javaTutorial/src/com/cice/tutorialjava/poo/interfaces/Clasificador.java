package com.cice.tutorialjava.poo.interfaces;

public class Clasificador {

	public static void sort(Comparable[] list) {
		// TODO Auto-generated method stub
		
	}
	public static Object getMinimum(Comparable[] list) throws ComparationException{
		int min=0;
		for (int i=1; i<list.length;i++){
			if (list[min].compareTo(list[i])>0)
				min=i;
		}
		
		return list[min];
	}
}
