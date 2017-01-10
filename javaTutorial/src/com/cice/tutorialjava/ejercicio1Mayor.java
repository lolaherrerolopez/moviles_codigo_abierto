package com.cice.tutorialjava;

public class ejercicio1Mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] number ={"edu","lola","pedro","marcos","alejandro","maria","ana","odiseo","constantino"};
		
		String aux=number[0];
		for (int i = 0; i < number.length; i++) {
			
			if(number[i].length()>aux.length()){
				aux=number[i];
			}
				System.out.println("number "+ aux);
		}
		System.out.println("numero mayor es "+aux);
	}

}
