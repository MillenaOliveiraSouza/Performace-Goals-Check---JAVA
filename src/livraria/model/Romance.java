package livraria.model;

public class Romance extends Livraria{
	
	String autor;

	public Romance(int id, int tipo, String nome, String sinopse, double preco, String autor) {
		super(id, tipo, nome, sinopse, preco);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O autor do livro é: " + this.autor);
	}
	
}
