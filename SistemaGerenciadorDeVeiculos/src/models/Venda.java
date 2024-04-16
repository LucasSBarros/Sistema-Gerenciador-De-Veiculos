package models;

import java.text.SimpleDateFormat;

public class Venda {

	private TipoDeVeiculos veiculoVendido;
	private Vendedores vendedorResponsavel;
	private Clientes clienteComprador;
	private SimpleDateFormat dataDaVenda;
	private int id;
	private static int contador;

	public Venda(TipoDeVeiculos veiculoVendido, Vendedores vendedorResponsavel, Clientes clienteComprador, SimpleDateFormat dataDaVenda) {
		this.veiculoVendido = veiculoVendido;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
		this.dataDaVenda = dataDaVenda;
		this.contador = contador;
		this.id = contador;
	}



	public TipoDeVeiculos getVeiculoVendido() {
		return veiculoVendido;
	}

	public void setVeiculoVendido(TipoDeVeiculos veiculoVendido) {
		this.veiculoVendido = veiculoVendido;
	}

	public Vendedores getVendedorResponsavel() {
		return vendedorResponsavel;
	}

	public void setVendedorResponsavel(Vendedores vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}

	public Clientes getClienteComprador() {
		return clienteComprador;
	}

	public void setClienteComprador(Clientes clienteComprador) {
		this.clienteComprador = clienteComprador;
	}

	public SimpleDateFormat getDataDaVenda() {
		return dataDaVenda;
	}

	public void setDataDaVenda(SimpleDateFormat dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
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
		Venda.contador = contador;
	}
	
	@Override
	public String toString() {
		return "ID da venda: " + getId() + 
				"Veiculo Vendido:" + getVeiculoVendido() + 
				"Vendedor Responsavel: " + getVendedorResponsavel() + 
				"Cliente Comprador" + getClienteComprador() + 
				"Data Da Venda" + getDataDaVenda() + 
				"]";
	}
	
}
