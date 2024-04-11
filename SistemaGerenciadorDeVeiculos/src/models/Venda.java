package models;

import java.text.SimpleDateFormat;

public class Venda {
	
	private String veiculoVendido;
	private String vendedorResponsavel;
	private String clienteComprador;
	private SimpleDateFormat dataDaVenda;
	
	public Venda(String veiculoVendido, String vendedorResponsavel, String clienteComprador,
			SimpleDateFormat dataDaVenda) {
		super();
		this.veiculoVendido = veiculoVendido;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
		dataDaVenda = new SimpleDateFormat("[dd/MM/yyyy - HH:mm]");
	}

	public String getVeiculoVendido() {
		return veiculoVendido;
	}

	public String getVendedorResponsavel() {
		return vendedorResponsavel;
	}

	public String getClienteComprador() {
		return clienteComprador;
	}

	public SimpleDateFormat getDataDaVenda() {
		return dataDaVenda;
	}

	public void setVeiculoVendido(String veiculoVendido) {
		this.veiculoVendido = veiculoVendido;
	}

	public void setVendedorResponsavel(String vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}

	public void setClienteComprador(String clienteComprador) {
		this.clienteComprador = clienteComprador;
	}

	public void setDataDaVenda(SimpleDateFormat dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}

}
