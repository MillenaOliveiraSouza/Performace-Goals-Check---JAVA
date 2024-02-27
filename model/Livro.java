package livro.model;

public abstract class Livro {
	
	private int id;
	private int generoLivro;
	private String nomeLivro, sinopse;
	private float valor;
	
	public Livro(int id, int generoLivro, String nomeLivro, String sinopse,float valor) {
		this.id = id;
		this.generoLivro = generoLivro;
		this.nomeLivro = nomeLivro;
		this.sinopse = sinopse;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGeneroLivro() {
		return generoLivro;
	}

	public void setGeneroLivro(int generoLivro) {
		this.generoLivro = generoLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	

	public void visualizar() {

		String generoLivro = "";
		
		switch(this.generoLivro) {
		case 1:
			generoLivro = "Romance";
		break;
		case 2:
			generoLivro = "Terror";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Livro:");
		System.out.println("***********************************************************");
		System.out.println("ID do Livro: " + this.id);
		System.out.println("Nome do livro: " + this.nomeLivro);
		System.out.println("Genero do Livro: " + generoLivro);
		System.out.println("Valor do Livro: " + this.valor);
		System.out.println("Sinopse do Livro: " + this.sinopse);
		System.out.println("***********************************************************");

	}
	
}
