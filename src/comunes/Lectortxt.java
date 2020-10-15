package comunes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Libro;

public class Lectortxt {

	public static boolean lectorTxt(String enlace) throws FileNotFoundException  {
		boolean boo;
		try {	
		File readfichero = new File(enlace);
		FileReader fr = new FileReader (readfichero);
		BufferedReader br = new BufferedReader(fr);
	
			
			String linea = "";
			boo=true;
			while((linea=br.readLine())!=null) {
				
				System.out.println(linea);
			}
		} catch (Exception e) {
			boo=false;
			System.out.println("El sistema no puede encontrar el archivo especificado");
		}
		
		return boo;
	}
	
	public ArrayList<Libro> rellenarArray(String linea) {
		ArrayList<Libro> l1 = new ArrayList<Libro>();
		
		if(linea.contains("Titulo:")) {
			
		}
			
		
		return l1;
	}
}
