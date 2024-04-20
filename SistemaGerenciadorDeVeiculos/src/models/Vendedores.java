package models;

public class Vendedores extends Pessoa {
	
	private int id;
	private static int contador;

	public Vendedores(String nome, String cpf, String telefone) {
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
		Vendedores.contador = contador;
	}

	@Override
	public String toString() {
		return "\nID do Vendedor:" + getId() + 
				"\nNome: " + getNome() + 
				"\nCPF: " + getCpf() + 
				"\nTelefone: " + getTelefone() + 
				"\n";
	}
	
}