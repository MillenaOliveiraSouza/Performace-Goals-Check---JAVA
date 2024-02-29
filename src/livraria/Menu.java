package livraria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import livraria.util.Cores;
import livraria.controller.LivrariaController;
import livraria.model.Romance;
import livraria.model.Terror;

public class Menu {

	public static void main(String[] args) {
		LivrariaController livros = new LivrariaController();

		Scanner leia = new Scanner(System.in);

		int opcao, id, tipo;
		String nome, sinopse, autor, editora;
		double preco;

		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_CYAN_BACKGROUND +
					"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     LIVRARIA                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Livro                      ");
			System.out.println("            2 - Listar todos os Livros               ");
			System.out.println("            3 - Buscar Livro por ID                  ");
			System.out.println("            4 - Atualizar Dados do Livro             ");
			System.out.println("            5 - Apagar Livro                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+ Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Você precisa digitar valores inteiros!");
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_CYAN_BACKGROUND+
						           "                     ATÉ LOGO...                     "+ Cores.TEXT_RESET);
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Livro\n\n");

				System.out.println("Digite o Nome do Livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("Digite o valor do Livro: ");
				preco = leia.nextDouble();

				System.out.println("Digite a sinopse do Livro: ");
				leia.skip("\\R?");
				sinopse = leia.nextLine();

				System.out.println("Digite o gênero do Livro (1) Romance ou (2) Terror: ");
				tipo = leia.nextInt();

				if (tipo == 1) {

					System.out.println("Digite o nome do autor do Livro: ");
					leia.skip("\\R?");
					autor = leia.nextLine();
					livros.criarLivraria(new Romance(livros.gerarId(), tipo, nome, sinopse, preco, autor));

				} else if (tipo == 2) {

					System.out.println("Digite o nome da Editora do Livro: ");
					leia.skip("\\R?");
					editora = leia.nextLine();
					livros.criarLivraria(new Terror(livros.gerarId(), tipo, nome, sinopse, preco, editora));

				} else {

					System.out.println("Esse genero é inválido, tente novamente mais tarde! ");

				}

				keyPress();
				break;

			case 2:
				
				System.out.println("Lista de todos os Livros\n\n");
				livros.listarTodos();				
				
				keyPress();
				break;
				
			case 3:
				
				System.out.println("Consultar dados do Livro por ID\n\n");
				System.out.println("Digite o ID do livro: \n\n");
				leia.skip("\\R?");
				id = leia.nextInt();

				livros.consultarId(id);
				
				keyPress();
				break;
				
			case 4:
				
				System.out.println("Atualizar dados do Livro\n\n");
				
				System.out.println("Digite o ID do livro: \n\n");
				id = leia.nextInt();

				var livroBuscar = livros.buscarNaCollection(id);
				
				if (livroBuscar != null) {
					
					System.out.println("Digite o nome do livro: ");
					leia.nextLine();
					nome = leia.nextLine();
					
					System.out.println("Digite o valor do Livro: ");
					preco = leia.nextDouble();
					
					System.out.println("Digite a sinopse do Livro: ");
					leia.nextLine();
					sinopse = leia.nextLine();
					
					System.out.println("Digite o gênero do Livro (1) Romance ou (2) Terror: ");
					tipo = leia.nextInt();

					if (tipo == 1) {

						System.out.println("Digite o nome do autor do Livro: ");
						leia.skip("\\R?");
						autor = leia.nextLine();
						livros.atualizar(new Romance(id, tipo, nome, sinopse, preco, autor));

					} else if (tipo == 2) {

						System.out.println("Digite o nome da Editora do Livro: ");
						leia.skip("\\R?");
						editora = leia.nextLine();
						livros.atualizar(new Terror(id, tipo, nome, sinopse, preco, editora));

					} else {

						System.out.println("Esse gênero é inválido, tente novamente mais tarde! ");

					}
				
				}
				
				keyPress();
				break;
				
			case 5:
				System.out.println("Apagar Livro\n\n");

				System.out.println("Digite o ID do livro: \n\n");
				leia.skip("\\R?");
				id = leia.nextInt();
				
				livros.deletar(id);

				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}
	
	public static void sobre() {

		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_CYAN_BACKGROUND +
				"\n*****************************************************");
		System.out.println("Projeto Desenvolvimento por:                         ");
		System.out.println("Millena Oliveira                                     ");
		System.out.println("*****************************************************"+ Cores.TEXT_RESET);

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
