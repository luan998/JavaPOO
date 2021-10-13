package javaPooHeranca;

public abstract class Animal {
	private String nome;
	private int idade;
	abstract public void som(String som);
	
	public Animal(String nome, int idade) 	
	{
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos.");
	}
	
	public void imprimirHabilidade()
	{
		
		System.out.println("Correr");
	}
	
	
}
