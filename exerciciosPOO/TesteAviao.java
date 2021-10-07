package exerciciosPOO;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String i;
		double v;
		
		aviao aviao1 = new aviao("TAM",2017,295,2700);
		aviao1.Imprimir();
		
		aviao aviao2 = new aviao("GOL",2009,265,2900);
		aviao2.Imprimir();
		System.out.println("\nA velocidade média deste avião foi mudada, digite a nova velocidade média: ");
		v = read.nextDouble();
		while(v<250 || v>330) {
			System.out.println("\nValor inválido, digite a nova velocidade média: ");
			v = read.nextDouble();
		}
		aviao2.setVelocidade(v);
		aviao2.Imprimir();
		
		aviao aviao3 = new aviao("Avianca",2020,290,2800);
		aviao3.Imprimir();
		System.out.println("\nEste avião foi adquirido por outra companhia. \nDigite o nome dela: ");
		i = read.next();
		aviao3.setMarca(i);
		aviao3.Imprimir();

	}

}
