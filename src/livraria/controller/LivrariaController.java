package livraria.controller;

import java.util.ArrayList;

import livraria.model.Livraria;
import livraria.repository.LivrariaRepository;

public class LivrariaController implements LivrariaRepository {

	private ArrayList<Livraria> listaLivros = new ArrayList<Livraria>();
	int id = 0;

	@Override
	public void criarLivraria(Livraria livro) {

		listaLivros.add(livro);
		System.out.println("O livro ID: " + livro.getId() + " foi criado com sucesso!");

	}

	@Override
	public void listarTodos() {
		for (var livro : listaLivros) {
			livro.visualizar();
		}
	}

	@Override
	public void consultarId(int id) {

		Livraria livro = buscarNaCollection(id);

		if (livro != null)
			livro.visualizar();
		else
			System.out.println("\nO livro com ID: " + id + " não foi encontrado!");

	}

	@Override
	public void atualizar(Livraria livro) {

		var livroBuscar = buscarNaCollection(livro.getId());

		if (livroBuscar != null) {
			listaLivros.set(listaLivros.indexOf(livroBuscar), livro);
			System.out.println("O livro ID: " + livro.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("O livro ID: " + livro.getId() + " não foi encontrado!");

	}

	@Override
	public void deletar(int id) {

		Livraria livro = buscarNaCollection(id);

		if (livro != null) {

			if (listaLivros.remove(livro) == true)
				System.out.println("O livro ID:  " +id + " foi deletado com sucesso! ");
		} else

			System.out.println("O livro ID: " + id + " não foi encontrado!");

	}

	public int gerarId() { 
		return ++id;
	}

	public Livraria buscarNaCollection(int id) { 
		for (Livraria livro : listaLivros) {
			if (livro.getId() == id) {
				return livro;
			}
		}

		return null;
	}
}
