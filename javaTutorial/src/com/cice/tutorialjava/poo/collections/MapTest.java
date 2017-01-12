package com.cice.tutorialjava.poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cice.tutorialjava.poo.Persona;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Persona> myPersonaMap=new HashMap<>();
		myPersonaMap.put("p-80001", new Persona("Tula",13));
		myPersonaMap.put("p-80002", new Persona("Tayson",1));
		myPersonaMap.put("p-80003", new Persona("Chispi",12));
		myPersonaMap.put("p-80001", new Persona("Rumba",6));
		myPersonaMap.put("p-80004", new Persona("Nora",10));
		Set<String> keys=myPersonaMap.keySet();
		for (String key:keys){
			Persona p=myPersonaMap.get(key);
			p.print();
		}
	}

}
