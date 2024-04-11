package views;

import java.util.Scanner;

public class Menu {

	
	
	
	public int interfaceUsuario (){

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma das seguintes opções:\n"
				+ "Opção 1: Frente de Loja\n."
				+ "Opção 2: Manutenção no Cadastro\n"
				+ "Opção 3: Sair\n");

		int opcao = sc.nextInt();

		if (opcao == 3) {

			System.out.println("Encerramento ...");

		} 
		return opcao;

	}
/*
	public int frenteDeLoja() {

		return opcao;
	}
	
	public int manutencaoNoCadastro() {

		return opcao;
	}

*/

}
