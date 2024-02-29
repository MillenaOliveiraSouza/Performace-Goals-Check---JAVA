package livraria.repository;

import livraria.model.Livraria;

public interface LivrariaRepository {

	public void criarLivraria(Livraria livro);

	public void listarTodos();

	public void consultarId(int id);

	public void atualizar(Livraria livro);

	public void deletar(int id);
	
}
