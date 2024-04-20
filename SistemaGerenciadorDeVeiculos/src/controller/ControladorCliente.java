package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Clientes;

public class ControladorCliente implements CBAE {

	private static List<Clientes> cliente;

	public ControladorCliente() {
		ControladorCliente.cliente = new ArrayList<>();
	}

	public static boolean validarId(int id) {
		return id >= 0 && id < cliente.size();

	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o CPF do cliente: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Digite o telefone do cliente: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		Clientes.setContador(Clientes.getContador() + 1);

		cliente.add(new Clientes(nome, cpf, telefone));

		System.out.println("Cliente cadastrado com sucesso!\n");

	}

	@Override
	public void buscar() {

		boolean localizado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o CPF do cliente que deseja buscar: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		for (Clientes cliente : cliente) {

			if (cliente.getCpf().equals(cpf)) {
				System.out.println(cliente.toString());
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("CPF informado não localizado!\n");
		}

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do cliente que deseja alterar: ");
		
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

		sc.nextLine();

		System.out.println("Altere o nome do cliente: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o CPF do cliente: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Altere o telefone do cliente: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		cliente.set(id, new Clientes(nome, cpf, telefone));

		System.out.println("Cliente alterado com sucesso!\n");

	}

	@Override
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

		cliente.remove(id);

		System.out.println("Cliente excluído com sucesso!\n");

	}

	public static List<Clientes> getCliente() {
		return cliente;
	}

	public void setCliente(List<Clientes> cliente) {
		ControladorCliente.cliente = cliente;
	}

}
