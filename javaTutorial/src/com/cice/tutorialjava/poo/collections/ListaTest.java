package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cice.tutorialjava.poo.interfaces.Racional;


public class ListaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStringList=new ArrayList<>();
		List <Racional> myRacionalList=new ArrayList<>();
		myStringList.add("Tula");
		myStringList.add("Frodo");
		myStringList.add("Tula");
		myStringList.add("Luna");
		myStringList.add("Chispi");
		myStringList.add("Thor");
		
		System.out.println("Recorriendo la lista con for indexado....");
		for (int i=0;i<myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}
		System.out.println("Recorriendo la lista con for each....");
		for(String str:myStringList){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con un iterador....");
		Iterator <String> it=myStringList.iterator();
		while (it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,7));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(4,6));
		System.out.println("Recorriendo la lista de Racionales con un iterador....");
		Iterator <Racional> itRacional=myRacionalList.iterator();
		while (itRacional.hasNext()){
			System.out.println(itRacional.next());
		}
	}

}
