package comunes;

import java.util.ArrayList;

import modelo.Libro;

public class MostrarDatos {
	
	public static void mostrarLibros(ArrayList <Libro> listaLibros) {
		
		for (Libro libro: listaLibros) {
			
			System.out.println("Libro " + (listaLibros.indexOf(libro) + 1));
	        System.out.println("\tTítulo: " + libro.getTitulo());
	        System.out.println("\tEditorial: " + libro.getTitulo());	
	        System.out.println("\tPáginas: " + libro.getPaginas());
	        System.out.println("\tAltura: " + libro.getAltura());
	        System.out.println("\tNotas: " + libro.getNotas());
	        System.out.println("\tISBN: " + libro.getIsbn());
	        System.out.println("\tMaterias: " + libro.getMaterias());
			
		}
		
	}

}
