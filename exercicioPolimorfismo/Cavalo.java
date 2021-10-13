package javaPooHeranca;

public class Cavalo extends Animal {
	

	
	public Cavalo() {
		super("Cavalo",11);
		
		
	}
	
	
	
	public void imprimirInfo()
	{
		System.out.println("\nO "+getNome()+" tem "+ getIdade()+" anos.");
	}
	@Override
	public void som(String som){
		System.out.println("IHIHIHIHIHI");
	}
}
