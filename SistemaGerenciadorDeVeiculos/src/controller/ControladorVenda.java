package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import models.Clientes;
import models.TipoDeVeiculos;
import models.Venda;
import models.Vendedores;

public class ControladorVenda {

	private static List<Venda> vendas;

	public ControladorVenda() {
		this.vendas = new ArrayList<>();
	}

	public static boolean validarId(int id) {
		return id >= 0 && id < vendas.size();

	}

	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		List<Clientes> clientes = ControladorCliente.getCliente();
		List<TipoDeVeiculos> veiculos = ControladorVeiculos.getVeiculo();
		List<Vendedores> vendedores = ControladorVendedor.getVendedor();

		boolean localizado = false;

		TipoDeVeiculos veiculoVendido = null;
		Vendedores vendedorResponsavel = null;
		Clientes clienteComprador = null;
		SimpleDateFormat data = new SimpleDateFormat("[dd/MM/yyyy - HH:mm]");

		System.out.println("Digite a placa do veículo vendido: ");

		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		for (TipoDeVeiculos veiculo : veiculos) {

			if (veiculo.getPlaca().equals(placa)) {
				veiculoVendido = veiculos.get(veiculo.getId() - 1);
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("Veículo informado não localizado!\n");
		}

		localizado = false;

		System.out.println("Digite o nome do vendedor responsável pela venda: ");

		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		for (Vendedores vendedor : vendedores) {

			if (vendedor.getNome().equalsIgnoreCase(nome)) {
				vendedorResponsavel = vendedores.get(vendedor.getId() - 1);
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("Vendedor informado não localizado!\n");
		}

		localizado = false;

		System.out.println("Digite o CPF do cliente comprador: ");

		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		for (Clientes cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				clienteComprador = clientes.get(cliente.getId() - 1);
				localizado = true;
			}
		}

		if (localizado == false) {

			System.out.println("Cliente informado não localizado!\n");
		}

		Date dataAtual = new Date();
		String dataDaVenda = data.format(dataAtual);

		if (!Validadores.validarVeiculoVendido(veiculoVendido)
				|| !Validadores.validarVendedorResponsavel(vendedorResponsavel)
				|| !Validadores.validarClienteComprador(clienteComprador)) {
			System.out.println("Os parâmetros informados não foram localizados, venda não cadastrada!");
		} else {

			Venda.setContador(Venda.getContador() + 1);
			vendas.add(new Venda(veiculoVendido, vendedorResponsavel, clienteComprador, dataDaVenda));
			System.out.println("Cadastramento da venda realizado com sucesso!");
		}

	}

	public void buscar() {

		boolean localizado = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ID da venda que deseja buscar: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int id = sc.nextInt() - 1;

		while (!validarId(id)) {
			System.out.println("ID inválido, tente novamente: ");

			while (!sc.hasNextInt()) {
				System.out.println("ID inválido, tente novamente: ");
				sc.next();
			}

			id = sc.nextInt() - 1;
		}

		for (Venda venda : vendas) {

			if (venda.getId() == id + 1) {
				System.out.println(vendas.toString());
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("Id informado não localizado!\n");
		}

	}

	public void excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ID do cliente que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int id = sc.nextInt() - 1;

		while (!validarId(id)) {
			System.out.println("ID inválido, tente novamente: ");

			while (!sc.hasNextInt()) {
				System.out.println("ID inválido, tente novamente: ");
				sc.next();
			}

			id = sc.nextInt() - 1;
		}

		vendas.remove(id);

		System.out.println("Venda excluída com sucesso!\n");
	}

}
