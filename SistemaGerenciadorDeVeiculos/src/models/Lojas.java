package models;

public class Lojas {
	
	private String nome;
	private String endereço;
	private String telefone;
	
	public Lojas(String nome, String endereço, String telefone) {
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
