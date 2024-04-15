package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.tipoDeVeiculos;

public class ControladorVeiculos implements CBAE {

	private static List<tipoDeVeiculos> veiculo;

	public ControladorVeiculos() {
		this.veiculo = new ArrayList<>();
	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a marca do veículo: ");
		String marca = sc.nextLine();
		System.out.println("Digite o modelo do veículo: ");
		String modelo = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite o ano do veículo: ");
		int ano = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a placa do veículo: ");
		String placa = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite o preco do veículo: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a categoria do veículo: ");
		String categoria = sc.nextLine();
		System.out.println("Digite uma descrição para o veículo: ");
		String descricao = sc.nextLine();
		tipoDeVeiculos.setContador(tipoDeVeiculos.getContador() + 1);

		veiculo.add(new tipoDeVeiculos(marca, modelo, ano, placa, preco, categoria, descricao));

	}

	@Override
	public void excluir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do veículo que deseja excluir: ");
		int id = sc.nextInt() - 1;
		veiculo.remove(id);

	}

	@Override
	public void alterar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do veículo que deseja alterar: ");
		int id = sc.nextInt() - 1;

		sc.nextLine();

		System.out.println("Altere a marca do veículo: ");
		String marca = sc.nextLine();
		System.out.println("Altere o modelo do veículo: ");
		String modelo = sc.nextLine();
		sc.nextLine();
		System.out.println("Altere o ano do veículo: ");
		int ano = sc.nextInt();
		sc.nextLine();
		System.out.println("Altere a placa do veículo: ");
		String placa = sc.nextLine();
		sc.nextLine();
		System.out.println("Altere o preco do veículo: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		System.out.println("Altere a categoria do veículo: ");
		String categoria = sc.nextLine();
		System.out.println("Altere uma descrição para o veículo: ");
		String descricao = sc.nextLine();

		veiculo.set(id, new tipoDeVeiculos(marca, modelo, ano, placa, preco, categoria, descricao));

	}

	@Override
	public void buscar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a placa do veículo que deseje buscar: ");
		String placa = sc.nextLine();

		for (tipoDeVeiculos veiculo : veiculo) {

			if (veiculo.getPlaca().equals(placa)) {
				System.out.println(veiculo.toString());
			}

		}

	}

}
