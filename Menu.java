package livro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao, id, generoLivro;
		String nomeLivro;
		float valor;

		while (true) {

			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                       LIVRARIA                           ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                1 - CADASTRAR LIVRO                        ");
			System.out.println("                2 - LISTAR TODOS OS LIVROS                 ");
			System.out.println("                3 - BUSCAR LIVRO POR ID                    ");
			System.out.println("                4 - ATUALIZAR INFROMAÇÕES DE UM LIVRO      ");
			System.out.println("                5 - DELETAR LIVRO POR ID                   ");
			System.out.println("                6 - SAIR                                   ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA:                                ");
			System.out.println("                                                           ");

			try {

				opcao = leia.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("\nDigite valores interiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {

				System.out.println("\n ATÉ LOGO");
				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1:

				System.out.println("Cadastrar Livro \n\n");

				System.out.println("Digite o Número dO ID: ");
				id = leia.nextInt();

				System.out.println("Digite o Nome do Livro: ");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();

				System.out.println("Digite o gênero (1)romance ou (2) terror: ");
				generoLivro = leia.nextInt();

				keyPress();
				break;
			case 2:

				System.out.println("Listar todas os Livros \n\n");
				keyPress();
				break;

			case 3:

				System.out.println("Consultar dados do livro por id\n\n");

				System.out.println("Digite o gênero (1)romance ou (2) terror: ");
				generoLivro = leia.nextInt();

				keyPress();
				break;

			case 4:

				System.out.println("Atualizar dados do Livro \n\n");

				System.out.println("Digite o id do Livro: ");
				id = leia.nextInt();

				keyPress();
				break;

			case 5:

				System.out.println("Apagar a Livro \n\n");

				System.out.println("Digite o id do Livro: ");
				id = leia.nextInt();

				keyPress();
				break;

			default:

				System.out.println("Opção inválida!");
				keyPress();
				break;
			}
		}
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
