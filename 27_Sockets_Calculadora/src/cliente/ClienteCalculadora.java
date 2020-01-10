package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCalculadora {

	public static void main(String[] args) {
		//System.in es un stream de entrada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seleccione operación: ");
		System.out.println("S.   suma: ");
		System.out.println("R.   resta: ");
		System.out.println("M.   multiplica: ");
		System.out.println("D.   divide: ");
		
		String operacion = sc.nextLine();
		
		System.out.println("Introduzca el numero 1: ");
		int numero1 = sc.nextInt();
		System.out.println("introduzca el numero 2: ");
		int numero2 = sc.nextInt();
		
		//nos conectamos al servidor para mandarle
		//los numeros
		
		//si hacemos esto de una manera clasica, deberiams
		//crear estar variables fuera del try y luego 
		//cerrarlas en el bloque finally. Desde la version
		//1.7 de java, podemos poner las variables que queremos
		//cerrar automaticamente dentro de los parentesis del try
		//y cuando salga se cerraran
		//con el comando ipconfig podemos saber nuestras ips
		try(Socket socket = new Socket("192.168.1.42",2019);
				PrintStream ps = 
						new PrintStream(socket.getOutputStream())) {
			//creamos el tubo
			
			//creamos un objeto que me permite escribir
			//sobre el output stream del socket
			ps.println(numero1 + "-" + numero2 +"-"+operacion);//----->sale  hacia el servidor
			
			//ahora en el cliente tendremos que leer la inforamcion
			//del servidor
			InputStreamReader isr = 
					new InputStreamReader(socket.getInputStream());//<--------- llega desde el servidor
			
			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			//en este linea nos quedaremos parados hasta que 
			//el servidor nos responda
			System.out.println("respuesta calculadora cliente: " + bf.readLine());
						
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
