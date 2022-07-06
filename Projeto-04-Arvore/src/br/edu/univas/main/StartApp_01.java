package br.edu.univas.main;

import br.edu.univas.vo.ArvoreBinaria;
import br.edu.univas.vo.Entidade;
import br.edu.univas.vo.No;

public class StartApp_01 {
	
	public static void main(String[] args) {
		
		// árvore vazia
		ArvoreBinaria arvore = new ArvoreBinaria();
		System.out.println("Teste 01");
		arvore.imprimir();
		
		Entidade entidadeD = new Entidade ("D");
		No noD = arvore.criarNovoNo(entidadeD);
		
		// Criar o nó B
		Entidade entidadeB = new Entidade("B");
		No noB = arvore.criarNovoNo(entidadeB);
		
		Entidade entidadeE = new Entidade ("E");
		No noE = arvore.criarNovoNo(entidadeE);
		Entidade entidadeF = new Entidade ("F");
		No noF = arvore.criarNovoNo(entidadeF);
		
		// Criar o nó C
		Entidade entidadeC = new Entidade("C");
		No noC = arvore.criarSubArvore(entidadeC, noE, noF);
		
		// Criar o nó A
		Entidade entidadeA = new Entidade("A");
		arvore.criarRaiz(entidadeA, noB, null);
		System.out.println("Teste 02");
		arvore.imprimir();
		
		
		
	}

}
