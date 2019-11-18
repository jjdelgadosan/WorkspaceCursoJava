package ejercicios;

public class Ejercicio03_Array_bidiminsional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};
		String [] [] menus = {
				{"macarrones", "lomo", "sandia"},
				{"sopa", "garbanzos", "apaño", "cafe", "copa"},
				{"acelgas", "pechuga plancha", "melon", "cafe"},
				{"lentejas", "carne guisada", "piña"},
				{"ensalada", "rabo de toro", "tarta"},
				
				};
		
		
		// para sacar el menu de un dia solo
		int fila = 1;
		System.out.println(dias[fila]);
		for (int j =0; j < menus[fila].length; j++)
			System.out.println(menus[fila][j]);
						
		// saca todos los menus de la semana
		System.out.println("MENU DE ESTA SEMANA");
		System.out.println();
		
		for (int i=0; i<menus.length; i++) {
			System.out.println(dias[i].toUpperCase());
			for (int j=0; j< menus[i].length; j++)
				System.out.print(menus[i][j] + "|");
		System.out.println();
			
		}
	}

}
