package primer_Proyecto2023;

import java.util.Scanner;

public class producto {
	
	//Calcula el producto de tres enteros (multiplicacion entre los numeros)
	
	public static void main(String[] arg) {
		
		Scanner leer = new Scanner(System.in);
				
		System.out.print("ingresa un numero entero");
		short num1 = (short) leer.nextShort();	
		
		System.out.print("ingresa un numero entero");
		short num2 = (short) leer.nextShort();	
		
		System.out.print("ingresa un numero entero");
		short num3 = (short) leer.nextShort();	
		
		int producto = num1 * num2 * num3;
		
		System.out.print("el producto de los tres enteros que sugeriste es: " + producto);
		
}
}