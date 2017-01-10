package com.cice.tutorialjava;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= new int[10];
array[0]=12;
array[1]=11;
array[2]=10;
array[3]=9;
array[4]=8;
array[5]=7;
array[6]=6;
array[7]=5;
array[8]=4;
array[9]=3;
array[0]=1;
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}
for (int i : array) {
	System.out.println(i);
}
//inicializar matrices
String[] stringArray={"yo","tu","el"};
for (String string : stringArray) {
	System.out.println(string);
}
	}

}
