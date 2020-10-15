package comunes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Libro;

public class Escribirtxt {

	public boolean escribirTxt(String url, ArrayList<Libro> libro) {
		boolean boo = false;
		File txt = new File(url);
		try {
			FileWriter fw = new FileWriter(txt);
			BufferedWriter bfwriter = new BufferedWriter(fw);
			for (Libro l1 : libro) {
				bfwriter.write(l1.getTitulo() + "," + l1.getEditorial() + "," + l1.getPaginas()
						+ "," + l1.getAltura() + "," + l1.getNotas() + "," + l1.getIsbn() + "," + l1.getMaterias() + "\n");
			}
			boo=true;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Archivo no encontrado");
			boo= false;
		}
		
		return boo;
	}
}
