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

	private List<Venda> vendas;
	
	public ControladorVenda() {
		this.vendas = new ArrayList<>();
	}

	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		List<Clientes> clientes = ControladorCliente.getCliente();
		List<TipoDeVeiculos> veiculos = ControladorVeiculos.getVeiculo();
		List<Vendedores> vendedores = ControladorVendedor.getVendedor();

		TipoDeVeiculos veiculoVendido = null;
		Vendedores vendedorResponsavel = null;
		Clientes clienteComprador = null;
		SimpleDateFormat data = new SimpleDateFormat("[dd/MM/yyyy - HH:mm]");

		System.out.println("Digite a placa do veículo vendido: ");

		String placa = sc.nextLine();

		System.out.println();

		for (TipoDeVeiculos veiculo : veiculos) {

			if (veiculo.getPlaca().equals(placa)) {
				veiculoVendido = veiculos.get(veiculo.getId() - 1);
			}

		}

		System.out.println("Digite o nome do vendedor responsável pela venda: ");

		String nome = sc.nextLine();

		for (Vendedores vendedor : vendedores) {

			if (vendedor.getNome().equals(nome)) {
				vendedorResponsavel = vendedores.get(vendedor.getId() - 1);
			}

		}

		System.out.println("Digite o CPF do cliente comprador: ");

		String cpf = sc.nextLine();

		for (Clientes cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				clienteComprador = clientes.get(cliente.getId() - 1);
			}
		}

		Venda.setContador(Venda.getContador() + 1);
		
		Date dataAtual = new Date();
		String dataDaVenda = data.format(dataAtual);

		vendas.add(new Venda(veiculoVendido, vendedorResponsavel, clienteComprador, dataDaVenda));

	}

	public void buscar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da venda que deseja buscar: ");
		int id = sc.nextInt();

		for (Venda venda : vendas) {

			if (venda.getId() == id) {
				System.out.println(vendas.toString());
			}

		}

	}

	public void excluir() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do cliente que deseja excluir: ");
		int id = sc.nextInt() - 1;
		vendas.remove(id);

	}

}
