package principal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import comunes.LectorXml;
import comunes.Lectorcsv;
import comunes.Lectortxt;

public class Programa {
	
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(comprobarSistemaOperativo());
		int opcion = 0;
		
		System.out.println("�Qu� tipo de fichero quiere leer?");
		
		do {
			
			System.out.println();
			System.out.println("Introduzca 1 para leer un archivo .txt");
			System.out.println("Introduzca 2 para leer un archivo .xml");
			System.out.println("Introduzca 3 para leer un archivo .csv");
			System.out.println();
			System.out.print("Elija su opci�n: ");
			
			try {
				opcion = teclado.nextInt();
				
			} catch (InputMismatchException e) {
				opcion = 0;
				teclado.nextLine();
			}
			
			if (opcion != 1 && opcion != 2 && opcion != 3) {
				
				System.out.println();
				System.out.println("Opci�n incorrecta, vuelva a elegir");
			}
			
			System.out.println();
			
			switch (opcion) {
			case 1:
				
				try {
					Lectortxt.txt("listalibros.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				
				LectorXml.LeerArchivoXML();
				
				break;
			
			case 3:
				
				Lectorcsv.lectorcsv("listalibros.csv");
				
				break;

			default:
				break;
			}
			
		} while (opcion != 1 && opcion != 2 && opcion != 3);
		
	}
	
	
	
	public static String comprobarSistemaOperativo() {
		String os;
		os  = System.getProperty("os.name");
		
		return  os;
	}

}
