package livro.model;

public class Romance extends Livro{
	
	private String autor;

	public Romance(int id, int generoLivro, String nomeLivro, String sinopse, float valor, String autor) {
		super(id, generoLivro, nomeLivro, sinopse, valor);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Autor: "+ autor);
	}
	
}
