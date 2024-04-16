package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Vendedores;

public class ControladorVendedor implements CBAE {

	private static List<Vendedores> vendedor;

	public ControladorVendedor() {
		this.vendedor = new ArrayList<>();
	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor: ");
		String nome = sc.nextLine();
		System.out.println("Digite o CPF do vendedor: ");
		String cpf = sc.nextLine();
		System.out.println("Digite o telefone do vendedor: ");
		String telefone = sc.nextLine();

		Vendedores.setContador(Vendedores.getContador() + 1);

		vendedor.add(new Vendedores(nome, cpf, telefone));

	}

	@Override
	public void excluir() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do vendedor que deseja excluir: ");
		int id = sc.nextInt() - 1;
		vendedor.remove(id);

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do vendedor que deseja alterar: ");
		int id = sc.nextInt() - 1;

		sc.nextLine();

		System.out.println("Altere o nome do vendedor: ");
		String nome = sc.nextLine();
		System.out.println("Altere o CPF do vendedor: ");
		String cpf = sc.nextLine();
		System.out.println("Altere o telefone do vendedor: ");
		String telefone = sc.nextLine();

		vendedor.set(id, new Vendedores(nome, cpf, telefone));

	}

	@Override
	public void buscar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor que deseja buscar: ");
		String nome = sc.nextLine();

		for (Vendedores vendedor : vendedor) {

			if (vendedor.getNome().equals(nome)) {
				System.out.println(vendedor.toString());
			}

		}

	}
	
	public static List<Vendedores> getVendedor() {
		return vendedor;
	}
	
	public static void setVendedor(List<Vendedores> vendedor) {
		ControladorVendedor.vendedor = vendedor;
	}

}
