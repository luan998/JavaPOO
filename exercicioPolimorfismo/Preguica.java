package javaPooHeranca;

public class Preguica extends Animal {
private String habilidadePreguica;
	
	public Preguica( String habilidade) {
		super("Preguiça",7);
		this.habilidadePreguica = habilidade;
		
	}

	public String getHabilidadePreguica() {
		return habilidadePreguica;
	}

	public void setHabilidadePreguica(String habilidadePreguica) {
		this.habilidadePreguica = habilidadePreguica;
	}
	public void imprimirInfo()
	{
		System.out.println("\nA "+getNome()+" tem "+getIdade()+" anos.");
	}
	
	@Override
	public void som(String som){
		System.out.println("Ye...."+som);
	}
	
	public void HabilidadePreguica() {
		System.out.print("Pular");
	}
}
