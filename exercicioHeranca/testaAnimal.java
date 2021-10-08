package javaPooHeranca;

import java.util.Scanner;

import dia5JavaPOO.Empregado;

public class testaAnimal {

	public static void main(String[] args) {
		
		int n1,n2,n3,op=1;
		String nome1,nome2,nome3;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o nome do cachorro: ");
		nome1 = read.next();
		System.out.println("Digite a idade do cachorro: ");
		n1 = read.nextInt();
		System.out.println("Digite o nome do cavalo: ");
		nome2 = read.next();
		System.out.println("Digite a idade do cavalo: ");
		n2 = read.nextInt();
		System.out.println("Digite o nome da preguiça : ");
		nome3 = read.next();
		System.out.println("Digite a idade da preguiça: ");
		n3 = read.nextInt();
		
		Animal[] lista = new Animal [3];
		
		lista[0] = new Cachorro(nome1,n1,"Au au","Correr");
		lista[1] = new Cavalo(nome2,n2,"iiirrrrí","Correr");
		lista[2] = new Preguica(nome3,n3,"uuh uuh","Subir em árvores");
		/*Cachorro cachorro = new Cachorro(nome1,n1,"Au au","Correr");
		Cavalo cavalo = new Cavalo(nome2,n2,"iiirrrrí","Correr");
		Preguica preguica = new Preguica(nome3,n3,"uuh uuh","Subir em árvores");*/
		
		while(op!=0) {
		System.out.println("\nDigite o animal do qual você quer ver as informações: ");
		System.out.println("\n1)Digite 1 para Cachorro: ");
		System.out.println("\n2)Digite 2 para Cavalo: ");
		System.out.println("\n3)nDigite 3 para Preguiça: ");
		System.out.println("\n4)Digite 0 para sair: ");
		op = read.nextInt();
		
		switch(op){
		case 1:
			((Cachorro) lista[0]).imprimirInfo();
			break;
		
		case 2:
			((Cavalo) lista[1]).imprimirInfo();
			break;
		
		case 3:
			((Preguica) lista[2]).imprimirInfo();
			break;
		
		case 0:
			System.out.println("Obrigado pela preferência!!!");
			break;
			
		default:
			System.out.println("Número errado, digite novamente!!");
			break;
		
		}
		
	/*	((Cachorro) lista[0]).imprimirInfo();
		((Cavalo) lista[1]).imprimirInfo();
		((Preguica) lista[2]).imprimirInfo();*/
	}
	}
	

}
