package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import com.cice.tutorialjava.poo.Persona;

public class OrdenacionPersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> list=new ArrayList<>();
		list.add(new Persona("AAA",8,"aaa"));
		list.add(new Persona("BBB",5,"aaa"));
		list.add(new Persona("ZZZ",9,"aaa"));
		list.add(new Persona("AEA",1,"aaa"));
		list.add(new Persona("EEA",2,"aaa"));
		list.add(new Persona("OEA",84,"aaa"));
		Collections.sort(list, new Comparator<Persona>(){

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad()-o2.getEdad();
			}

			
			
		});
		
		System.out.println("Recorriendo la lista ordenando por edad....");
		for (Persona p:list){
			p.print();
		}
	}

}
