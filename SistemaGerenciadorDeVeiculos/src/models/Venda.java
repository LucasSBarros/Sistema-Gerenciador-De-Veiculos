package models;

public class Venda {

	private TipoDeVeiculos veiculoVendido;
	private Vendedores vendedorResponsavel;
	private Clientes clienteComprador;
	private String dataDaVenda;
	private int id;
	private static int contador;

	public Venda(TipoDeVeiculos veiculoVendido, Vendedores vendedorResponsavel, Clientes clienteComprador, String dataDaVenda) {
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

	public String getDataDaVenda() {
		return dataDaVenda;
	}

	public void setDataDaVenda(String dataDaVenda) {
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
		return "\nID da venda: " + getId() + 
				"\nVeiculo Vendido: " + getVeiculoVendido() + 
				"\nVendedor Responsavel: " + getVendedorResponsavel() + 
				"\nCliente Comprador: " + getClienteComprador() + 
				"\nData Da Venda: " + getDataDaVenda() + 
				"\n";
	}
	
}
