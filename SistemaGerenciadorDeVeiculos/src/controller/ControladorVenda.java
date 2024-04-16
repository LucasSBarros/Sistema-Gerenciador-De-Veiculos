package controller;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import models.Clientes;
import models.TipoDeVeiculos;
import models.Venda;
import models.Vendedores;

public class ControladorVenda {

	private List<Venda> vendas;

	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		List<Clientes> clientes = ControladorCliente.getCliente();
		List<TipoDeVeiculos> veiculos = ControladorVeiculos.getVeiculo();
		List<Vendedores> vendedores = ControladorVendedor.getVendedor();

		TipoDeVeiculos veiculoVendido = null;
		Vendedores vendedorResponsavel = null;
		Clientes clienteComprador = null;
		SimpleDateFormat dataDaVenda = new SimpleDateFormat("[dd/MM/yyyy - HH:mm]");

		System.out.println("Digite a placa do veículo vendido: ");

		String placa = sc.nextLine();

		for (TipoDeVeiculos veiculo : veiculos) {

			veiculoVendido = veiculo;

		}

		System.out.println("Digite o nome do vendedor responsável pela venda: ");

		String nome = sc.nextLine();

		for (Vendedores vendedor : vendedores) {

			vendedorResponsavel = vendedor;

		}

		System.out.println("Digite o CPF do cliente comprador: ");

		String cpf = sc.nextLine();

		for (Clientes cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				clienteComprador = cliente;
			}
		}
		
		Venda.setContador(Venda.getContador() + 1);

		vendas.add(new Venda(veiculoVendido, vendedorResponsavel, clienteComprador, dataDaVenda));

	}

	public void buscar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da venda que deseja buscar: ");
		int id = sc.nextInt();

		vendas.get(id);

	}

	
	public void excluir() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do cliente que deseja excluir: ");
		int id = sc.nextInt() - 1;
		vendas.remove(id);

	}

}
