package javaPooHeranca;

import java.util.Scanner;

import dia5JavaPOO.Empregado;
import dia6JavaPOO.telefone;

public class testaAnimal {

	public static void main(String[] args) {
		
		int op=1;
		
		Scanner read = new Scanner(System.in);
		Preguica preguica = new Preguica("Pular");
		Cachorro cachorro  = new Cachorro();
		Cavalo cavalo = new Cavalo();
		
		Animal animal = null;
		
		
		
		
		System.out.println("\nDigite o animal do qual você quer ver as informações: ");
		System.out.println("\n1)Digite 1 para Cachorro: ");
		System.out.println("\n2)Digite 2 para Cavalo: ");
		System.out.println("\n3)nDigite 3 para Preguiça: ");
		System.out.println("\n4)Digite 0 para sair: ");
		op = read.nextInt();
		
		switch(op){
		case 1:
			 animal = cachorro;
			break;
		
		case 2:
			animal = cavalo;
			break;
		
		case 3:
			animal = preguica;
			break;
		
		case 0:
			System.out.println("Obrigado pela preferência!!!");
			break;
			
		default:
			System.out.println("Número errado, digite novamente!!");
			break;
		
		}
		
		if(animal!=null) 
		{
		animal.imprimirInfo();
		System.out.println("O som do deste animal é: ");
		animal.som("");
		if(animal == cachorro || animal == cavalo) {
			System.out.println("E a habilidade deste animal é: ");
			animal.imprimirHabilidade();
		}
		else if(animal == preguica) {
			System.out.println("E a habilidade deste animal é: ");
			((Preguica)animal).HabilidadePreguica();
		}
		}
	
}
	

}
