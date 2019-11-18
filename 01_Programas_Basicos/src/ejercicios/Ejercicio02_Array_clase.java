package ejercicios;

public class Ejercicio02_Array_clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] dias = {"Lunes", "Martes", "Miercoles", null, "Viernes", "Sabado", "Domingo"}; 
		int diaSemana = 7;
		System.out.println("Hoy es : " + dias[diaSemana -1]); // -1 porque en java se empieza en 0

//		para un array con huecos hay que recorrerlo entero con un while 	
		int ind = 0;	
//      preguntar siempre primero por el indice 		
		while (ind < dias.length && dias[ind] != null) {
			System.out.println(dias[ind]);
			ind ++;
		}
		System.out.println();
		// leo el array de 0 al 5 porque se donde estan los null	
		for (int i=0 ; i<5; i++)
			System.out.println("El dia : " + dias[i]);
		
		System.out.println();
//		leo el array sin contador, donde dia es una variable(que yo defino) que va de 0 al length
//		cuando pilla null falla.		
		for (String dia: dias ) 
			System.out.println("El dia : " + dia);
		
		System.out.println();
//      leo el array sin contador, e imprimo solo los que no son null. Cuando hay huecos	
		for (String dia: dias ) {
			if (dia != null)
					System.out.println("El dia : " + dia.toUpperCase());
			
		}
		
	}

}
