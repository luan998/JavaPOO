package exerciciosPOO;

public class aviao {
	
	private String Marca;
	private double Ano;
	private double Velocidade;
	private double Combustivel;
	
	public aviao(String marca, double ano, double velocidade, double combustivel) {
		this.setMarca(marca);
		this.setAno(ano);
		this.setVelocidade(velocidade);
		this.setCombustivel(combustivel);
	}
	
	public void Imprimir()
	{
		System.out.println("\nO avião da "+Marca+" produzido no ano de "+Ano+" tem uma velocidade média de "
	+Velocidade+"Km/h e gasta "+Combustivel+" litros de gasolina por hora.");
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getAno() {
		return Ano;
	}

	public void setAno(double ano) {
		Ano = ano;
	}

	public double getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(double velocidade) {
		Velocidade = velocidade;
	}

	public double getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(double combustivel) {
		Combustivel = combustivel;
	}
	
	
	
}
