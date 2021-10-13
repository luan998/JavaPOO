package javaPooHeranca;

public class Cachorro extends Animal {

	
	
	public Cachorro() {
		super("Cachorro",4);
			
	}
	

	
	public void imprimirInfo()
	{
		System.out.println("\nO "+getNome()+" tem "+getIdade()+" anos.");
	}
	
	@Override
	public void som(String som){
		System.out.println("Au au au");
	}
}
