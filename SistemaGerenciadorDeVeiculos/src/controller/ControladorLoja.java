package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Clientes;
import models.Lojas;

public class ControladorLoja implements CBAE {

	private static List<Lojas> loja;

	public ControladorLoja() {
		this.loja = new ArrayList<>();
	}

	@Override
	public void cadastrar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da loja: ");
		String nome = sc.nextLine();
		System.out.println("Digite o endereço da loja: ");
		String endereco = sc.nextLine();
		System.out.println("Digite o Telefone da loja: ");
		String telefone = sc.nextLine();

		Lojas.setContador(Lojas.getContador() + 1);

		loja.add(new Lojas(nome, endereco, telefone));

	}

	@Override
	public void excluir() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da loja que deseja excluir: ");
		int id = sc.nextInt() - 1;
		loja.remove(id);

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID da loja que deseja alterar: ");
		int id = sc.nextInt() - 1;

		sc.nextLine();

		System.out.println("Altere o nome da loja: ");
		String nome = sc.nextLine();
		System.out.println("Altere o endereço da loja: ");
		String cpf = sc.nextLine();
		System.out.println("Altere o telefone da loja: ");
		String telefone = sc.nextLine();

		loja.set(id, new Lojas(nome, cpf, telefone));

	}

	@Override
	public void buscar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lista das lojas cadastradas: \n");

		for (Lojas loja : loja) {

			System.out.println(loja.toString());

		}

	}
}
