package comunes;

import modelo.Libro;
import principal.Programa;

public class RellenarLibro {
	
	public static void rellenarLibro(Libro libro) {
		
		System.out.print("Introduzca el título del libro: ");
		libro.setTitulo(Programa.teclado.nextLine());
		
		System.out.print("Introduzca la editorial del libro: ");
		libro.setEditorial(Programa.teclado.nextLine());
		
		System.out.print("Introduzca las páginas del libro: ");
		libro.setPaginas(Programa.teclado.nextInt());
		Programa.teclado.nextLine();
		
		System.out.print("Introduzca la altura del libro: ");
		libro.setAltura(Programa.teclado.nextInt());
		Programa.teclado.nextLine();
		
		System.out.print("Introduzca las notas del libro: ");
		libro.setNotas(Programa.teclado.nextLine());
		
		System.out.print("Introduzca el ISBN del libro: ");
		libro.setIsbn(Programa.teclado.nextLine());
		
		System.out.print("Introduzca las materias del libro: ");
		libro.setMaterias(Programa.teclado.nextLine());
		
	}

}
