package models;

public class tipoDeVeiculos extends Veiculos {
	
	private String categoria;
	private String descricao;
	
	public tipoDeVeiculos(String marca, String modelo, int ano, String placa, double preco, String categoria, String descricao) {
		super(marca, modelo, ano, placa, preco);
		this.categoria = categoria;
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
