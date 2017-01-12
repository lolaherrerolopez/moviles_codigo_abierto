package com.cice.tutorialjava.poo.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cice.tutorialjava.poo.interfaces.Racional;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringSet=new HashSet<>();
		Set <Racional> myRacionalSet=new HashSet<>();
		myStringSet.add("Tula");
		myStringSet.add("Frodo");
		myStringSet.add("Tula");
		myStringSet.add("Luna");
		myStringSet.add("Chispi");
		myStringSet.add("Thor");
		
		
		System.out.println("Recorriendo el Set con for each....");
		for(String str:myStringSet){
			System.out.println(str);
		}
		System.out.println("Recorriendo el Set con un iterador....");
		Iterator <String> it=myStringSet.iterator();
		while (it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,7));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(4,6));
		System.out.println("Recorriendo el set de Racionales con un iterador....");
		Iterator <Racional> itRacional=myRacionalSet.iterator();
		while (itRacional.hasNext()){
			System.out.println(itRacional.next());
		}
	}

}
