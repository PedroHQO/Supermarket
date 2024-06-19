package com.br.letsCode.implementation;

public class SupermercadoArray implements Supermercado {

	private final String[] items;
	
	private int lastIndex;
	
	
	
	public SupermercadoArray(final int size) {// antes estava public SupermercadoArray( final int size) Pq esta errado?
		//Inicializando um vetor items
		items = new String[size];
		lastIndex = -1;
	}
	
	




	//Assinatura dos metodos da interface
	@Override
	public void add(String item) {
		// TODO Auto-generated method stub
		if(lastIndex == items.length-1) {
			System.err.println("Lista de Supermercado cheia");
		}else {
			lastIndex++;//acrescento o elemnto em uma posição a frente do item
			items[lastIndex] = item;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if(lastIndex < 0) {
			System.out.println("Lista de Supermercado vazia");
		}
		//O for só executa quando for maior ou = a 0
		for(int i = 0; i <= lastIndex; i++) {
			System.out.println(i + " - " + items[i]);//Mostrando a posição dos items adicionados
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	

	@Override
	public void delete(final int index) {
		// TODO Auto-generated method stub
		if(index >= 0 && index <= lastIndex) {
			shift(index);
			lastIndex--; // ultimo elemento é decrementado
		}else {
			System.err.println("Índice inválido: " + index);
		}
		
	}




	private void shift(int index) {
		//Puxando os elemntros da direit para a esquerda
		for(int i = index; i < lastIndex; i++ ) {
			items[i] = items[i+1];
		}
		
		
	}

}
