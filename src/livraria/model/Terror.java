package livraria.model;

public class Terror extends Livraria{
	
	String editora;

	public Terror(int id, int tipo, String nome, String sinopse, double preco, String editora) {
		super(id, tipo, nome, sinopse, preco);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("A editora do livro é: "+ this.editora);
	}

	
	
	
	
	
}
