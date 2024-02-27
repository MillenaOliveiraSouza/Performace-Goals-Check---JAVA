package livro.model;

public class Terror extends Livro {
	
	private String nomeEditora;

	public Terror(int id, int generoLivro, String nomeLivro, String sinopse, float valor, String nomeEditora) {
		super(id, generoLivro, nomeLivro, sinopse, valor);
		this.nomeEditora = nomeEditora;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Editora: "+ nomeEditora);
	}

}
