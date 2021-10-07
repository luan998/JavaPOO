package exerciciosPOO;

public class cliente {
	
	private String ClienteNome;
	private double GastoCompras;
	
	public cliente(String nome, double compras){
		this.setClienteNome(nome);
		this.setGastoCompras(compras);
	}
	
	

	public String getClienteNome() {
		return ClienteNome;
	}

	public void setClienteNome(String clienteNome) {
		ClienteNome = clienteNome;
	}

	public double getGastoCompras() {
		return GastoCompras;
	}

	public void setGastoCompras(double gastoCompras) {
		GastoCompras = gastoCompras;
	}
	
	public void DescontoEmCompras(double desconto) {
		desconto = GastoCompras/50;
		System.out.println("\nE tem "+desconto+"% de desconto na próxima compra.");
	}
	
	public void Imprimir()
	{
		System.out.println("\nO(a) "+ClienteNome+" gastou "+GastoCompras+" em compras.");
	}
}
