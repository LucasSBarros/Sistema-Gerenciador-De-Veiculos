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

	public static boolean validarId(int id) {
		return id >= 0 && id < vendedor.size();

	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o CPF do vendedor: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Digite o telefone do vendedor: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		Vendedores.setContador(Vendedores.getContador() + 1);

		vendedor.add(new Vendedores(nome, cpf, telefone));

		System.out.println("Vendedor cadastrado com sucesso!\n");

	}

	@Override
	public void buscar() {

		boolean localizado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor que deseja buscar: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		for (Vendedores vendedor : vendedor) {

			if (vendedor.getNome().equals(nome)) {
				System.out.println(vendedor.toString());
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("Nome informado não localizado!\n");
		}

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do vendedor que deseja alterar: ");
		
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

		System.out.println("Altere o nome do vendedor: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o CPF do vendedor: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Altere o telefone do vendedor: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		vendedor.set(id, new Vendedores(nome, cpf, telefone));

		System.out.println("Vendedor alterado com sucesso!\n");

	}

	@Override
	public void excluir() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do vendedor que deseja excluir: ");
		
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

		vendedor.remove(id);

		System.out.println("Vendedor excluído com sucesso!\n");

	}

	public static List<Vendedores> getVendedor() {
		return vendedor;
	}

	public static void setVendedor(List<Vendedores> vendedor) {
		ControladorVendedor.vendedor = vendedor;
	}

}
