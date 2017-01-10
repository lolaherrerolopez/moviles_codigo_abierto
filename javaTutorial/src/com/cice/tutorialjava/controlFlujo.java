package com.cice.tutorialjava;

public class controlFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// expresion if()
		int nota = 3;
		if (nota > 5) {
			System.out.println("aprobado");
		} else {
			System.out.println("suspendido");
		}
		// expresion swicht()
		switch (nota) {
		case 0:
			System.out.println("suspendido");
			break;
		case 1:
			System.out.println("suspendido");
			break;
		case 2:
			System.out.println("suspendido");
			break;
		case 3:
			System.out.println("suspendido");
			break;
		case 4:
			System.out.println("suspendido");
			break;
		case 5:
			System.out.println("aprobado");
			break;
		case 6:
			System.out.println("aprobado");
			break;
		case 7:
			System.out.println("aprobado");
			break;
		case 8:
			System.out.println("aprobado");
			break;
		case 9:
			System.out.println("aprobado");
			break;
		case 10:
			System.out.println("aprobado");
			break;
		default:
			System.out.println("puntuacion no valida");
			break;
		}
		// bucle while()
		nota = 0;
		while (nota < 10) {
			System.out.println("incrementa nota.." + nota++);
		}
		System.out.println("nota final " + nota);

		// bucle for()
		for (nota = 0;  nota<10 ; nota++) {
			System.out.println("incrementando nota (for)..");
		}
		System.out.println("nota final "+ nota+ "(for)");
		
		do{
			System.out.println("incrementando nota");
			nota++;
		}while(nota<10);
		System.out.println("nota final "+nota);
		
		//saltos incondicionales
		//break, desplaza el flujo fuera del bucle
		//continue, desplaza el flujo a la siquiente iteracion
		
		nota=0;
		while(nota<100){
			System.out.println("incremento nota "+nota);
			nota++;
			if(nota==10)
				break;
				}
		nota=0;
		while(nota<100){
			System.out.println("incremento nota "+nota);
			nota++;
			if(nota==5)
				continue;
				}
		
		
	}

}
