package livro.repository;

import java.util.List;
import livro.model.Livro;

public interface LivroRepository {
	
	void cadastrarLivro (Livro livro);
	
	List<Livro> litarLivros();
	
	Livro buscarLivroPorId(Livro livro);
	
	void atualizarLivro (Livro livro);
	
	void deletarLivro (int id);

}
