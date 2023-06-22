package primer_Proyecto2023;

public class Significado {

	public static void main(String[] args) {
	//-16 + 32 / 4 (48 - 7)% 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11% 4
	
	int significado1 = -16 + 32 / 4 * (48 - 7)% 11;
	int significado2 = (18 + 2) / (17 - 12);
	int significado3 = 17 - 18 / 6 * 3 + 11% 4;
	
	System.out.println( "El siginificado de: -16 + 32 / 4 * (48 - 7)% 11 es: " + significado1);
	System.out.println( "El siginificado de: (18 + 2) / (17 - 12) es: " + significado2);
	System.out.println( "El siginificado de: 17 - 18 / 6 * 3 + 11% 4 es: " + significado3);
}
}