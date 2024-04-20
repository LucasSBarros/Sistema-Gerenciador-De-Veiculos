package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.TipoDeVeiculos;

public class ControladorVeiculos implements CBAE {

	private static List<TipoDeVeiculos> veiculo;

	public ControladorVeiculos() {
		this.veiculo = new ArrayList<>();
	}

	public static boolean validarId(int id) {
		return id >= 0 && id < veiculo.size();

	}

	@Override
	public void cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a marca do veículo: ");
		String marca = sc.nextLine();

		while (!Validadores.validarMarca(marca)) {
			System.out.println("Marca inválida, tente novamente: ");
			marca = sc.nextLine();
		}

		System.out.println("Digite o modelo do veículo: ");
		String modelo = sc.nextLine();

		while (!Validadores.validarModelo(modelo)) {
			System.out.println("Modelo inválido, tente novamente: ");
			modelo = sc.nextLine();
		}

		System.out.println("Digite a placa do veículo: ");
		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		System.out.println("Digite a categoria do veículo: ");
		String categoria = sc.nextLine();

		while (!Validadores.validarCategoria(categoria)) {
			System.out.println("Categoria inválida, tente novamente: ");
			categoria = sc.nextLine();
		}

		System.out.println("Digite o ano do veículo: ");
		
		while (!sc.hasNextInt()) {
			System.out.println("Ano inválido, tente novamente: ");
            sc.next(); 
		}
		
		int ano = sc.nextInt();
		
		while (!Validadores.validarAno(ano)) {
			System.out.println("Ano inválido, tente novamente: ");
			ano = sc.nextInt();
		}

		System.out.println("Digite o preco do veículo: ");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Preço inválido, tente novamente: ");
            sc.next(); 
		}
		
		double preco = sc.nextDouble();

		while (!Validadores.validarPreco(preco)) {
			System.out.println("Preço inválido, tente novamente: ");
			preco = sc.nextDouble();
		}

		sc.nextLine();

		System.out.println("Digite uma descrição para o veículo: ");
		String descricao = sc.nextLine();
		
		while (!Validadores.validarDescricao(descricao)) {
			System.out.println("Preço inválido, tente novamente: ");
			descricao = sc.nextLine();
		}

		TipoDeVeiculos.setContador(TipoDeVeiculos.getContador() + 1);

		veiculo.add(new TipoDeVeiculos(marca, modelo, ano, placa, preco, categoria, descricao));

		System.out.println("Veículo cadastrado com sucesso!\n");

	}

	@Override
	public void buscar() {

		boolean localizado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a placa do veículo que deseje buscar: ");
		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		for (TipoDeVeiculos veiculo : veiculo) {

			if (veiculo.getPlaca().equals(placa)) {
				System.out.println(veiculo.toString());
				localizado = true;
			}

		}

		if (localizado == false) {

			System.out.println("Placa informada não localizada!\n");
		}

	}

	@Override
	public void alterar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do veículo que deseja alterar: ");
		
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

		System.out.println("Altere a marca do veículo: ");
		String marca = sc.nextLine();

		while (!Validadores.validarMarca(marca)) {
			System.out.println("Marca inválida, tente novamente: ");
			marca = sc.nextLine();
		}

		System.out.println("Altere o modelo do veículo: ");
		String modelo = sc.nextLine();

		while (!Validadores.validarModelo(modelo)) {
			System.out.println("Modelo inválido, tente novamente: ");
			modelo = sc.nextLine();
		}

		System.out.println("Altere a placa do veículo: ");
		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		System.out.println("Altere a categoria do veículo: ");
		String categoria = sc.nextLine();

		while (!Validadores.validarCategoria(categoria)) {
			System.out.println("Categoria inválida, tente novamente: ");
			categoria = sc.nextLine();
		}

		System.out.println("Altere o ano do veículo: ");
		int ano = sc.nextInt();

		while (!Validadores.validarAno(ano)) {
			System.out.println("Ano inválido, tente novamente: ");
			ano = sc.nextInt();
		}

		System.out.println("Altere o preco do veículo: ");
		double preco = sc.nextDouble();

		while (!Validadores.validarPreco(preco)) {
			System.out.println("Preço inválido, tente novamente: ");
			preco = sc.nextDouble();
		}

		sc.nextLine();

		System.out.println("Altere a descrição do veículo: ");
		String descricao = sc.nextLine();

		veiculo.set(id, new TipoDeVeiculos(marca, modelo, ano, placa, preco, categoria, descricao));

		System.out.println("Veículo alterado com sucesso!\n");

	}

	@Override
	public void excluir() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do veículo que deseja excluir: ");
		
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

		veiculo.remove(id);

		System.out.println("Veículo excluído com sucesso!\n");

	}

	public static List<TipoDeVeiculos> getVeiculo() {
		return veiculo;
	}

	public static void setVeiculo(List<TipoDeVeiculos> veiculo) {
		ControladorVeiculos.veiculo = veiculo;
	}

}
