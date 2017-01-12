package com.cice.tutorialjava.poo.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Diccionario {
	static Map<Character,List<String>> buffer;
	
	

	public Diccionario(String file) throws FileNotFoundException {
		buffer=new HashMap<>();
		FileInputStream in=new FileInputStream(file);
		Scanner sc=new Scanner(in);
		load(sc);
		
	}
	
	/**Métod de carga del diccionario
	 * */
	private void load(Scanner sc){
		while (sc.hasNext()){
			String line=sc.nextLine();
			char c=line.charAt(0);
			List<String> l =buffer.get(c);
			if (l==null){
				l=new ArrayList<>();
				buffer.put(c, l);
			}
			l.add(line);
			//Guardar la línea leída en el buffer.
		}
		
	}
	public void print() {
		// TODO Auto-generated method stub
		
		Set<Character> keys=buffer.keySet();
		for (Character key:keys){
			System.out.println(key);
			
			List<String> p=buffer.get(key);
			System.out.println(p);
		}
	}
	
}
