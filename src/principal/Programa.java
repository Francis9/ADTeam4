package principal;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import comunes.LectorXml;
import comunes.Lectorcsv;
import comunes.Lectortxt;
import comunes.MostrarDatos;
import comunes.RellenarLibro;
import modelo.Libro;

public class Programa {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iniciarPrograma(teclado);

	}

	public static boolean iniciarPrograma(Scanner teclado) {

		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;

		System.out.println("¿Con qué tipo de fichero quiere trabajar?");

		do {

			System.out.println();
			System.out.println("Introduzca 1 para trabajar con un fichero .txt");
			System.out.println("Introduzca 2 para trabajar con un fichero .xml");
			System.out.println("Introduzca 3 para trabajar con un fichero .csv");
			System.out.println("Introduzca 0 para salir");
			System.out.println();
			System.out.print("Elija su opción: ");

			try {
				opcion = teclado.nextInt();
				teclado.nextLine();

			} catch (InputMismatchException e) {
				opcion = -1;
				teclado.nextLine();
			}

			if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 0) {

				System.out.println();
				System.out.println("Opción incorrecta, vuelva a elegir");
			}

			System.out.println();

			switch (opcion) {
			case 1:
				
				System.out.println("Ha elegido trabajar con un fichero .txt");
				System.out.println();
				System.out.println("Introduzca 1 para leer el fichero");
				System.out.println("Introduzca 2 para editar el fichero");
				System.out.println();
				System.out.print("Elija su opción: ");
				opcion2 = teclado.nextInt();
				teclado.nextLine();
				
				switch (opcion2) {
				case 1:
					try {
						Lectortxt.lectorTxt("listalibros.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					
					switch (opcion3) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;	

					default:
						break;
					}
					
					break;

				default:
					break;
				}

				break;

			case 2:
				
				System.out.println("Ha elegido trabajar con un fichero .xml");
				System.out.println();
				System.out.println("Introduzca 1 para leer el fichero");
				System.out.println("Introduzca 2 para editar el fichero");
				System.out.println();
				System.out.print("Elija su opción: ");
				opcion2 = teclado.nextInt();
				teclado.nextLine();

				try {
					LectorXml.LeerArchivoXML("Libros.xml");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				switch (opcion2) {
				case 1:
					try {
						Lectortxt.lectorTxt("listalibros.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 2:
					
					switch (opcion3) {
					case 1:
						
						break;
						
					case 2:
						
						break;
						
					case 3:
						
						break;

					default:
						break;
					}
					
					break;

				default:
					break;
				}

				break;

			case 3:
				
				System.out.println("Ha elegido trabajar con un fichero .csv");
				System.out.println();
				System.out.println("Introduzca 1 para leer el fichero");
				System.out.println("Introduzca 2 para editar el fichero");
				System.out.println();
				System.out.print("Elija su opción: ");
				opcion2 = teclado.nextInt();
				teclado.nextLine();
				
				switch (opcion2) {
				case 1:
					System.out.println("Ha elegido leer el fichero .csv");
					System.out.println();	
					MostrarDatos.mostrarLibros(new ArrayList <Libro>(Lectorcsv.obtenerLibrosCsv("listalibros.csv")));
					break;
					
				case 2:
					System.out.println("Ha elegido editar el fichero .csv");
					System.out.println();
					System.out.println("Introduzca 1 para añadir un libro al fichero");
					System.out.println("Introduzca 2 para editar un libro del fichero");
					System.out.println("Introduzca 3 para eliminar un libro del fichero");
					System.out.println();
					System.out.print("Elija su opción: ");
					opcion3 = teclado.nextInt();
					teclado.nextLine();
					
					switch (opcion3) {
					case 1:
						System.out.println("Ha elegido añadir un libro al fichero .csv");
						System.out.println();
						Libro libro = new Libro();
						RellenarLibro.rellenarLibro(libro);
						ArrayList <Libro> listaLibros = Lectorcsv.obtenerLibrosCsv("listalibros.csv");
						listaLibros.add(libro);
						Lectorcsv.escribirCsv("listalibros.csv", listaLibros);
						System.out.println("El nuevo libro ha sido añadido");
						
						break;
						
					case 2:
						int numeroaEditar = 0;
						System.out.println("Ha elegido editar un libro del fichero");
						ArrayList <Libro> listaLibrosEditar = new ArrayList <Libro>(Lectorcsv.obtenerLibrosCsv("listalibros.csv"));
						MostrarDatos.mostrarLibros(listaLibrosEditar);
						System.out.println();
						System.out.print("Escriba el número del libro que desea editar: ");
						numeroaEditar = teclado.nextInt();
						teclado.nextLine();
						if (numeroaEditar > listaLibrosEditar.size() || numeroaEditar < listaLibrosEditar.size()) {
							
							System.out.println("El número de libro introducido no existe");
	
						} else {
							
							RellenarLibro.rellenarLibro(listaLibrosEditar.get(numeroaEditar - 1));
							Lectorcsv.escribirCsv("listalibros.csv", listaLibrosEditar);
							System.out.println("El libro " + numeroaEditar + " ha sido editado");
						}
						
						break;
						
					case 3:
						int numeroaBorrar = 0;
						System.out.println("Ha elegido borrar un libro del fichero");
						ArrayList <Libro> listaLibrosBorrar = new ArrayList <Libro>(Lectorcsv.obtenerLibrosCsv("listalibros.csv"));
						MostrarDatos.mostrarLibros(listaLibrosBorrar);
						System.out.println();
						System.out.print("Escriba el número del libro que desea editar: ");
						numeroaBorrar = teclado.nextInt();
						teclado.nextLine();
						if (numeroaBorrar > listaLibrosBorrar.size() || numeroaBorrar < listaLibrosBorrar.size()) {
							
							System.out.println("El número de libro introducido no existe");
	
						} else {
							
							listaLibrosBorrar.remove(numeroaBorrar - 1);
							Lectorcsv.escribirCsv("listalibros.csv", listaLibrosBorrar);
							System.out.println("El libro " + numeroaBorrar + " ha sido borrado");
						}
						
						break;

					default:
						break;
					}
					
					break;

				default:
					break;
				}

				break;

			default:
				break;
			}

		} while (opcion != 0);
		
		System.out.println("Saliendo...");

		return true;

	}

}