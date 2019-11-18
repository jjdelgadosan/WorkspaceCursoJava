package ejercicios;

public class Ejercicio01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*	abre asteriscos
		int [] pares = {2,4,5,8,10};
		String [] nombres = {"Andres","Esteban", "Zacarias", "Eva", "Ana"};
	
	//	genero una variable con nombres separados por ;
		String cadena ="Tomas;Andre;Ana;Esteban;Sara;Ignacion;Mariel";
		
	// cargo el array
		for (int i=0 ; i<pares.length; i++)
		pares[i] = i*5;
		
	// leo el array	
		for (int i=0 ; i<pares.length; i++)
			System.out.println("En la posicion " + i + " hay " + pares[i]);
	 
	//	leo el array sin contador, donde ele es una variable(que yo defino) que va de 0 al length 	
		for (String ele: nombres) 
			System.out.println("Me llamo : " + ele.toUpperCase()); // metodo para poner en mayuscula
	// meto dos lineas en blanco, uno por el prinln en si, y otro por \n	
		System.out.println("\n");
		
	// cargo un array con un metodo al que le indicamos el separador	
		String [] nombre2 = cadena.split(";");
		for (String ele: nombre2) 
			System.out.println("Me llamo : " + ele.charAt(0)); // saca la primera leta
		
		System.out.println("\n");
		
	// directamente leo del string y le aplicamos el metodo que separa 
		for (String ele: cadena.split(";")) 
			System.out.println("Me llamo : " + ele.codePointAt(0));
	*/	// cierra asteriscos 
		
	 	pruebaArrayVacio();   // llama a otro metodo
}
	
	public static void pruebaArrayVacio () {
		 
		String [] cadenas = new String[6];
		int [] numeros =new int[7];
		
		// carga automatica de numeros aleatorios del 0 al 50
		for (int i=0; i< numeros.length; i++)
			numeros[i] = (int) (Math.random()*50+1);                     
		
		// carga manual
		cadenas[0] = "ejemplo0";
		cadenas[1] = "ejemplo1";
		cadenas[2] = "ejemplo2";
		cadenas[3] = "ejemplo3";
		cadenas[4] = "ejemplo4";
		cadenas[5] = "ejemplo4";
		
		
		for (String ele: cadenas) 
			System.out.println(ele);
		
		for (int ele: numeros) 
			System.out.println(ele);
		
	
		
	}
	
}
