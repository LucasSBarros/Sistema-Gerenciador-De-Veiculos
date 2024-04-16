package views;

import java.util.Scanner;
import controller.ControladorVenda;
import controller.ControladorCliente;
import controller.ControladorLoja;
import controller.ControladorVeiculos;
import controller.ControladorVendedor;

public class Menu {

	ControladorCliente controladorCliente = new ControladorCliente();
	ControladorVendedor controladorVendedor = new ControladorVendedor();
	ControladorLoja controladorLoja = new ControladorLoja();
	ControladorVeiculos controladorVeiculos = new ControladorVeiculos();
	ControladorVenda controladorVenda = new ControladorVenda();

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

				controladorVeiculos.buscar();
				frenteDeLoja();

			} else if (op.equals("1b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 2a: Listar todas as Lojas\n"
					+ "Opção 2b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("2a")) {

				controladorLoja.buscar();
				frenteDeLoja();

			} else if (op.equals("2b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 3a: Consultar Vendedor por Nome\n"
					+ "Opção 3b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("3a")) {

				controladorVendedor.buscar();
				frenteDeLoja();

			} else if (op.equals("3b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 4) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 4a: Cadastrar Cliente\n"
					+ "Opção 4b: Consultar Cliente por CPF\n" + "Opção 4c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("4a")) {

				controladorCliente.cadastrar();
				frenteDeLoja();

			} else if (op.equals("4b")) {

				controladorCliente.buscar();
				frenteDeLoja();

			} else if (op.equals("4c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 5a: Cadastrar venda\n"
					+ "Opção 5b: Consultar Venda\n" + "Opção 5c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("5a")) {

				controladorVenda.cadastrar();
				frenteDeLoja();

			} else if (op.equals("5b")) {

				controladorVenda.buscar();
				frenteDeLoja();

			} else if (op.equals("5c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 6) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!\n");
			frenteDeLoja();

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

				controladorVeiculos.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("1b")) {

				controladorVeiculos.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("1c")) {

				controladorVeiculos.alterar();
				manutencaoNoCadastro();

			} else if (op.equals("1d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção 2a: Cadastrar Loja\n" + "Opção 2b: Excluir Loja\n"
							+ "Opção 2c: Alterar dados da Loja\n" + "Opção 2d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("2a")) {

				controladorLoja.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("2b")) {

				controladorLoja.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("2c")) {

				controladorLoja.alterar();
				manutencaoNoCadastro();

			} else if (op.equals("2d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 3a: Cadastrar Vendedor\n"
					+ "Opção 3b: Excluir Vendedor\n" + "Opção 3c: Alterar dados do Vendedor\n"
					+ "Opção 3d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("3a")) {

				controladorVendedor.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("3b")) {

				controladorVendedor.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("3c")) {

				controladorVendedor.alterar();
				manutencaoNoCadastro();

			} else if (op.equals("3d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 4) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 4a: Cadastrar Cliente\n"
					+ "Opção 4b: Excluir Cliente\n" + "Opção 4c: Alterar dados do Cliente\n"
					+ "Opção 4d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("4a")) {

				controladorCliente.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("4b")) {

				controladorCliente.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("4c")) {

				controladorCliente.alterar();
				manutencaoNoCadastro();

			} else if (op.equals("4d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção 5a: Cadastrar Venda\n"
					+ "Opção 5b: Excluir Venda\n" + "Opção 5c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("5a")) {

				controladorVenda.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("5b")) {

				controladorVenda.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("5c")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 6) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!\n");
			manutencaoNoCadastro();

		}

	}

}
