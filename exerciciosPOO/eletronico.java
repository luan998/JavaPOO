package exerciciosPOO;

public class eletronico {
	
	private String Produto;
	private double Preco;

	
	public eletronico(String produto, double preco){
		this.setProduto(produto);
		this.setPreco(preco);
		
	}
	
	public void Imprimir() {
		System.out.println("O produto: "+Produto+" está custando  "+Preco);
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}


	
	
	
}
