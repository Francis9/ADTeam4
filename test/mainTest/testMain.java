package mainTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import comunes.LectorXml;
import comunes.Lectorcsv;
import comunes.Lectortxt;
import modelo.Libro;
import principal.Programa;

class testMain {
	
	/*
	
	   _            _      _____  _______      __
	  | |          | |    / ____|/ ____\ \    / /
	  | |_ ___  ___| |_  | |    | (___  \ \  / / 
	  | __/ _ \/ __| __| | |     \___ \  \ \/ /  
	  | ||  __/\__ \ |_  | |____ ____) |  \  /   
	   \__\___||___/\__|  \_____|_____/    \/   
	
	
	*/
	@Test
	void testCsv() {
		Lectorcsv Lc = new Lectorcsv();
		ArrayList <Libro> listaLibros = new ArrayList <Libro>();
		assertEquals(true, (listaLibros = (Lc.obtenerLibrosCsv("listalibros.csv"))) != null);
		
		
	}
	
	@Test
	void testLectorCsvFallo() {
		
		Lectorcsv Lc = new Lectorcsv();
		ArrayList <Libro> listaLibros = new ArrayList <Libro>();
		assertEquals(true, (listaLibros = (Lc.obtenerLibrosCsv(null))).size() == 0);
	
	}
	
	/*
	   _            _     _________   _________ 
	  | |          | |   |__   __\ \ / /__   __|
	  | |_ ___  ___| |_     | |   \ V /   | |   
	  | __/ _ \/ __| __|    | |    > <    | |   
	  | ||  __/\__ \ |_     | |   / . \   | |   
	   \__\___||___/\__|    |_|  /_/ \_\  |_| 
	
	
	*/
	
	
	@Test
	void testLectorTxt() throws IOException {
		
		Lectortxt LT = new Lectortxt();
	
		

	
			assertEquals(true, LT.lectorTxt("listalibros.txt"));
		
	}
	
	@Test
	void testLectorTxtFallo() throws IOException  {

		Lectortxt LTError = new Lectortxt();
	 
		
		
			assertEquals(false,LTError.lectorTxt("excepcion.txt"));
		
		
		
	}
	/*
	   _            _    __   ____  __ _      
	  | |          | |   \ \ / /  \/  | |     
	  | |_ ___  ___| |_   \ V /| \  / | |     
	  | __/ _ \/ __| __|   > < | |\/| | |     
	  | ||  __/\__ \ |_   / . \| |  | | |____ 
	   \__\___||___/\__| /_/ \_\_|  |_|______|
	                                            */
	@Test
	void testLectorXML() throws FileNotFoundException   {
		
		LectorXml LX = new LectorXml();
		assertEquals(true,LX.LeerArchivoXML(("Libros.xml")));
		assertEquals(false,LX.LeerArchivoXML("Exception.xml"));
		
		 

	}
	/*
	
	   _            _     __  __       _       
	  | |          | |   |  \/  |     (_)      
	  | |_ ___  ___| |_  | \  / | __ _ _ _ __  
	  | __/ _ \/ __| __| | |\/| |/ _` | | '_ \ 
	  | ||  __/\__ \ |_  | |  | | (_| | | | | |
	   \__\___||___/\__| |_|  |_|\__,_|_|_| |_|
	
	*/
	
	
	
	@Test
	void testmain1() {
		Programa main = new Programa();
		String input = "1 \n 1 \n 0";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	    Scanner teclado = new Scanner(System.in); 
		assertEquals(true, main.iniciarPrograma(teclado)); 
	}
		
		
	@Test
	void testmain2() {
		
		String input = "2 \n 1 \n 0";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	    Scanner teclado = new Scanner(System.in); 
		assertEquals(true, Programa.iniciarPrograma(teclado)); 

	}
	
	@Test
	void testmain3() {
		
		String input = "3 \n 1 \n 0";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	    Scanner teclado = new Scanner(System.in); 
		assertEquals(true, Programa.iniciarPrograma(teclado)); 

	}
	
	@Test
	void testmain4() {
		
		String input = "a \n 0 \n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	    Scanner teclado = new Scanner(System.in); 
		assertEquals(true, Programa.iniciarPrograma(teclado)); 

	}
	/*
	   _            _     _      _ _               
	  | |          | |   | |    (_) |              
	  | |_ ___  ___| |_  | |     _| |__  _ __ ___  
	  | __/ _ \/ __| __| | |    | | '_ \| '__/ _ \ 
	  | ||  __/\__ \ |_  | |____| | |_) | | | (_) |
	   \__\___||___/\__| |______|_|_.__/|_|  \___/ 
	*/
	
	@Test
	void testConstructorLibro() {
		
		Libro libro = new Libro("ah","ah",3, 2,"ah","ah","ah");
		assertEquals("ah", libro.getEditorial()); 

	}
	
	
}
