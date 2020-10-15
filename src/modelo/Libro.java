package modelo;

public class Libro {
	
	private String titulo;
	private String editorial;
	private int paginas;
	private int altura;
	private String notas;
	private String isbn;
	private String materias;
	
	
	public Libro(String titulo, String editorial, int paginas, int altura, String notas, String isbn, String materias) {

		this.titulo = titulo;
		this.editorial = editorial;
		this.paginas = paginas;
		this.altura = altura;
		this.notas = notas;
		this.isbn = isbn;
		this.materias = materias;
	}
	
	public Libro() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public String getNotas() {
		return notas;
	}


	public void setNotas(String notas) {
		this.notas = notas;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getMaterias() {
		return materias;
	}


	public void setMaterias(String materias) {
		this.materias = materias;
	}

}
