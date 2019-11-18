package ejercicios;
import java.util.Scanner;

public class Ejercicio_chungo02 {
	static double salario =0, comision = 0, subida = 0, porcen = 0, aumento = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
										
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Por favor, indique salario");
		salario = leer.nextDouble();	

		System.out.println("Por favor, indique comisión");
		comision = leer.nextDouble();
		
		if (comision == 0) { 
			versalario(); 
		}else verComision();
	
		System.out.println("Tu salario inicial es : " + salario);
		System.out.println("Tu porcentaje de subida que te corresponde es : " + porcen + "%");
		aumento = salario * porcen/100;
		if (porcen == 0) {
			System.out.println("Tu aumento es : 0 ");
		}else { System.out.println("Tu aumento es : " + aumento);}
			
		System.out.println("Tu salario final es : " + (salario + aumento));
	
	leer.close();
	}

	
	private static void versalario() { 
		if (salario < 15000) {
			porcen = 10;
			System.out.println("Aumento del 10%");
		}else { if (salario >= 15000 && salario < 30000) {
			porcen = 8;
			System.out.println("Aumento del 8%");
			}else   { if (salario >= 30000 && salario < 450000) {
				porcen = 4;
				System.out.println("Aumento del 4%");
				}else   {
					porcen = 0;
					System.out.println("Sin aumento");
		}
		}
		}
		}	
				
	private static void verComision() { 
		if (comision < 2000) {
			porcen = 12;
			System.out.println("Aumento del 12%");
		}else { if (comision >= 2000 && comision < 10000) {
			porcen = 6;
			System.out.println("Aumento del 6%");
			}else { if (comision >	10000) {
					porcen = 0.0;
					System.out.println("Sin aumento");
		}
		}
		}
		

	}
	}

