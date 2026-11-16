package reto;

import java.util.Scanner;

public class Funciones2 {
public static void Temperatura(Scanner sc) {
		
		do {
			System.out.println("Introduzca el valor que desea usar:");
			String kyoko = sc.nextLine();
			int n1 = Integer.parseInt(kyoko);
			
			System.out.println("Seleciona la onversión de longitud: ");
			System.out.println("1. Celsius a Farenheit");
			System.out.println("2. Farenheit a Celsius");
			System.out.println("3. Salir");
			
			String Iuno = sc.nextLine();
		    int opcion = Integer.parseInt(Iuno);
		        
			if (opcion == 1) {
				double conversion = (n1 * 1.8) + 32;
				System.out.println(n1 + " Celsius son " + conversion + " Farenheit.");
			}
			
			else if (opcion == 2) {
				double conversion = (n1-32)/1.8;
				System.out.println(n1 + " Farenheit son " + conversion + " Celsius.");
			}

			else if (opcion == 3) {
				break;
			}
			
			else {
				System.out.println("Valor no válido.");
			}
			
		} while (true);
	}

public static void Volumen(Scanner sc) {
	
	do {
		System.out.println("Introduzca el valor que desea usar:");
		String kyoko = sc.nextLine();
		int n1 = Integer.parseInt(kyoko);
		
		System.out.println("Seleciona la conversión de longitud: ");
		System.out.println("1. Litros a galones");
		System.out.println("2. Galones a litros");
		System.out.println("3. Salir");
		
		String Iuno = sc.nextLine();
	    int opcion = Integer.parseInt(Iuno);
	        
		if (opcion == 1) {
			double conversion = n1 * 0.264172;
			System.out.println(n1 + " litros son " + conversion + " galones.");
		}
		
		else if (opcion == 2) {
			double conversion = n1 * 3.785418;
			System.out.println(n1 + " galones son " + conversion + " litros.");
		}

		else if (opcion == 3) {
			break;
		}
		
		else {
			System.out.println("Valor no válido.");
		}
		
	} while (true);
}
}
