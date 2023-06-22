package primer_Proyecto2023;

import java.util.Scanner;

public class cocienteResto {

	public static void main(String[] arg) {
		
		Scanner leer = new Scanner(System.in);
		//Dados 2 números 17 y 3, encuentra el cociente, el resto de la separación y la respuesta real. Datos de prueba: 17 y 3 
		
		int ejemplo1 = 17;
		int ejemplo2 = 3;
		
		double resp_ejemplo = (double)  17/3; //¿Por que el (double)?
		
		int cociente_ejemplo = 17/3;
		
		int ejem_resto = ejemplo1 % ejemplo2;
		
		
		System.out.println("respuesta de la división (17/3) = " + resp_ejemplo);
		System.out.println(" el cociente es: " + cociente_ejemplo);
		System.out.println(" el resto es: " + ejem_resto);
		
		System.out.print("Ahora es tu turno, ingresa un dividendo (el numero que sera dividido): ");
		short num1 = (short) leer.nextShort();	
		
		System.out.print("ingresa el divisor: ");
		short num2= (short) leer.nextShort();
		
		double respreal = (double)  num1/num2;
		int cociente = num1/num2;
		int resto = num1 % num2;
		
		 System.out.println("Cociente: " + cociente);
	     System.out.println("Resto: " + resto);
	     System.out.println("Respuesta Real: " + respreal);
		
	}
}
