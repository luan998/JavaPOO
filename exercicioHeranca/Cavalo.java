package javaPooHeranca;

public class Cavalo extends Animal {
	
private String habilidadeCavalo;
	
	public Cavalo(String nome, int idade, String som, String habilidade) {
		super(nome,idade,som);
		this.habilidadeCavalo = habilidade;
		
	}

	public String getHabilidadeCavalo() {
		return habilidadeCavalo;
	}

	public void setHabilidadeCavalo(String habilidadeCavalo) {
		this.habilidadeCavalo = habilidadeCavalo;
	}
	public void imprimirInfo()
	{
		System.out.println("\nO cavalo "+getNome()+" tem "+getIdade()+" anos, produz o som: "+getSom()+", e sua habilidade é: "+habilidadeCavalo);
	}
}
