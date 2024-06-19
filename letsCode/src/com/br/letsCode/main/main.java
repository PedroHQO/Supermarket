package com.br.letsCode.main;

import java.util.Scanner;

import com.br.letsCode.implementation.Supermercado;
import com.br.letsCode.implementation.SupermercadoArray;

public class main {

	private final static int SIZE = 3;
	
	public void SupermercadoArray() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Supermercado supermarket = new SupermercadoArray(SIZE);
		int opcao;
		do {
			System.out.println("\nLista de Compras");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Sair");
			System.out.println("EScolha uma opção: ");
			opcao = scanner.nextInt();
		
			switch(opcao) {
			case 1:
				System.out.println(("Digite o tem a ser inserido: "));
				String item = scanner.next();//Só palavras simples
				supermarket.add(item);
				break;
			case 2:
				supermarket.print();
				break;
			case 3:
				System.out.println("Digite a posição do item a ser removido: ");
				int index = scanner.nextInt();
				supermarket.delete(index);
				break;
			case 4:
				System.out.println("Saindo do programas...");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha novamente");
				break;
			
			}
		
		}while(opcao != 4);
		
		scanner.close();

	}

}
