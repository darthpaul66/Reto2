package reto;

import java.util.Scanner;

public class Funciones1 {

	public static void longitud(Scanner sc) {
		
		do {
			System.out.println("Introduzca el valor que desea usar:");
			String kyoko = sc.nextLine();
			int n1 = Integer.parseInt(kyoko);
			
			System.out.println("Seleciona la onversión de longitud: ");
			System.out.println("1. Millas a Kilómetros");
			System.out.println("2. Kilómetros a Millas");
			System.out.println("3. Salir");
			
			String Iuno = sc.nextLine();
		    int opcion = Integer.parseInt(Iuno);
		        
			if (opcion == 1) {
				double conversion = n1 * 1.609;
				System.out.println(n1 + " millas son " + conversion + " kilómetros.");
			}
			
			else if (opcion == 2) {
				double conversion = n1/1.609;
				System.out.println(n1 + " kilómetros son " + conversion + " millas.");
			}

			else if (opcion == 3) {
				break;
			}
			
			else {
				System.out.println("Valor no válido.");
			}
			
		} while (true);
	}
	
	public static void peso(Scanner sc) {
		
		do {
			System.out.println("Introduzca el valor que desea usar:");
			String kyoko = sc.nextLine();
			int n1 = Integer.parseInt(kyoko);
			
			System.out.println("Seleciona la onversión de longitud: ");
			System.out.println("1. Kilogramos a Libras");
			System.out.println("2. Libras a Kilogramos");
			System.out.println("3. Salir");
			
			String Iuno = sc.nextLine();
		    int opcion = Integer.parseInt(Iuno);
		        
			if (opcion == 1) {
				double conversion = n1 * 2.205;
				System.out.println(n1 + " kilogramos son " + conversion + " libras.");
			}
			
			else if (opcion == 2) {
				double conversion = n1/2.205;
				System.out.println(n1 + " libras son " + conversion + " kilogramos.");
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
