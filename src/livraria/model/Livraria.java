package livraria.model;

public abstract class Livraria {
	
	private int id, tipo;
	private String nome, sinopse;
	private double preco;
	
	
	
	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public Livraria(int id, int tipo, String nome, String sinopse, double preco) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.sinopse = sinopse;
		this.preco = preco;
	}

	
	public void visualizar() {

		String tipoLivraria = "";

		switch (this.tipo) {
		case 1:
			tipoLivraria = "Romance";
			break;
		case 2:
			tipoLivraria = "Terror";
			break;
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("\nDados do Livro\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("ID do livro: " + this.id);
		System.out.println("Nome do livro: " + this.nome);
		System.out.printf("Preço do livro: R$ %.2f ", this.preco);
		System.out.println("\nTipo de livro: " + tipoLivraria);
		System.out.println("Sinopse do livro: " + this.sinopse);

		

	}
	
}
