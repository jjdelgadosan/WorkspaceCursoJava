package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCoche {

	public static void main(String[] args) {
		//System.in es un stream de entrada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca los datos del nuevo coche");
		System.out.println("----------------------------------------------");
		System.out.println(" ");
		System.out.println("Por favor introduzca la matricula");
		System.out.println("---------------------------------");
		System.out.println(" ");
		String matricula = sc.nextLine();

		System.out.println("Por favor introduzca el modelo");
		System.out.println("------------------------------");
		System.out.println(" ");
		String modelo = sc.nextLine();

		System.out.println("Por favor introduzca la marca");
		System.out.println("-----------------------------");
		System.out.println(" ");
		String marca = sc.nextLine();
		
		//nos conectamos al servidor para mandarle
		//los datos del coche
		
		try(Socket socket = new Socket("192.168.1.42",2019);
				PrintStream ps = 
						new PrintStream(socket.getOutputStream())) {
			//creamos el tubo
			
			//creamos un objeto que me permite escribir
			//sobre el output stream del socket
			ps.println(matricula + "-" + modelo +"-" + marca);//----->sale  hacia el servidor
			
			//ahora en el cliente tendremos que leer la inforamcion
			//del servidor
			InputStreamReader isr = 
					new InputStreamReader(socket.getInputStream());//<--------- llega desde el servidor
			
			//para leer por frases, podemos usar la siguiente clase
			BufferedReader bf = new BufferedReader(isr);
			//en este linea nos quedaremos parados hasta que 
			//el servidor nos responda
			System.out.println(bf.readLine());
						
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
