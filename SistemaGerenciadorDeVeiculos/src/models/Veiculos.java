package models;

public class Veiculos {
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private double preco;
	
	public Veiculos(String marca, String modelo, int ano, String placa, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
