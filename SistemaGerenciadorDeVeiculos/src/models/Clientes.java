package models;

public class Clientes extends Pessoa {

	private int id;
	private static int contador;

	public Clientes(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		this.contador = contador;
		this.id = contador;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Clientes.contador = contador;
	}

	@Override
	public String toString() {
		return "\nID do Cliente: " + getId() + 
				"\nNome:  " + getNome() + 
				"\nCPF: " + getCpf() + 
				"\nTelefone: " + getTelefone() + 
				"\n";
	}

}