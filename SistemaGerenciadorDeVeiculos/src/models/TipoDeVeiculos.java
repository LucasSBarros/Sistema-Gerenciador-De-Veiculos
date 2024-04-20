package models;

public class TipoDeVeiculos extends Veiculos {

	private String categoria;
	private String descricao;
	private int id;
	private static int contador;

	public TipoDeVeiculos(String marca, String modelo, int ano, String placa, double preco, String categoria,
			String descricao) {
		super(marca, modelo, ano, placa, preco);
		this.categoria = categoria;
		this.descricao = descricao;
		this.contador = contador;
		this.id = contador;
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
		TipoDeVeiculos.contador = contador;
	}

	@Override
	public String toString() {
		return "\nID do Veículo: " + getId() + 
				"\nMarca: " + getMarca() + 
				"\nModelo: " + getModelo() + 
				"\nAno: " + getAno() + 
				"\nPlaca: " + getPlaca() + 
				"\nPreço: " + getPreco() + 
				"\nCategoria: " + getCategoria() + 
				"\nDescricao: " + getDescricao() + 
				"\n";
	}

}
