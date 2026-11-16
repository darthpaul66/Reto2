package reto;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("Seleciona el tipo de conversión: ");
	        System.out.println("1. Longitud");
	        System.out.println("2. Peso");
	        System.out.println("3. Temperatura");
	        System.out.println("4. Volumen");
	        System.out.println("5. Salir");
	        
	        String Iuno = sc.nextLine();
	        opcion = Integer.parseInt(Iuno);
	        
	        if (opcion == 1) {
				Funciones1.longitud(sc);
			}
	        
	        else if (opcion == 2) {
				Funciones1.peso(sc);
			}
	        
	        else if (opcion == 3) {
				
			}
	        
	        else if (opcion == 4) {
				
			}
	        
	        else if (opcion != 1 || opcion != 2 || opcion != 3 || opcion != 4 || opcion != 5) {
				System.out.println("Valor no válido.\nIntroduzca un valor válido.");
			}
	        
		} while (opcion != 5);
        
        
		
	}

}
