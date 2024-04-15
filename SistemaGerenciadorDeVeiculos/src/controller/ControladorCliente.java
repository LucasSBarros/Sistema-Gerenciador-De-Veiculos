package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Clientes;

public class ControladorCliente implements CBAE {

	private static List<Clientes> cliente;

	public ControladorCliente() {
		this.cliente = new ArrayList<>();
	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.println("Digite o CPF do cliente: ");
		String cpf = sc.nextLine();
		System.out.println("Digite o telefone do cliente: ");
		String telefone = sc.nextLine();

		Clientes.setContador(Clientes.getContador() + 1);

		cliente.add(new Clientes(nome, cpf, telefone));

	}

	@Override
	public void excluir() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do cliente que deseja excluir: ");
		int id = sc.nextInt() - 1;
		cliente.remove(id);

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do cliente que deseja alterar: ");
		int id = sc.nextInt() - 1;

		sc.nextLine();

		System.out.println("Altere o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.println("Altere o CPF do cliente: ");
		String cpf = sc.nextLine();
		System.out.println("Altere o telefone do cliente: ");
		String telefone = sc.nextLine();

		cliente.set(id, new Clientes(nome, cpf, telefone));

	}

	@Override
	public void buscar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o CPF do cliente que deseja buscar: ");
		String cpf = sc.nextLine();

		for (Clientes cliente : cliente) {

			if (cliente.getCpf().equals(cpf)) {
				System.out.println(cliente.toString());
			}

		}

	}

}
