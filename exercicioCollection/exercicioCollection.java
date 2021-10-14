package CollectionsAula;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class exercicioCollection {
public static void main(String[] args) {
	
	
	int op;
	Scanner read  = new Scanner(System.in);
	ArrayList<String> estoque = new ArrayList();
	
	//Dia e hora
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Calendar calendario = Calendar.getInstance();
	System.out.println(df.format(calendario.getTime()));
	
	do {
		System.out.println("\nDigite a operação que deseja realizar.");
		System.out.println("\n1) Adicionar novo produto ao estoque.");
		System.out.println("\n2) Remover um produto ao estoque.");
		System.out.println("\n3) Atualizar um produto do estoque.");
		System.out.println("\n4) Mostrar todo o estoque.");
		op = read.nextInt();
		
		switch (op) {
		case 1:
			read.nextLine();
			System.out.println("Digite o produto a ser adicionado: ");
			String produto = read.nextLine();
			estoque.add(produto);
			break;
		
		case 2:
			read.nextLine();
			System.out.println("Digite o produto a ser removido: ");
			String removido = read.nextLine();
			
			if(estoque.contains(removido))
			{
				estoque.remove(removido);
			}
			else {
				System.out.println("Produto inexistente no estoque.");
			}
			break;
			
		case 3:
			read.nextLine();
			System.out.println("Digite o produto a ser atualizado: ");
			String att = read.nextLine();
			
			if(estoque.contains(att)) {
			System.out.println("Você quer substituir "+att+" por?");
			String novo = read.nextLine();
			estoque.remove(att);
			estoque.add(novo);
			
			}
			else {
				System.out.println("Produto não disponível no estoque!!!");
			}
			
			break;
			
		case 4:
			read.nextLine();
			System.out.println("Lista de produtos no estoque: ");
			System.out.println(estoque);
			break;
			
		default:
			System.err.println("Número inválido!!!");
			break;
		
		}
		
	}
	
	while(op!=0);
		System.out.println("Obrigado pela preferência!!!");
	}
}
