package javaPooHeranca;

public class Cachorro extends Animal {

	private String habilidadeCachorro;
	
	public Cachorro(String nome, int idade, String som, String habilidade) {
		super(nome,idade,som);
		this.habilidadeCachorro = habilidade;
		
	}

	public String getHabilidadeCachorro() {
		return habilidadeCachorro;
	}

	public void setHabilidadeCachorro(String habilidadeCachorro) {
		this.habilidadeCachorro = habilidadeCachorro;
	}
	public void imprimirInfo()
	{
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos, produz o som: "+getSom()+", e sua habilidade é: "+habilidadeCachorro);
	}
}
