package comunes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Libro;

public class Lectorcsv {

	public static final String SEPARATOR = ";";
	public static final String QUOTE = "\"";

	public static ArrayList <Libro> obtenerLibrosCsv(String archivo) {

		BufferedReader br = null;
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();

		try {

			br = new BufferedReader(new FileReader(archivo));
			String line = br.readLine();
			while (null != line) {
				String[] fields = line.split(SEPARATOR);
				fields = removeTrailingQuotes(fields);

				if (!fields[0].equals("Título")) {
					fields = removeTrailingQuotes(fields);
					Libro libro = new Libro();
					libro.setTitulo(fields[0]);
					libro.setEditorial(fields[1]);
					libro.setPaginas(Integer.valueOf(fields[2]));
					libro.setAltura(Integer.valueOf(fields[3]));
					libro.setNotas(fields[4]);
					libro.setIsbn(fields[5]);
					libro.setMaterias(fields[6]);
					listaLibros.add(libro);
					
				}

				line = br.readLine();
			}

		} catch (Exception e) {

		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block

				}
			}
		}

		if (listaLibros.size() == 0) {
			
			System.out.println("El archivo no contiene ningún libro");
			return listaLibros;
			
		} else {
			
			return listaLibros;
		}

	}

	private static String[] removeTrailingQuotes(String[] fields) {

		String result[] = new String[fields.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = fields[i].replaceAll(QUOTE, "");
		}
		return result;
	}
	
	public static boolean escribirCsv(String url, ArrayList<Libro> listaLibros) {
		
		boolean boo = false;
		File csv = new File(url);
		
		try {
			FileWriter fw = new FileWriter(csv);
			BufferedWriter bfwriter = new BufferedWriter(fw);
			bfwriter.write("Título" + SEPARATOR + "Editorial" + SEPARATOR + "Páginas"
			+ SEPARATOR + "Altura" + SEPARATOR + "Notas" + SEPARATOR + "ISBN" + SEPARATOR + "Materias" + "\n");
			
			for (Libro libro : listaLibros) {
				bfwriter.write(libro.getTitulo() + SEPARATOR + libro.getEditorial() + SEPARATOR + libro.getPaginas()
						+ SEPARATOR + libro.getAltura() + SEPARATOR + libro.getNotas() + SEPARATOR+ libro.getIsbn() + SEPARATOR + libro.getMaterias() + "\n");
			}
			
			boo=true;
			bfwriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Archivo no encontrado");
			boo= false;
		}
		
		return boo;
	}

}
