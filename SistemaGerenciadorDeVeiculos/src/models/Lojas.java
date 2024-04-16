package models;

public class Lojas {

	private String nome;
	private String endereco;
	private String telefone;
	private int id;
	private static int contador;

	public Lojas(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.contador = contador;
		this.id = contador;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		Lojas.contador = contador;
	}

	@Override
	public String toString() {
		return "\nID da Loja: " + getId() + 
				"\nNome: " + getNome() + 
				"\nEndereço: " + getEndereco() + 
				"\nTelefone: " + getTelefone() + 
				"]\n";
	}

}
