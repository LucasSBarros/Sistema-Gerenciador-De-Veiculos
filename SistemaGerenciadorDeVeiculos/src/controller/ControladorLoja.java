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

	public static boolean validarId(int id) {
		return id >= 0 && id < loja.size();

	}

	@Override
	public void cadastrar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da loja: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o endereço da loja: ");
		String endereco = sc.nextLine();

		while (!Validadores.validarEndereco(endereco)) {
			System.out.println("Endereco inválido, tente novamente: ");
			endereco = sc.nextLine();
		}

		System.out.println("Digite o Telefone da loja: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		Lojas.setContador(Lojas.getContador() + 1);

		loja.add(new Lojas(nome, endereco, telefone));

		System.out.println("Loja cadastrada com sucesso!\n");

	}

	@Override
	public void buscar() {

		boolean localizado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista das lojas cadastradas: \n");

		for (Lojas loja : loja) {

			System.out.println(loja.toString());
			localizado = true;
		}

		if (localizado == false) {

			System.out.println("Nenhuma loja foi localizada!\n");
		}

	}

	@Override
	public void alterar() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID da loja que deseja alterar: ");
		
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

		System.out.println("Altere o nome da loja: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o endereço da loja: ");
		String endereco = sc.nextLine();

		while (!Validadores.validarEndereco(endereco)) {
			System.out.println("Endereco inválido, tente novamente: ");
			endereco = sc.nextLine();
		}

		System.out.println("Altere o telefone da loja: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		loja.set(id, new Lojas(nome, endereco, telefone));

		System.out.println("Loja cadastrada com sucesso!\n");

	}

	@Override
	public void excluir() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID da loja que deseja excluir: ");
		
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

		loja.remove(id);

		System.out.println("Loja excluída com sucesso!\n");

	}

	public static List<Lojas> getLoja() {
		return loja;
	}

	public static void setLoja(List<Lojas> loja) {
		ControladorLoja.loja = loja;
	}

}
