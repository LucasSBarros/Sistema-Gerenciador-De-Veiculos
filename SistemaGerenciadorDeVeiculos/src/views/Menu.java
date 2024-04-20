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

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Consultar Veículo por Placa\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorVeiculos.buscar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Listar todas as Lojas\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorLoja.buscar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Consultar Vendedor por Nome\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorVendedor.buscar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 4) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Cliente\n"
					+ "Opção b: Consultar Cliente por CPF\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorCliente.cadastrar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				controladorCliente.buscar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar venda\n"
					+ "Opção b: Consultar Venda\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorVenda.cadastrar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				controladorVenda.buscar();
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("c")) {

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

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar veículo\n"
					+ "Opção b: Excluir veículo\n" + "Opção c: Alterar dados do veículo\n"
					+ "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorVeiculos.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				controladorVeiculos.excluir();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				controladorVeiculos.alterar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 2) {

			sc.nextLine();

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Loja\n" + "Opção b: Excluir Loja\n"
							+ "Opção c: Alterar dados da Loja\n" + "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorLoja.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				controladorLoja.excluir();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				controladorLoja.alterar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 3) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Vendedor\n"
					+ "Opção b: Excluir Vendedor\n" + "Opção c: Alterar dados do Vendedor\n"
					+ "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorVendedor.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				controladorVendedor.excluir();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				controladorVendedor.alterar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 4) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Cliente\n"
					+ "Opção b: Excluir Cliente\n" + "Opção c: Alterar dados do Cliente\n"
					+ "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				controladorCliente.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				controladorCliente.excluir();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				controladorCliente.alterar();
				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao == 5) {

			sc.nextLine();

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Venda\n"
					+ "Opção b: Excluir Venda\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("a")) {

				controladorVenda.cadastrar();
				manutencaoNoCadastro();

			} else if (op.equals("b")) {

				controladorVenda.excluir();
				manutencaoNoCadastro();

			} else if (op.equals("c")) {

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
