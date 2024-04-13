package views;

import java.util.Scanner;

public class Menu {

	public void interfaceUsuario() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Frente de Loja\n"
				+ "Opção 2: Manutenção no Cadastro\n" + "Opção 3: Sair\n");

		int opcao = sc.nextInt();

		if (opcao == 1) {

			frenteDeLoja();

		} else if (opcao == 2) {

			manutencaoNoCadastro();

		} else if (opcao == 3) {

			System.out.println("Encerramento ...");

		}

	}

	public void frenteDeLoja() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Gerenciar Veículo\n"
				+ "Opção 2: Gerenciar Loja\n" + "Opção 3: Gerenciar Vendedor\n" + "Opção 4: Gerenciar Cliente\n"
				+ "Opção 5: Gerenciar Venda\n" + "Opção 6: Voltar para o menu superior\n");

		int opcao = sc.nextInt();

		if (opcao == 1) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 1a: Consultar Veículo por Placa\n"
					+ "Opção 1b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("1a")) {

				// consultarVeiculoPlaca();

			} else if (op.equals("1b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 2a: Listar todas as Lojas\n"
					+ "Opção 2b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("2a")) {

				// listarLojas();

			} else if (op.equals("2b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 3a: Consultar Vendedor por Nome\n"
					+ "Opção 3b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("3a")) {

				// consultarVendedorNome();

			} else if (op.equals("3b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 4) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 4a: Cadastrar Cliente\n"
					+ "Opção 4b: Consultar Cliente por CPF\n" + "Opção 4c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("4a")) {

				// cadastrarCliente();

			} else if (op.equals("4b")) {

				// consultarClienteCpf();

			} else if (op.equals("4c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 5a: Cadastrar venda\n"
					+ "Opção 5b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("5a")) {

				// cadastrarVenda();

			} else if (op.equals("5b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 6) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!");

		}

	}

	public void manutencaoNoCadastro() {

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Gerenciar Veículo\n"
				+ "Opção 2: Gerenciar Loja\n" + "Opção 3: Gerenciar Vendedor\n" + "Opção 4: Gerenciar Cliente\n"
				+ "Opção 5: Gerenciar Venda\n" + "Opção 6: Voltar para o menu superior\n");

		Scanner sc = new Scanner(System.in);

		int opcao = sc.nextInt();

		if (opcao == 1) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 1a: Cadastrar veículo\n"
					+ "Opção 1b: Excluir veículo\n" + "Opção 1c: Alterar dados do veículo\n"
					+ "Opção 1d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("1a")) {

				// cadastrarVeiculo();

			} else if (op.equals("1b")) {

				// excluirVeiculo();

			} else if (op.equals("1c")) {

				// alterarDadosVeiculo();

			} else if (op.equals("1d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção 2a: Cadastrar Loja\n" + "Opção 2b: Excluir Loja\n"
							+ "Opção 2c: Alterar dados da Loja\n" + "Opção 2d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("2a")) {

				// cadastrarLoja();

			} else if (op.equals("2b")) {

				// excluirLoja();

			} else if (op.equals("2c")) {

				// alterarDadosLoja();

			} else if (op.equals("2d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 3a: Cadastrar Vendedor\n"
					+ "Opção 3b: Excluir Vendedor\n" + "Opção 3c: Alterar dados do Vendedor\n"
					+ "Opção 3d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("3a")) {

				// cadastrarVendedor();

			} else if (op.equals("3b")) {

				// excluirVendedor();

			} else if (op.equals("3c")) {

				// alterarDadosVendedor();

			} else if (op.equals("3d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 4) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 4a: Cadastrar Cliente\n"
					+ "Opção 4b: Excluir Cliente\n" + "Opção 4c: Alterar dados do Cliente\n"
					+ "Opção 4d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("4a")) {

				// cadastrarCliente();

			} else if (op.equals("4b")) {

				// excluirCliente();

			} else if (op.equals("4c")) {

				// alterarDadosCliente();

			} else if (op.equals("4d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção 5a: Cadastrar Venda\n" + "Opção 5b: Excluir Venda\n"
							+ "Opção 5c: Alterar dados da Venda\n" + "Opção 5d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("5a")) {

				// cadastrarVenda();

			} else if (op.equals("5b")) {

				// excluirVenda();

			} else if (op.equals("5c")) {

				// alterarDadosVenda();

			} else if (op.equals("5d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!");

			}

		} else if (opcao == 6) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!");

		}

	}

}
