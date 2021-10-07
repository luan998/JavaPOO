package exerciciosPOO;

import java.util.Scanner;

import dia5JavaPOO.Empregado;

public class TesteEletronico {

	public static void main(String[] args) {
		
		String n1,n2,n3;
		double x,v1,v2,v3;
		Scanner read = new Scanner(System.in);
		
		eletronico lista[] = new eletronico[3];
		
		lista[0] = new eletronico(" ",200);
		lista[1] = new eletronico(" ",180);
		lista[2] = new eletronico(" ",800);
		
	
		System.out.println("Digite o nome primeiro do eletrônico: ");
		n1 = read.next();
		lista[0].setProduto(n1);
		System.out.println("Digite o valor do primeiro eletrônico: ");
		v1 = read.nextDouble();
		lista[0].setPreco(v1);
		System.out.println("Digite o nome do segundo eletrônico: ");
		n2 = read.next();
		lista[1].setProduto(n2);
		System.out.println("Digite o valor do segundo eletrônico: ");
		v2 = read.nextDouble();
		lista[1].setPreco(v2);
		System.out.println("Digite o nome do terceiro eletrônico: ");
		n3 = read.next();
		lista[2].setProduto(n3);
		System.out.println("Digite o valor do terceiro eletrônico: ");
		v3 = read.nextDouble();
		lista[2].setPreco(v3);
			

		for(eletronico roda:lista)
		{
			roda.Imprimir();
		}

	}

}
